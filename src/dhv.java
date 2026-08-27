import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dhv implements AutoCloseable {
   private final cra a;
   private final Long2ObjectMap<dij> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dij c;
   private long d;

   public dhv(cra $$0) {
      this.a = $$0;
   }

   @Nullable
   public dij a(ht $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ak()) {
         long $$2 = iu.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dij)this.b.computeIfAbsent($$2, $$2x -> {
               dhx $$3 = this.a.a(iu.a($$0.u()), iu.a($$0.w()));
               dij $$4 = $$3.b($$1);
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

   public dgb b(ht $$0) {
      dij $$1 = this.a($$0);
      if ($$1 == null) {
         return cuc.a.o();
      } else {
         int $$2 = iu.b($$0.u());
         int $$3 = iu.b($$0.v());
         int $$4 = iu.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dij $$0 = (dij)var1.next();
         $$0.b();
      }
   }
}
