import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dvu implements AutoCloseable {
   private final ddt a;
   private final Long2ObjectMap<dwh> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dwh c;
   private long d;

   public dvu(ddt $$0) {
      this.a = $$0;
   }

   @Nullable
   public dwh a(je $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ao()) {
         long $$2 = kg.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dwh)this.b.computeIfAbsent($$2, $$2x -> {
               dvw $$3 = this.a.a(kg.a($$0.u()), kg.a($$0.w()));
               dwh $$4 = $$3.b($$1);
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

   public dua b(je $$0) {
      dwh $$1 = this.a($$0);
      if ($$1 == null) {
         return dgx.a.o();
      } else {
         int $$2 = kg.b($$0.u());
         int $$3 = kg.b($$0.v());
         int $$4 = kg.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dwh $$0 = (dwh)var1.next();
         $$0.b();
      }
   }
}
