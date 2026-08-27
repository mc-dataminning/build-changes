import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dgt implements AutoCloseable {
   private final cpm a;
   private final Long2ObjectMap<dhh> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dhh c;
   private long d;

   public dgt(cpm $$0) {
      this.a = $$0;
   }

   @Nullable
   public dhh a(gu $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ak()) {
         long $$2 = hx.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dhh)this.b.computeIfAbsent($$2, $$2x -> {
               dgv $$3 = this.a.a(hx.a($$0.u()), hx.a($$0.w()));
               dhh $$4 = $$3.b($$1);
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

   public dez b(gu $$0) {
      dhh $$1 = this.a($$0);
      if ($$1 == null) {
         return csm.a.n();
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
         dhh $$0 = (dhh)var1.next();
         $$0.b();
      }
   }
}
