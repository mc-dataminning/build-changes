import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class ecz implements AutoCloseable {
   private final djy a;
   private final Long2ObjectMap<edm> b = new Long2ObjectOpenHashMap();
   @Nullable
   private edm c;
   private long d;

   public ecz(djy $$0) {
      this.a = $$0;
   }

   @Nullable
   public edm a(iv $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ap()) {
         long $$2 = jy.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (edm)this.b.computeIfAbsent($$2, $$2x -> {
               edb $$3 = this.a.a(jy.a($$0.u()), jy.a($$0.w()));
               edm $$4 = $$3.b($$1);
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

   public ebe b(iv $$0) {
      edm $$1 = this.a($$0);
      if ($$1 == null) {
         return dne.a.m();
      } else {
         int $$2 = jy.b($$0.u());
         int $$3 = jy.b($$0.v());
         int $$4 = jy.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         edm $$0 = (edm)var1.next();
         $$0.b();
      }
   }
}
