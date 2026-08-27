import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dhf implements AutoCloseable {
   private final cpy a;
   private final Long2ObjectMap<dht> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dht c;
   private long d;

   public dhf(cpy $$0) {
      this.a = $$0;
   }

   @Nullable
   public dht a(gw $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ak()) {
         long $$2 = hz.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dht)this.b.computeIfAbsent($$2, $$2x -> {
               dhh $$3 = this.a.a(hz.a($$0.u()), hz.a($$0.w()));
               dht $$4 = $$3.b($$1);
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

   public dfl b(gw $$0) {
      dht $$1 = this.a($$0);
      if ($$1 == null) {
         return csy.a.n();
      } else {
         int $$2 = hz.b($$0.u());
         int $$3 = hz.b($$0.v());
         int $$4 = hz.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dht $$0 = (dht)var1.next();
         $$0.b();
      }
   }
}
