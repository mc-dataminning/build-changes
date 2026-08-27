import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dov implements AutoCloseable {
   private final cxc a;
   private final Long2ObjectMap<dpj> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dpj c;
   private long d;

   public dov(cxc $$0) {
      this.a = $$0;
   }

   @Nullable
   public dpj a(ib $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.al()) {
         long $$2 = je.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dpj)this.b.computeIfAbsent($$2, $$2x -> {
               dox $$3 = this.a.a(je.a($$0.u()), je.a($$0.w()));
               dpj $$4 = $$3.b($$1);
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

   public dnb b(ib $$0) {
      dpj $$1 = this.a($$0);
      if ($$1 == null) {
         return dae.a.o();
      } else {
         int $$2 = je.b($$0.u());
         int $$3 = je.b($$0.v());
         int $$4 = je.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dpj $$0 = (dpj)var1.next();
         $$0.b();
      }
   }
}
