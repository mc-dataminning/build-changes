import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class djh implements AutoCloseable {
   private final csg a;
   private final Long2ObjectMap<djv> b = new Long2ObjectOpenHashMap();
   @Nullable
   private djv c;
   private long d;

   public djh(csg $$0) {
      this.a = $$0;
   }

   @Nullable
   public djv a(hx $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.al()) {
         long $$2 = iy.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (djv)this.b.computeIfAbsent($$2, $$2x -> {
               djj $$3 = this.a.a(iy.a($$0.u()), iy.a($$0.w()));
               djv $$4 = $$3.b($$1);
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

   public dhn b(hx $$0) {
      djv $$1 = this.a($$0);
      if ($$1 == null) {
         return cvh.a.o();
      } else {
         int $$2 = iy.b($$0.u());
         int $$3 = iy.b($$0.v());
         int $$4 = iy.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         djv $$0 = (djv)var1.next();
         $$0.b();
      }
   }
}
