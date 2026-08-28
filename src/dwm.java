import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dwm implements AutoCloseable {
   private final dek a;
   private final Long2ObjectMap<dwz> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dwz c;
   private long d;

   public dwm(dek $$0) {
      this.a = $$0;
   }

   @Nullable
   public dwz a(jf $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ao()) {
         long $$2 = kh.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dwz)this.b.computeIfAbsent($$2, $$2x -> {
               dwo $$3 = this.a.a(kh.a($$0.u()), kh.a($$0.w()));
               dwz $$4 = $$3.b($$1);
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

   public dus b(jf $$0) {
      dwz $$1 = this.a($$0);
      if ($$1 == null) {
         return dho.a.n();
      } else {
         int $$2 = kh.b($$0.u());
         int $$3 = kh.b($$0.v());
         int $$4 = kh.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dwz $$0 = (dwz)var1.next();
         $$0.b();
      }
   }
}
