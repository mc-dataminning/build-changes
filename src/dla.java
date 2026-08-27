import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dla implements AutoCloseable {
   private final ctp a;
   private final Long2ObjectMap<dlo> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dlo c;
   private long d;

   public dla(ctp $$0) {
      this.a = $$0;
   }

   @Nullable
   public dlo a(hx $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = iz.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dlo)this.b.computeIfAbsent($$2, $$2x -> {
               dlc $$3 = this.a.a(iz.a($$0.u()), iz.a($$0.w()));
               dlo $$4 = $$3.b($$1);
               $$4.a();
               return $$4;
            });
            this.d = $$2;
         }

         return this.c;
      } else {
         return null;
      }
   }

   public djg b(hx $$0) {
      dlo $$1 = this.a($$0);
      if ($$1 == null) {
         return cwr.a.o();
      } else {
         int $$2 = iz.b($$0.u());
         int $$3 = iz.b($$0.v());
         int $$4 = iz.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dlo $$0 = (dlo)var1.next();
         $$0.b();
      }
   }
}
