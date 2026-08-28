import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class efx<T extends efl> {
   static final Logger a = LogUtils.getLogger();
   final eft<T> b;
   final efn<T> c;
   final efq<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final efu<T> f;

   public efx(Class<T> $$0, eft<T> $$1) {
      this.c = new efn<>();
      this.d = new efq<>($$0, $$0x -> this.e.contains($$0x) ? ega.c : ega.b);
      this.b = $$1;
      this.f = new efv<>(this.c, this.d);
   }

   public void a(dje $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ega $$1x = $$0x.a(ega.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dje $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ega $$1x = $$0x.a(ega.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public efu<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jz.c($$0.dv());
      efp<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new efx.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @baz
   public int b() {
      return this.c.b();
   }

   void a(long $$0, efp<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @baz
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements efm {
      private final T c;
      private long d;
      private efp<T> e;

      a(final T $$0, final long $$1, final efp<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iw $$0 = this.c.dv();
         long $$1 = jz.c($$0);
         if ($$1 != this.d) {
            ega $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               efx.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jz.a(this.d), $$1});
            }

            efx.this.a(this.d, this.e);
            efp<T> $$3 = efx.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            efx.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  efx.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  efx.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bwv.d $$0) {
         if (!this.e.b(this.c)) {
            efx.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jz.a(this.d), $$0});
         }

         ega $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            efx.this.b.d(this.c);
         }

         efx.this.b.b(this.c);
         efx.this.b.f(this.c);
         efx.this.c.b(this.c);
         this.c.a(a);
         efx.this.a(this.d, this.e);
      }
   }
}
