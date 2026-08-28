import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class edb implements AutoCloseable {
   private final dka a;
   private final Long2ObjectMap<edo> b = new Long2ObjectOpenHashMap();
   @Nullable
   private edo c;
   private long d;

   public edb(dka $$0) {
      this.a = $$0;
   }

   @Nullable
   public edo a(iw $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ap()) {
         long $$2 = jz.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (edo)this.b.computeIfAbsent($$2, $$2x -> {
               edd $$3 = this.a.a(jz.a($$0.u()), jz.a($$0.w()));
               edo $$4 = $$3.b($$1);
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

   public ebg b(iw $$0) {
      edo $$1 = this.a($$0);
      if ($$1 == null) {
         return dng.a.m();
      } else {
         int $$2 = jz.b($$0.u());
         int $$3 = jz.b($$0.v());
         int $$4 = jz.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         edo $$0 = (edo)var1.next();
         $$0.b();
      }
   }
}
