import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dsb implements AutoCloseable {
   private final dae a;
   private final Long2ObjectMap<dso> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dso c;
   private long d;

   public dsb(dae $$0) {
      this.a = $$0;
   }

   @Nullable
   public dso a(in $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = jp.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dso)this.b.computeIfAbsent($$2, $$2x -> {
               dsd $$3 = this.a.a(jp.a($$0.u()), jp.a($$0.w()));
               dso $$4 = $$3.b($$1);
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

   public dqh b(in $$0) {
      dso $$1 = this.a($$0);
      if ($$1 == null) {
         return ddg.a.n();
      } else {
         int $$2 = jp.b($$0.u());
         int $$3 = jp.b($$0.v());
         int $$4 = jp.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dso $$0 = (dso)var1.next();
         $$0.b();
      }
   }
}
