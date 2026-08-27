import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dgx implements AutoCloseable {
   private final cqc a;
   private final Long2ObjectMap<dhl> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dhl c;
   private long d;

   public dgx(cqc $$0) {
      this.a = $$0;
   }

   @Nullable
   public dhl a(gw $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ak()) {
         long $$2 = hw.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dhl)this.b.computeIfAbsent($$2, $$2x -> {
               dgz $$3 = this.a.a(hw.a($$0.u()), hw.a($$0.w()));
               dhl $$4 = $$3.b($$1);
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

   public dfd b(gw $$0) {
      dhl $$1 = this.a($$0);
      if ($$1 == null) {
         return cte.a.o();
      } else {
         int $$2 = hw.b($$0.u());
         int $$3 = hw.b($$0.v());
         int $$4 = hw.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dhl $$0 = (dhl)var1.next();
         $$0.b();
      }
   }
}
