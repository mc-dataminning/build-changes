import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class duf implements AutoCloseable {
   private final dch a;
   private final Long2ObjectMap<dus> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dus c;
   private long d;

   public duf(dch $$0) {
      this.a = $$0;
   }

   @Nullable
   public dus a(ja $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.an()) {
         long $$2 = kc.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dus)this.b.computeIfAbsent($$2, $$2x -> {
               duh $$3 = this.a.a(kc.a($$0.u()), kc.a($$0.w()));
               dus $$4 = $$3.b($$1);
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

   public dsl b(ja $$0) {
      dus $$1 = this.a($$0);
      if ($$1 == null) {
         return dfk.a.o();
      } else {
         int $$2 = kc.b($$0.u());
         int $$3 = kc.b($$0.v());
         int $$4 = kc.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dus $$0 = (dus)var1.next();
         $$0.b();
      }
   }
}
