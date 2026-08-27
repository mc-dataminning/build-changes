import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dny implements AutoCloseable {
   private final cwf a;
   private final Long2ObjectMap<dom> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dom c;
   private long d;

   public dny(cwf $$0) {
      this.a = $$0;
   }

   @Nullable
   public dom a(ib $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.al()) {
         long $$2 = jd.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dom)this.b.computeIfAbsent($$2, $$2x -> {
               doa $$3 = this.a.a(jd.a($$0.u()), jd.a($$0.w()));
               dom $$4 = $$3.b($$1);
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

   public dme b(ib $$0) {
      dom $$1 = this.a($$0);
      if ($$1 == null) {
         return czh.a.o();
      } else {
         int $$2 = jd.b($$0.u());
         int $$3 = jd.b($$0.v());
         int $$4 = jd.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dom $$0 = (dom)var1.next();
         $$0.b();
      }
   }
}
