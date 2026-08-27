import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dsx implements AutoCloseable {
   private final dba a;
   private final Long2ObjectMap<dtk> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dtk c;
   private long d;

   public dsx(dba $$0) {
      this.a = $$0;
   }

   @Nullable
   public dtk a(io $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = jq.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dtk)this.b.computeIfAbsent($$2, $$2x -> {
               dsz $$3 = this.a.a(jq.a($$0.u()), jq.a($$0.w()));
               dtk $$4 = $$3.b($$1);
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

   public drd b(io $$0) {
      dtk $$1 = this.a($$0);
      if ($$1 == null) {
         return dec.a.n();
      } else {
         int $$2 = jq.b($$0.u());
         int $$3 = jq.b($$0.v());
         int $$4 = jq.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dtk $$0 = (dtk)var1.next();
         $$0.b();
      }
   }
}
