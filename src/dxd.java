import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dxd implements AutoCloseable {
   private final dfc a;
   private final Long2ObjectMap<dxq> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dxq c;
   private long d;

   public dxd(dfc $$0) {
      this.a = $$0;
   }

   @Nullable
   public dxq a(jh $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = kj.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dxq)this.b.computeIfAbsent($$2, $$2x -> {
               dxf $$3 = this.a.a(kj.a($$0.u()), kj.a($$0.w()));
               dxq $$4 = $$3.b($$1);
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

   public dvj b(jh $$0) {
      dxq $$1 = this.a($$0);
      if ($$1 == null) {
         return dig.a.m();
      } else {
         int $$2 = kj.b($$0.u());
         int $$3 = kj.b($$0.v());
         int $$4 = kj.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dxq $$0 = (dxq)var1.next();
         $$0.b();
      }
   }
}
