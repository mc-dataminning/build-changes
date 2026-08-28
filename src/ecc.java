import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ecc<T extends ebq> {
   static final Logger a = LogUtils.getLogger();
   final eby<T> b;
   final ebs<T> c;
   final ebv<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ebz<T> f;

   public ecc(Class<T> $$0, eby<T> $$1) {
      this.c = new ebs<>();
      this.d = new ebv<>($$0, $$0x -> this.e.contains($$0x) ? ecd.c : ecd.b);
      this.b = $$1;
      this.f = new eca<>(this.c, this.d);
   }

   public void a(dgg $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ecd $$1x = $$0x.a(ecd.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dgg $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ecd $$1x = $$0x.a(ecd.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public ebz<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kj.c($$0.dv());
      ebu<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ecc.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bbl
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ebu<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bbl
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements ebr {
      private final T c;
      private long d;
      private ebu<T> e;

      a(final T $$0, final long $$1, final ebu<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dv();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            ecd $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ecc.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            ecc.this.a(this.d, this.e);
            ebu<T> $$3 = ecc.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ecc.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ecc.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ecc.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bvf.c $$0) {
         if (!this.e.b(this.c)) {
            ecc.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         ecd $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            ecc.this.b.d(this.c);
         }

         ecc.this.b.b(this.c);
         ecc.this.b.f(this.c);
         ecc.this.c.b(this.c);
         this.c.a(a);
         ecc.this.a(this.d, this.e);
      }
   }
}
