import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class eah implements AutoCloseable {
   private final dhq a;
   private final Long2ObjectMap<eau> b = new Long2ObjectOpenHashMap();
   @Nullable
   private eau c;
   private long d;

   public eah(dhq $$0) {
      this.a = $$0;
   }

   @Nullable
   public eau a(jj $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ap()) {
         long $$2 = kl.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (eau)this.b.computeIfAbsent($$2, $$2x -> {
               eaj $$3 = this.a.a(kl.a($$0.u()), kl.a($$0.w()));
               eau $$4 = $$3.b($$1);
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

   public dym b(jj $$0) {
      eau $$1 = this.a($$0);
      if ($$1 == null) {
         return dkw.a.m();
      } else {
         int $$2 = kl.b($$0.u());
         int $$3 = kl.b($$0.v());
         int $$4 = kl.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         eau $$0 = (eau)var1.next();
         $$0.b();
      }
   }
}
