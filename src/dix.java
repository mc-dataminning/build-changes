import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dix extends dkr {
   protected static final eyx c = dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dur d = duq.w;

   protected dix(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dix> a();

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(ddv $$0, je $$1, dua $$2) {
      return $$2.a($$0, $$1, jj.b, dox.c);
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!this.c((ddv)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dds)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), ezz.b);
            }
         }
      }
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aE) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if ($$0.a((ddv)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dre $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jj $$7 : jj.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dds $$0, je $$1, dua $$2) {
      if (!this.c((ddv)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.R().b($$1, this)) {
            ezz $$5 = ezz.c;
            if (this.b((dcx)$$0, $$1, $$2)) {
               $$5 = ezz.a;
            } else if ($$3) {
               $$5 = ezz.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(ddv $$0, je $$1, dua $$2) {
      return false;
   }

   protected boolean a(dds $$0, je $$1, dua $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dds $$0, je $$1, dua $$2) {
      jj $$3 = $$2.c(aE);
      je $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dua $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dgx.cw) ? $$6.c(dmy.f) : 0);
      }
   }

   protected int a(dej $$0, je $$1, dua $$2) {
      jj $$3 = $$2.c(aE);
      jj $$4 = $$3.h();
      jj $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(aE, $$0.g().g());
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, buf $$3, cvl $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dds $$0, je $$1, dua $$2) {
      jj $$3 = $$2.c(aE);
      je $$4 = $$1.a($$3.g());
      erj $$5 = erf.a($$0, $$3.g(), jj.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dcx $$0, je $$1, dua $$2) {
      return 15;
   }

   public static boolean n(dua $$0) {
      return $$0.b() instanceof dix;
   }

   public boolean b(dcx $$0, je $$1, dua $$2) {
      jj $$3 = $$2.c(aE).g();
      dua $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aE) != $$3;
   }

   protected abstract int h(dua var1);
}
