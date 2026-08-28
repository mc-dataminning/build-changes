import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dtr implements AutoCloseable {
   private final dbu a;
   private final Long2ObjectMap<due> b = new Long2ObjectOpenHashMap();
   @Nullable
   private due c;
   private long d;

   public dtr(dbu $$0) {
      this.a = $$0;
   }

   @Nullable
   public due a(iz $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.an()) {
         long $$2 = kb.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (due)this.b.computeIfAbsent($$2, $$2x -> {
               dtt $$3 = this.a.a(kb.a($$0.u()), kb.a($$0.w()));
               due $$4 = $$3.b($$1);
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

   public drx b(iz $$0) {
      due $$1 = this.a($$0);
      if ($$1 == null) {
         return dew.a.n();
      } else {
         int $$2 = kb.b($$0.u());
         int $$3 = kb.b($$0.v());
         int $$4 = kb.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         due $$0 = (due)var1.next();
         $$0.b();
      }
   }
}
