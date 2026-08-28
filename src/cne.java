import java.util.EnumSet;
import javax.annotation.Nullable;

public class cne extends cmx {
   @Nullable
   private cne.b a;

   public cne(bvr<? extends cne> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.a = new cne.b(this);
      this.bT.a(1, new ccy(this));
      this.bT.a(1, new cct(this, this.dW()));
      this.bT.a(3, this.a);
      this.bT.a(4, new cdo(this, 1.0, false));
      this.bT.a(5, new cne.a(this));
      this.bU.a(1, new cew(this).a());
      this.bU.a(2, new cex<>(this, cpx.class, true));
   }

   public static bxn.a m() {
      return cmx.gt().a(bxo.s, 8.0).a(bxo.v, 0.25).a(bxo.c, 1.0);
   }

   @Override
   protected bvk.c bg() {
      return bvk.c.c;
   }

   @Override
   protected axe u() {
      return axf.xr;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.xt;
   }

   @Override
   protected axe o_() {
      return axf.xs;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.xu, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
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
   public float a(jh $$0, dhl $$1) {
      return don.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bvr<cne> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvq.a($$2)) {
         return true;
      } else {
         cpx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends ceb {
      @Nullable
      private jm i;
      private boolean j;

      public a(cne $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.O_() != null) {
            return false;
         } else if (!this.b.L().m()) {
            return false;
         } else {
            bam $$0 = this.b.dZ();
            if (a(this.b).N().b(dhe.c) && $$0.a(b(10)) == 0) {
               this.i = jm.b($$0);
               jh $$1 = jh.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
               dxv $$2 = this.b.dW().a_($$1);
               if (don.o($$2)) {
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
            dhj $$0 = this.b.dW();
            jh $$1 = jh.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
            dxv $$2 = $$0.a_($$1);
            if (don.o($$2)) {
               $$0.a($$1, don.p($$2), 3);
               this.b.S();
               this.b.at();
            }
         }
      }
   }

   static class b extends cde {
      private final cne a;
      private int b;

      public b(cne $$0) {
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
            dhi $$0 = this.a.dW();
            bam $$1 = this.a.dZ();
            jh $$2 = this.a.dw();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jh $$6 = $$2.b($$4, $$3, $$5);
                     dxv $$7 = $$0.a_($$6);
                     dkm $$8 = $$7.b();
                     if ($$8 instanceof don) {
                        if (a($$0).N().b(dhe.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((don)$$8).q($$0.a_($$6)), 3);
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
