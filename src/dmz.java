import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dmz implements AutoCloseable {
   private final cvo a;
   private final Long2ObjectMap<dnn> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dnn c;
   private long d;

   public dmz(cvo $$0) {
      this.a = $$0;
   }

   @Nullable
   public dnn a(hz $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = jb.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dnn)this.b.computeIfAbsent($$2, $$2x -> {
               dnb $$3 = this.a.a(jb.a($$0.u()), jb.a($$0.w()));
               dnn $$4 = $$3.b($$1);
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

   public dlf b(hz $$0) {
      dnn $$1 = this.a($$0);
      if ($$1 == null) {
         return cyq.a.o();
      } else {
         int $$2 = jb.b($$0.u());
         int $$3 = jb.b($$0.v());
         int $$4 = jb.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dnn $$0 = (dnn)var1.next();
         $$0.b();
      }
   }
}
