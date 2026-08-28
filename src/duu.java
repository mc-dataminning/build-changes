import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class duu implements AutoCloseable {
   private final dcv a;
   private final Long2ObjectMap<dvh> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dvh c;
   private long d;

   public duu(dcv $$0) {
      this.a = $$0;
   }

   @Nullable
   public dvh a(jd $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.an()) {
         long $$2 = kf.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dvh)this.b.computeIfAbsent($$2, $$2x -> {
               duw $$3 = this.a.a(kf.a($$0.u()), kf.a($$0.w()));
               dvh $$4 = $$3.b($$1);
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

   public dta b(jd $$0) {
      dvh $$1 = this.a($$0);
      if ($$1 == null) {
         return dfy.a.o();
      } else {
         int $$2 = kf.b($$0.u());
         int $$3 = kf.b($$0.v());
         int $$4 = kf.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dvh $$0 = (dvh)var1.next();
         $$0.b();
      }
   }
}
