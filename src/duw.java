import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class duw implements AutoCloseable {
   private final dcb a;
   private final Long2ObjectMap<dvj> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dvj c;
   private long d;

   public duw(dcb $$0) {
      this.a = $$0;
   }

   @Nullable
   public dvj a(ir $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.an()) {
         long $$2 = jt.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dvj)this.b.computeIfAbsent($$2, $$2x -> {
               duy $$3 = this.a.a_(jt.a($$0.u()), jt.a($$0.w()));
               dvj $$4 = $$3.b($$1);
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

   public dtc b(ir $$0) {
      dvj $$1 = this.a($$0);
      if ($$1 == null) {
         return dfe.a.n();
      } else {
         int $$2 = jt.b($$0.u());
         int $$3 = jt.b($$0.v());
         int $$4 = jt.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dvj $$0 = (dvj)var1.next();
         $$0.b();
      }
   }
}
