import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ebn<T extends ebb> {
   static final Logger a = LogUtils.getLogger();
   final ebj<T> b;
   final ebd<T> c;
   final ebg<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ebk<T> f;

   public ebn(Class<T> $$0, ebj<T> $$1) {
      this.c = new ebd<>();
      this.d = new ebg<>($$0, $$0x -> this.e.contains($$0x) ? ebo.c : ebo.b);
      this.b = $$1;
      this.f = new ebl<>(this.c, this.d);
   }

   public void a(dfp $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ebo $$1x = $$0x.a(ebo.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dfp $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ebo $$1x = $$0x.a(ebo.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public ebk<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kk.c($$0.dv());
      ebf<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ebn.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bag
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ebf<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bag
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements ebc {
      private final T c;
      private long d;
      private ebf<T> e;

      a(final T $$0, final long $$1, final ebf<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ji $$0 = this.c.dv();
         long $$1 = kk.c($$0);
         if ($$1 != this.d) {
            ebo $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ebn.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kk.a(this.d), $$1});
            }

            ebn.this.a(this.d, this.e);
            ebf<T> $$3 = ebn.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ebn.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ebn.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ebn.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bum.d $$0) {
         if (!this.e.b(this.c)) {
            ebn.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kk.a(this.d), $$0});
         }

         ebo $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            ebn.this.b.d(this.c);
         }

         ebn.this.b.b(this.c);
         ebn.this.b.f(this.c);
         ebn.this.c.b(this.c);
         this.c.a(a);
         ebn.this.a(this.d, this.e);
      }
   }
}
