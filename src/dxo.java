import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dxo implements AutoCloseable {
   private final dfn a;
   private final Long2ObjectMap<dyb> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dyb c;
   private long d;

   public dxo(dfn $$0) {
      this.a = $$0;
   }

   @Nullable
   public dyb a(jh $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = kj.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dyb)this.b.computeIfAbsent($$2, $$2x -> {
               dxq $$3 = this.a.a(kj.a($$0.u()), kj.a($$0.w()));
               dyb $$4 = $$3.b($$1);
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

   public dvv b(jh $$0) {
      dyb $$1 = this.a($$0);
      if ($$1 == null) {
         return dis.a.m();
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
         dyb $$0 = (dyb)var1.next();
         $$0.b();
      }
   }
}
