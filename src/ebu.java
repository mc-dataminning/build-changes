import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public class ebu implements AutoCloseable {
   private final diw a;
   private final Long2ObjectMap<ech> b = new Long2ObjectOpenHashMap();
   @Nullable
   private ech c;
   private long d;

   public ebu(diw $$0) {
      this.a = $$0;
   }

   @Nullable
   public ech a(iu $$0) {
      int $$1 = this.a.f($$0.v());
      if ($$1 >= 0 && $$1 < this.a.ap()) {
         long $$2 = jx.c($$0);
         if (this.c == null || this.d != $$2) {
            this.c = (ech)this.b.computeIfAbsent($$2, $$2x -> {
               ebw $$3 = this.a.a(jx.a($$0.u()), jx.a($$0.w()));
               ech $$4 = $$3.b($$1);
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

   public dzz b(iu $$0) {
      ech $$1 = this.a($$0);
      if ($$1 == null) {
         return dmc.a.m();
      } else {
         int $$2 = jx.b($$0.u());
         int $$3 = jx.b($$0.v());
         int $$4 = jx.b($$0.w());
         return $$1.a($$2, $$3, $$4);
      }
   }

   @Override
   public void close() {
      ObjectIterator var1 = this.b.values().iterator();

      while (var1.hasNext()) {
         ech $$0 = (ech)var1.next();
         $$0.b();
      }
   }
}
