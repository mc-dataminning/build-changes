import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class chl extends cgl {
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

   public chl(bug<? extends chl> $$0, dev $$1) {
      super($$0, $$1);
      this.af.b((long)this.ar());
      this.ch = 1.0F / (this.af.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void D() {
      this.bS.a(0, new chl.b(this));
      this.bS.a(1, new chl.a());
   }

   public static bwc.a gv() {
      return bux.E().a(bwd.s, 10.0);
   }

   @Override
   protected awj w() {
      return awk.zd;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.zf;
   }

   @Override
   protected awj o_() {
      return awk.ze;
   }

   protected awj t() {
      return awk.zg;
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
   protected btz.b bh() {
      return btz.b.c;
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return bug.aX.a($$0, buf.e);
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
            this.ce = azj.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
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

         ezh $$1 = this.dA();
         double $$2 = $$1.i();
         this.aU = this.aU + (-((float)azj.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aU) * 0.1F;
         this.v(this.aU);
         this.ca = this.ca + (float) Math.PI * this.ci * 1.5F;
         this.bY = this.bY + (-((float)azj.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bY) * 0.1F;
      } else {
         this.ce = azj.e(azj.a(this.cc)) * (float) Math.PI * 0.25F;
         if (!this.dX().C) {
            double $$3 = this.dA().e;
            if (this.b(btg.y)) {
               $$3 = 0.05 * (double)(this.c(btg.y).e() + 1);
            } else {
               $$3 -= this.bf();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bY = this.bY + (-90.0F - this.bY) * 0.02F;
      }
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (super.a($$0, $$1) && this.es() != null) {
         if (!this.dX().C) {
            this.y();
         }

         return true;
      } else {
         return false;
      }
   }

   private ezh k(ezh $$0) {
      ezh $$1 = $$0.a(this.bZ * (float) (Math.PI / 180.0));
      return $$1.b(-this.aV * (float) (Math.PI / 180.0));
   }

   private void y() {
      this.b(this.t());
      ezh $$0 = this.k(new ezh(0.0, -1.0, 0.0)).b(this.dC(), this.dE(), this.dI());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         ezh $$2 = this.k(new ezh((double)this.af.i() * 0.6 - 0.3, -1.0, (double)this.af.i() * 0.6 - 0.3));
         float $$3 = this.p_() ? 0.1F : 0.3F;
         ezh $$4 = $$2.c((double)($$3 + this.af.i() * 2.0F));
         ((arm)this.dX()).a(this.q(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lo q() {
      return lq.ai;
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj()) {
         this.a(buz.a, this.dA());
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

   public boolean gw() {
      return this.cj != 0.0F || this.ck != 0.0F || this.cl != 0.0F;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      bvo $$4 = Objects.requireNonNullElseGet($$3, () -> new btq.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends cbt {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         buv $$0 = chl.this.es();
         return chl.this.bk() && $$0 != null ? chl.this.g((btz)$$0) < 100.0 : false;
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
         buv $$0 = chl.this.es();
         if ($$0 != null) {
            ezh $$1 = new ezh(chl.this.dC() - $$0.dC(), chl.this.dE() - $$0.dE(), chl.this.dI() - $$0.dI());
            dvd $$2 = chl.this.dX().a_(jg.a(chl.this.dC() + $$1.d, chl.this.dE() + $$1.e, chl.this.dI() + $$1.f));
            ere $$3 = chl.this.dX().b_(jg.a(chl.this.dC() + $$1.d, chl.this.dE() + $$1.e, chl.this.dI() + $$1.f));
            if ($$3.a(axf.a) || $$2.l()) {
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

               chl.this.a((float)$$1.d / 20.0F, (float)$$1.e / 20.0F, (float)$$1.f / 20.0F);
            }

            if (this.e % 10 == 5) {
               chl.this.dX().a(lq.d, chl.this.dC(), chl.this.dE(), chl.this.dI(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends cbt {
      private final chl a;

      public b(final chl $$0) {
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
         } else if (this.a.ea().a(b(50)) == 0 || !this.a.ah || !this.a.gw()) {
            float $$1 = this.a.ea().i() * (float) (Math.PI * 2);
            float $$2 = azj.b($$1) * 0.2F;
            float $$3 = -0.1F + this.a.ea().i() * 0.2F;
            float $$4 = azj.a($$1) * 0.2F;
            this.a.a($$2, $$3, $$4);
         }
      }
   }
}
