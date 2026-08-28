import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dyr implements AutoCloseable {
   private final dgk a;
   private final Long2ObjectMap<dze> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dze c;
   private long d;

   public dyr(dgk $$0) {
      this.a = $$0;
   }

   @Nullable
   public dze a(ji $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ao()) {
         long $$2 = kk.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dze)this.b.computeIfAbsent($$2, $$2x -> {
               dyt $$3 = this.a.a(kk.a($$0.u()), kk.a($$0.w()));
               dze $$4 = $$3.b($$1);
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

   public dwy b(ji $$0) {
      dze $$1 = this.a($$0);
      if ($$1 == null) {
         return djp.a.m();
      } else {
         int $$2 = kk.b($$0.u());
         int $$3 = kk.b($$0.v());
         int $$4 = kk.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dze $$0 = (dze)var1.next();
         $$0.b();
      }
   }
}
