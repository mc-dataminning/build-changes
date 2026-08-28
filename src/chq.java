import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class chq extends cgq {
   public float bY;
   public float bZ;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public chq(bul<? extends chq> $$0, dfb $$1) {
      super($$0, $$1);
      this.af.b((long)this.as());
      this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new chq.b(this));
      this.bS.a(1, new chq.a());
   }

   public static bwh.a gu() {
      return bvc.E().a(bwi.s, 10.0);
   }

   @Override
   protected awk w() {
      return awl.zd;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.zf;
   }

   @Override
   protected awk o_() {
      return awl.ze;
   }

   protected awk t() {
      return awl.zg;
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Override
   protected bue.b bh() {
      return bue.b.c;
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return bul.aX.a($$0, buk.e);
   }

   @Override
   protected double be() {
      return 0.08;
   }

   @Override
   public void n_() {
      super.n_();
      this.bZ = this.bY;
      this.cb = this.ca;
      this.cd = this.cc;
      this.cf = this.ce;
      this.cc = this.cc + this.ch;
      if ((double)this.cc > Math.PI * 2) {
         if (this.dX().C) {
            this.cc = (float) (Math.PI * 2);
         } else {
            this.cc -= (float) (Math.PI * 2);
            if (this.af.a(10) == 0) {
               this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
            }

            this.dX().a(this, (byte)19);
         }
      }

      if (this.bn()) {
         if (this.cc < (float) Math.PI) {
            float $$0 = this.cc / (float) Math.PI;
            this.ce = azk.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               this.cg = 1.0F;
               this.ci = 1.0F;
            } else {
               this.ci *= 0.8F;
            }
         } else {
            this.ce = 0.0F;
            this.cg *= 0.9F;
            this.ci *= 0.99F;
         }

         if (!this.dX().C) {
            this.n((double)(this.cj * this.cg), (double)(this.ck * this.cg), (double)(this.cl * this.cg));
         }

         ezn $$1 = this.dA();
         double $$2 = $$1.i();
         this.aX = this.aX + (-((float)azk.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.v(this.aX);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)azk.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = azk.e(azk.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dX().C) {
            double $$3 = this.dA().e;
            if (this.b(btl.y)) {
               $$3 = 0.05 * (double)(this.c(btl.y).e() + 1);
            } else {
               $$3 -= this.bf();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (super.a($$0, $$1) && this.es() != null) {
         if (!this.dX().C) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private ezn k(ezn $$0) {
      ezn $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.t());
      ezn $$0 = this.k(new ezn(0.0, -1.0, 0.0)).b(this.dC(), this.dE(), this.dI());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ezn $$2 = this.k(new ezn((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         float $$3 = this.p_() ? 0.1F : 0.3F;
         ezn $$4 = $$2.c((double)($$3 + this.af.i() * 2.0F));
         ((arn)this.dX()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lp q() {
      return lr.ai;
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj()) {
         this.a(bve.a, this.dA());
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.cc = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.cj = $$0;
      this.ck = $$1;
      this.cl = $$2;
   }

   public boolean gv() {
      return this.cj != 0.0F || this.ck != 0.0F || this.cl != 0.0F;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      bvt $$4 = Objects.requireNonNullElseGet($$3, () -> new btv.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cby {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bva $$0 = chq.this.es();
         return chq.this.bk() && $$0 != null ? chq.this.g((bue)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bva $$0 = chq.this.es();
         if ($$0 != null) {
            ezn $$1 = new ezn(chq.this.dC() - $$0.dC(), chq.this.dE() - $$0.dE(), chq.this.dI() - $$0.dI());
            dvj $$2 = chq.this.dX().a_(jh.a(chq.this.dC() + $$1.d, chq.this.dE() + $$1.e, chq.this.dI() + $$1.f));
            erk $$3 = chq.this.dX().b_(jh.a(chq.this.dC() + $$1.d, chq.this.dE() + $$1.e, chq.this.dI() + $$1.f));
            if ($$3.a(axg.a) || $$2.l()) {
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

               chq.this.a((float)$$1.d / 20.0F, (float)$$1.e / 20.0F, (float)$$1.f / 20.0F);
            }

            if (this.e % 10 == 5) {
               chq.this.dX().a(lr.d, chq.this.dC(), chq.this.dE(), chq.this.dI(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cby {
      private final chq a;

      public b(final chq $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.ew();
         if ($$0 > 100) {
            this.a.a(0.0F, 0.0F, 0.0F);
         } else if (this.a.ea().a(b(50)) == 0 || !this.a.ah || !this.a.gv()) {
            float $$1 = this.a.ea().i() * (float) (Math.PI * 2);
            float $$2 = azk.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.ea().i() * 0.2F;
            float $$4 = azk.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
