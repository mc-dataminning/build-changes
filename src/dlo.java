import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlo extends dnj {
   protected static final fbt c = djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final dxn d = dxm.B;

   protected dlo(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlo> a();

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$2.a($$0, $$1, jn.b, drr.c);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.b((dgk)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(d);
         boolean $$5 = this.a((dgh)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fcv.b);
            }
         }
      }
   }

   @Override
   protected int b(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$0.c(aF) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if ($$0.a((dgk)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dty $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jn $$7 : jn.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(dgh $$0, ji $$1, dww $$2) {
      if (!this.b((dgk)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fcv $$5 = fcv.c;
            if (this.b((dfm)$$0, $$1, $$2)) {
               $$5 = fcv.a;
            } else if ($$3) {
               $$5 = fcv.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(dgk $$0, ji $$1, dww $$2) {
      return false;
   }

   protected boolean a(dgh $$0, ji $$1, dww $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(dgh $$0, ji $$1, dww $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         dww $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(djn.cE) ? $$6.c(dps.f) : 0);
      }
   }

   protected int a(dgz $$0, ji $$1, dww $$2) {
      jn $$3 = $$2.c(aF);
      jn $$4 = $$3.h();
      jn $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   @Override
   public dww a(daf $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, bvg $$3, cwo $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(dgh $$0, ji $$1, dww $$2) {
      jn $$3 = $$2.c(aF);
      ji $$4 = $$1.a($$3.g());
      eug $$5 = euc.a($$0, $$3.g(), jn.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(dfm $$0, ji $$1, dww $$2) {
      return 15;
   }

   public static boolean n(dww $$0) {
      return $$0.b() instanceof dlo;
   }

   public boolean b(dfm $$0, ji $$1, dww $$2) {
      jn $$3 = $$2.c(aF).g();
      dww $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(aF) != $$3;
   }

   protected abstract int h(dww var1);
}
