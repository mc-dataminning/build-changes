import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class dwx implements AutoCloseable {
   private final dew a;
   private final Long2ObjectMap<dxk> b = new Long2ObjectOpenHashMap();
   @Nullable
   private dxk c;
   private long d;

   public dwx(dew $$0) {
      this.a = $$0;
   }

   @Nullable
   public dxk a(jg $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ao()) {
         long $$2 = ki.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (dxk)this.b.computeIfAbsent($$2, $$2x -> {
               dwz $$3 = this.a.a(ki.a($$0.u()), ki.a($$0.w()));
               dxk $$4 = $$3.b($$1);
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

   public dvd b(jg $$0) {
      dxk $$1 = this.a($$0);
      if ($$1 == null) {
         return dia.a.m();
      } else {
         int $$2 = ki.b($$0.u());
         int $$3 = ki.b($$0.v());
         int $$4 = ki.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         dxk $$0 = (dxk)var1.next();
         $$0.b();
      }
   }
}
