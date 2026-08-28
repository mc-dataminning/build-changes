import java.util.Objects;
import javax.annotation.Nullable;

public class ckd extends ciy {
   public float bG;
   public float bH;
   public float bI;
   public float bJ;
   public float bK;
   public float bL;
   public float bM;
   public float bN;
   private float bO;
   private float bP;
   private float bQ;
   fex bR = fex.c;

   public ckd(bwr<? extends ckd> $$0, djh $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ao());
      this.bP = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bD.a(0, new ckd.b(this));
      this.bD.a(1, new ckd.a());
   }

   public static byo.a gt() {
      return bxl.E().a(byp.s, 10.0);
   }

   @Override
   protected awm u() {
      return awn.Ad;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.Af;
   }

   @Override
   protected awm l_() {
      return awn.Ae;
   }

   protected awm t() {
      return awn.Ag;
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   protected bwi.c be() {
      return bwi.c.c;
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return bwr.br.a($$0, bwq.e);
   }

   @Override
   protected double bb() {
      return 0.08;
   }

   @Override
   public void k_() {
      super.k_();
      this.bH = this.bG;
      this.bJ = this.bI;
      this.bL = this.bK;
      this.bN = this.bM;
      this.bK = this.bK + this.bP;
      if ((double)this.bK > Math.PI * 2) {
         if (this.dU().C) {
            this.bK = (float) (Math.PI * 2);
         } else {
            this.bK -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.bP = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dU().a(this, (byte)19);
         }
      }

      if (this.bh()) {
         if (this.bK < (float) Math.PI) {
            float $$0 = this.bK / (float) Math.PI;
            this.bM = azm.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.df()) {
                  this.i(this.bR);
               }

               this.bQ = 1.0F;
            } else {
               this.bQ *= 0.8F;
            }
         } else {
            this.bM = 0.0F;
            if (this.df()) {
               this.i(this.dx().c(0.9));
            }

            this.bQ *= 0.99F;
         }

         fex $$1 = this.dx();
         double $$2 = $$1.i();
         this.aV = this.aV + (-((float)azm.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aV) * 0.1F;
         this.w(this.aV);
         this.bI = this.bI + (float) Math.PI * this.bQ * 1.5F;
         this.bG = this.bG + (-((float)azm.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bG) * 0.1F;
      } else {
         this.bM = azm.e(azm.a(this.bK)) * (float) Math.PI * 0.25F;
         if (!this.dU().C) {
            double $$3 = this.dx().e;
            if (this.b(bvo.y)) {
               $$3 = 0.05 * (double)(this.c(bvo.y).e() + 1);
            } else {
               $$3 -= this.bc();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bG = this.bG + (-90.0F - this.bG) * 0.02F;
      }
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.eq() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fex l(fex $$0) {
      fex $$1 = $$0.a(this.bH * (float) (Math.PI / 180.0));
      return $$1.b(-this.aW * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fex $$0 = this.l(new fex(0.0, -1.0, 0.0)).b(this.dz(), this.dB(), this.dF());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fex $$2 = this.l(new fex((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.n_() ? 0.1F : 0.3F;
         fex $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((arq)this.dU()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lw q() {
      return ly.al;
   }

   @Override
   public void a_(fex $$0) {
      this.a(bxn.a, this.dx());
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.bK = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gu() {
      return this.bR.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      byb $$4 = Objects.requireNonNullElseGet($$3, () -> new bvy.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cef {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bxj $$0 = ckd.this.eq();
         return ckd.this.bh() && $$0 != null ? ckd.this.g((bwi)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bxj $$0 = ckd.this.eq();
         if ($$0 != null) {
            fex $$1 = new fex(ckd.this.dz() - $$0.dz(), ckd.this.dB() - $$0.dB(), ckd.this.dF() - $$0.dF());
            eao $$2 = ckd.this.dU().a_(iv.a(ckd.this.dz() + $$1.d, ckd.this.dB() + $$1.e, ckd.this.dF() + $$1.f));
            ewv $$3 = ckd.this.dU().b_(iv.a(ckd.this.dz() + $$1.d, ckd.this.dB() + $$1.e, ckd.this.dF() + $$1.f));
            if ($$3.a(axh.a) || $$2.l()) {
               double $$4 = $$1.g();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.c($$5);
                  }
               }

               if ($$2.l()) {
                  $$1 = $$1.a(0.0, $$1.e, 0.0);
               }

               ckd.this.bR = new fex($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               ckd.this.dU().a(ly.d, ckd.this.dz(), ckd.this.dB(), ckd.this.dF(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   static class b extends cef {
      private final ckd a;

      public b(ckd $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.ev();
         if ($$0 > 100) {
            this.a.bR = fex.c;
         } else if (this.a.dX().a(b(50)) == 0 || !this.a.ag || !this.a.gu()) {
            float $$1 = this.a.dX().i() * (float) (Math.PI * 2);
            this.a.bR = new fex((double)(azm.b($$1) * 0.2F), (double)(-0.1F + this.a.dX().i() * 0.2F), (double)(azm.a($$1) * 0.2F));
         }
      }
   }
}
