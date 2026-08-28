import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dop extends dqn {
   public static final ebf c = ebe.A;
   private static final ffr a = dmm.b(16.0, 0.0, 2.0);

   protected dop(ean.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dop> a();

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return a;
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      return this.a($$1, $$3, $$1.a_($$3));
   }

   protected boolean a(djk $$0, iv $$1, eao $$2) {
      return $$2.a($$0, $$1, jb.b, dux.c);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!this.b((djk)$$1, $$2, $$0)) {
         boolean $$4 = $$0.c(c);
         boolean $$5 = this.a((djh)$$1, $$2, $$0);
         if ($$4 && !$$5) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
         } else if (!$$4) {
            $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
            if (!$$5) {
               $$1.a($$2, this, this.h($$0), fgt.b);
            }
         }
      }
   }

   @Override
   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      if (!$$0.c(c)) {
         return 0;
      } else {
         return $$0.c(e) == $$3 ? this.a($$1, $$2, $$0) : 0;
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if ($$0.a((djk)$$1, $$2)) {
         this.c($$1, $$2, $$0);
      } else {
         dxm $$6 = $$0.x() ? $$1.c_($$2) : null;
         a($$0, $$1, $$2, $$6);
         $$1.a($$2, false);

         for (jb $$7 : jb.values()) {
            $$1.a($$2.a($$7), this);
         }
      }
   }

   protected void c(djh $$0, iv $$1, eao $$2) {
      if (!this.b((djk)$$0, $$1, $$2)) {
         boolean $$3 = $$2.c(c);
         boolean $$4 = this.a($$0, $$1, $$2);
         if ($$3 != $$4 && !$$0.U().b($$1, this)) {
            fgt $$5 = fgt.c;
            if (this.b((din)$$0, $$1, $$2)) {
               $$5 = fgt.a;
            } else if ($$3) {
               $$5 = fgt.b;
            }

            $$0.a($$1, this, this.h($$2), $$5);
         }
      }
   }

   public boolean b(djk $$0, iv $$1, eao $$2) {
      return false;
   }

   protected boolean a(djh $$0, iv $$1, eao $$2) {
      return this.b($$0, $$1, $$2) > 0;
   }

   protected int b(djh $$0, iv $$1, eao $$2) {
      jb $$3 = $$2.c(e);
      iv $$4 = $$1.a($$3);
      int $$5 = $$0.c($$4, $$3);
      if ($$5 >= 15) {
         return $$5;
      } else {
         eao $$6 = $$0.a_($$4);
         return Math.max($$5, $$6.a(dmo.cH) ? $$6.c(dsv.f) : 0);
      }
   }

   protected int a(djz $$0, iv $$1, eao $$2) {
      jb $$3 = $$2.c(e);
      jb $$4 = $$3.h();
      jb $$5 = $$3.i();
      boolean $$6 = this.b();
      return Math.max($$0.a($$1.a($$4), $$4, $$6), $$0.a($$1.a($$5), $$5, $$6));
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   public eao a(ddd $$0) {
      return this.m().b(e, $$0.g().g());
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bxj $$3, czk $$4) {
      if (this.a($$0, $$1, $$2)) {
         $$0.a($$1, this, 1);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      this.d($$1, $$2, $$0);
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3) {
         this.d($$1, $$2, $$0);
      }
   }

   protected void d(djh $$0, iv $$1, eao $$2) {
      jb $$3 = $$2.c(e);
      iv $$4 = $$1.a($$3.g());
      eyd $$5 = exz.a($$0, $$3.g(), jb.b);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   protected boolean b() {
      return false;
   }

   protected int a(din $$0, iv $$1, eao $$2) {
      return 15;
   }

   public static boolean n(eao $$0) {
      return $$0.b() instanceof dop;
   }

   public boolean b(din $$0, iv $$1, eao $$2) {
      jb $$3 = $$2.c(e).g();
      eao $$4 = $$0.a_($$1.a($$3));
      return n($$4) && $$4.c(e) != $$3;
   }

   protected abstract int h(eao var1);
}
