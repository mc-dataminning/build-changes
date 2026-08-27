import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class drc implements AutoCloseable {
   private final czh a;
   private final Long2ObjectMap<drp> b = new Long2ObjectOpenHashMap();
   @Nullable
   private drp c;
   private long d;

   public drc(czh $$0) {
      this.a = $$0;
   }

   @Nullable
   public drp a(id $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = jg.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (drp)this.b.computeIfAbsent($$2, $$2x -> {
               dre $$3 = this.a.a(jg.a($$0.u()), jg.a($$0.w()));
               drp $$4 = $$3.b($$1);
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

   public dpi b(id $$0) {
      drp $$1 = this.a($$0);
      if ($$1 == null) {
         return dcj.a.n();
      } else {
         int $$2 = jg.b($$0.u());
         int $$3 = jg.b($$0.v());
         int $$4 = jg.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         drp $$0 = (drp)var1.next();
         $$0.b();
      }
   }
}
