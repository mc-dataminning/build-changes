import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dgs implements AutoCloseable {
   private final cpl a;
   private final Long2ObjectMap<dhg> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dhg c;
   private long d;

   public dgs(cpl $$0) {
      this.a = $$0;
   }

   @Nullable
   public dhg a(gv $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ak()) {
         long $$2 = hy.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dhg)this.b.computeIfAbsent($$2, $$2x -> {
               dgu $$3 = this.a.a(hy.a($$0.u()), hy.a($$0.w()));
               dhg $$4 = $$3.b($$1);
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

   public dey b(gv $$0) {
      dhg $$1 = this.a($$0);
      if ($$1 == null) {
         return csl.a.n();
      } else {
         int $$2 = hy.b($$0.u());
         int $$3 = hy.b($$0.v());
         int $$4 = hy.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dhg $$0 = (dhg)var1.next();
         $$0.b();
      }
   }
}
