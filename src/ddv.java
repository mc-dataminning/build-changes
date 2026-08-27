import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class ddv implements AutoCloseable {
   private final cmn a;
   private final Long2ObjectMap<dej> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dej c;
   private long d;

   public ddv(cmn $$0) {
      this.a = $$0;
   }

   @Nullable
   public dej a(gu $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ak()) {
         long $$2 = hx.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dej)this.b.computeIfAbsent($$2, $$2x -> {
               ddx $$3 = this.a.a(hx.a($$0.u()), hx.a($$0.w()));
               dej $$4 = $$3.b($$1);
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

   public dcb b(gu $$0) {
      dej $$1 = this.a($$0);
      if ($$1 == null) {
         return cpo.a.n();
      } else {
         int $$2 = hx.b($$0.u());
         int $$3 = hx.b($$0.v());
         int $$4 = hx.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dej $$0 = (dej)var1.next();
         $$0.b();
      }
   }
}
