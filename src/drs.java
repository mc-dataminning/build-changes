import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class drs implements AutoCloseable {
   private final czv a;
   private final Long2ObjectMap<dsf> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dsf c;
   private long d;

   public drs(czv $$0) {
      this.a = $$0;
   }

   @Nullable
   public dsf a(im $$0) {
      int $$1 = this.a.e($$0.v());
      if ($$1 >= 0 && $$1 < this.a.am()) {
         long $$2 = jo.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dsf)this.b.computeIfAbsent($$2, $$2x -> {
               dru $$3 = this.a.a(jo.a($$0.u()), jo.a($$0.w()));
               dsf $$4 = $$3.b($$1);
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

   public dpy b(im $$0) {
      dsf $$1 = this.a($$0);
      if ($$1 == null) {
         return dcx.a.n();
      } else {
         int $$2 = jo.b($$0.u());
         int $$3 = jo.b($$0.v());
         int $$4 = jo.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dsf $$0 = (dsf)var1.next();
         $$0.b();
      }
   }
}
