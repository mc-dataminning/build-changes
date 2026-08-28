import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dtw implements AutoCloseable {
   private final dbz a;
   private final Long2ObjectMap<duj> b = new Long2ObjectOpenHashMap();
   @Nullable
   private duj c;
   private long d;

   public dtw(dbz $$0) {
      this.a = $$0;
   }

   @Nullable
   public duj a(iz $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.an()) {
         long $$2 = kb.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (duj)this.b.computeIfAbsent($$2, $$2x -> {
               dty $$3 = this.a.a(kb.a($$0.u()), kb.a($$0.w()));
               duj $$4 = $$3.b($$1);
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

   public dsc b(iz $$0) {
      duj $$1 = this.a($$0);
      if ($$1 == null) {
         return dfb.a.o();
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
         duj $$0 = (duj)var1.next();
         $$0.b();
      }
   }
}
