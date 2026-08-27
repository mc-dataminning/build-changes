import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class diq implements AutoCloseable {
   private final crt a;
   private final Long2ObjectMap<dje> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dje c;
   private long d;

   public diq(crt $$0) {
      this.a = $$0;
   }

   @Nullable
   public dje a(ht $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ak()) {
         long $$2 = iu.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dje)this.b.computeIfAbsent($$2, $$2x -> {
               dis $$3 = this.a.a(iu.a($$0.u()), iu.a($$0.w()));
               dje $$4 = $$3.b($$1);
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

   public dgw b(ht $$0) {
      dje $$1 = this.a($$0);
      if ($$1 == null) {
         return cuv.a.o();
      } else {
         int $$2 = iu.b($$0.u());
         int $$3 = iu.b($$0.v());
         int $$4 = iu.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dje $$0 = (dje)var1.next();
         $$0.b();
      }
   }
}
