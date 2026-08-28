import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnd extends cmw {
   @Nullable
   private cnd.b a;

   public cnd(bvq<? extends cnd> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.a = new cnd.b(this);
      this.bT.a(1, new ccx(this));
      this.bT.a(1, new ccs(this, this.dW()));
      this.bT.a(3, this.a);
      this.bT.a(4, new cdn(this, 1.0, false));
      this.bT.a(5, new cnd.a(this));
      this.bU.a(1, new cev(this).a());
      this.bU.a(2, new cew<>(this, cpw.class, true));
   }

   public static bxm.a m() {
      return cmw.gt().a(bxn.s, 8.0).a(bxn.v, 0.25).a(bxn.c, 1.0);
   }

   @Override
   protected bvj.c bg() {
      return bvj.c.c;
   }

   @Override
   protected axe u() {
      return axf.xr;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.xt;
   }

   @Override
   protected axe o_() {
      return axf.xs;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.xu, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axw.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aX = this.dM();
      super.h();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return dom.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bvq<cnd> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvp.a($$2)) {
         return true;
      } else {
         cpw $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cea {
      @Nullable
      private jm i;
      private boolean j;

      public a(cnd $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.O_() != null) {
            return false;
         } else if (!this.b.L().m()) {
            return false;
         } else {
            bam $$0 = this.b.dZ();
            if (a(this.b).N().b(dhd.c) && $$0.a(b(10)) == 0) {
               this.i = jm.b($$0);
               jh $$1 = jh.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
               dxu $$2 = this.b.dW().a_($$1);
               if (dom.o($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.b();
         }
      }

      @Override
      public boolean c() {
         return this.j ? false : super.c();
      }

      @Override
      public void d() {
         if (!this.j) {
            super.d();
         } else {
            dhi $$0 = this.b.dW();
            jh $$1 = jh.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
            dxu $$2 = $$0.a_($$1);
            if (dom.o($$2)) {
               $$0.a($$1, dom.p($$2), 3);
               this.b.S();
               this.b.at();
            }
         }
      }
   }

   static class b extends cdd {
      private final cnd a;
      private int b;

      public b(cnd $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean b() {
         return this.b > 0;
      }

      @Override
      public void a() {
         this.b--;
         if (this.b <= 0) {
            dhh $$0 = this.a.dW();
            bam $$1 = this.a.dZ();
            jh $$2 = this.a.dw();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jh $$6 = $$2.b($$4, $$3, $$5);
                     dxu $$7 = $$0.a_($$6);
                     dkl $$8 = $$7.b();
                     if ($$8 instanceof dom) {
                        if (a($$0).N().b(dhd.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dom)$$8).q($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
