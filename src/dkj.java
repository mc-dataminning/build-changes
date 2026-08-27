import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dkj implements AutoCloseable {
   private final csz a;
   private final Long2ObjectMap<dkx> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dkx c;
   private long d;

   public dkj(csz $$0) {
      this.a = $$0;
   }

   @Nullable
   public dkx a(hv $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.al()) {
         long $$2 = ix.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dkx)this.b.computeIfAbsent($$2, $$2x -> {
               dkl $$3 = this.a.a(ix.a($$0.u()), ix.a($$0.w()));
               dkx $$4 = $$3.b($$1);
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

   public dip b(hv $$0) {
      dkx $$1 = this.a($$0);
      if ($$1 == null) {
         return cwb.a.o();
      } else {
         int $$2 = ix.b($$0.u());
         int $$3 = ix.b($$0.v());
         int $$4 = ix.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dkx $$0 = (dkx)var1.next();
         $$0.b();
      }
   }
}
