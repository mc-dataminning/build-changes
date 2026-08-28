import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dub implements AutoCloseable {
   private final dce a;
   private final Long2ObjectMap<duo> b = new Long2ObjectOpenHashMap();
   @Nullable
   private duo c;
   private long d;

   public dub(dce $$0) {
      this.a = $$0;
   }

   @Nullable
   public duo a(ja $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.an()) {
         long $$2 = kc.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (duo)this.b.computeIfAbsent($$2, $$2x -> {
               dud $$3 = this.a.a(kc.a($$0.u()), kc.a($$0.w()));
               duo $$4 = $$3.b($$1);
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

   public dsh b(ja $$0) {
      duo $$1 = this.a($$0);
      if ($$1 == null) {
         return dfh.a.o();
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
         duo $$0 = (duo)var1.next();
         $$0.b();
      }
   }
}
