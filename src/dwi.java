import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dwi implements AutoCloseable {
   private final deh a;
   private final Long2ObjectMap<dwv> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dwv c;
   private long d;

   public dwi(deh $$0) {
      this.a = $$0;
   }

   @Nullable
   public dwv a(je $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ao()) {
         long $$2 = kg.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dwv)this.b.computeIfAbsent($$2, $$2x -> {
               dwk $$3 = this.a.a(kg.a($$0.u()), kg.a($$0.w()));
               dwv $$4 = $$3.b($$1);
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

   public duo b(je $$0) {
      dwv $$1 = this.a($$0);
      if ($$1 == null) {
         return dhl.a.o();
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
         dwv $$0 = (dwv)var1.next();
         $$0.b();
      }
   }
}
