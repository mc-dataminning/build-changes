import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djo extends dli {
   protected static final ezq c = dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dvj d = dvi.w;

   protected djo(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djo> a();

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      return this.b($$1, $$3, $$1.a_($$3));
   }

   protected boolean b(dem $$0, jf $$1, dus $$2) {
      return $$2.a($$0, $$1, jk.b, dpo.c);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!this.c((dem)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dej)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fas.b);
            }
         }
      }
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$0.a((dem)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         drv $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jk $$7 : jk.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dej $$0, jf $$1, dus $$2) {
      if (!this.c((dem)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.R().b($$1, this)) {
            fas $$5 = fas.c;
            if (this.b((ddo)$$0, $$1, $$2)) {
               $$5 = fas.a;
            } else if ($$3) {
               $$5 = fas.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean c(dem $$0, jf $$1, dus $$2) {
      return false;
   }

   protected boolean a(dej $$0, jf $$1, dus $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dej $$0, jf $$1, dus $$2) {
      jk $$3 = $$2.c(aF);
      jf $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dus $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dho.cw) ? $$6.c(dnp.f) : 0);
      }
   }

   protected int a(dfa $$0, jf $$1, dus $$2) {
      jk $$3 = $$2.c(aF);
      jk $$4 = $$3.h();
      jk $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(aF, $$0.g().g());
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, bun $$3, cvs $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dej $$0, jf $$1, dus $$2) {
      jk $$3 = $$2.c(aF);
      jf $$4 = $$1.a($$3.g());
      esb $$5 = erx.a($$0, $$3.g(), jk.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(ddo $$0, jf $$1, dus $$2) {
      return 15;
   }

   public static boolean n(dus $$0) {
      return $$0.b() instanceof djo;
   }

   public boolean b(ddo $$0, jf $$1, dus $$2) {
      jk $$3 = $$2.c(aF).g();
      dus $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dus var1);
}
