import java.util.Map;
import javax.annotation.Nullable;

public class cin extends chp implements bwp {
   private static final int bF = 40;
   private static final ajx<Byte> bG = akb.a(cin.class, ajz.a);
   private static final Map<cwe, Integer> bH = af.a(cwe.class, cin::c);
   private int bJ;
   private cco bK;

   private static int c(cwe $$0) {
      if ($$0 == cwe.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axk.a(255, ayz.d((float)axk.b($$1) * 0.75F), ayz.d((float)axk.c($$1) * 0.75F), ayz.d((float)axk.d($$1) * 0.75F));
      }
   }

   public static int a(cwe $$0) {
      return bH.get($$0);
   }

   public cin(bvi<? extends cin> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bK = new cco(this);
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cdp(this, 1.25));
      this.bC.a(2, new cci(this, 1.0));
      this.bC.a(3, new cee(this, 1.1, $$0 -> $$0.a(awy.af), false));
      this.bC.a(4, new ccv(this, 1.1));
      this.bC.a(5, this.bK);
      this.bC.a(6, new cej(this, 1.0));
      this.bC.a(7, new cde(this, cpr.class, 6.0F));
      this.bC.a(8, new cdr(this));
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.af);
   }

   @Override
   protected void a(ard $$0) {
      this.bJ = this.bK.h();
      super.a($$0);
   }

   @Override
   public void k_() {
      if (this.dU().C) {
         this.bJ = Math.max(0, this.bJ - 1);
      }

      super.k_();
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.s, 8.0).a(bxg.v, 0.23F);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bG, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.bJ = 40;
      } else {
         super.b($$0);
      }
   }

   public float K(float $$0) {
      if (this.bJ <= 0) {
         return 0.0F;
      } else if (this.bJ >= 4 && this.bJ <= 36) {
         return 1.0F;
      } else {
         return this.bJ < 4 ? ((float)this.bJ - $$0) / 4.0F : -((float)(this.bJ - 40) - $$0) / 4.0F;
      }
   }

   public float L(float $$0) {
      if (this.bJ > 4 && this.bJ <= 36) {
         float $$1 = ((float)(this.bJ - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * ayz.a($$1 * 28.7F);
      } else {
         return this.bJ > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if ($$2.a(cxl.sU)) {
         if (this.dU() instanceof ard $$3 && this.a()) {
            this.a($$3, awb.h, $$2);
            this.a(ecp.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bsy.b;
         }

         return bsy.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cxh $$2) {
      $$0.a(null, this, awa.xl, $$1, 1.0F, 1.0F);
      this.a($$0, ewk.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            clw $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.i($$3.dx().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.w(true);
   }

   @Override
   public boolean a() {
      return this.bJ() && !this.x() && !this.n_();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cwe.a($$0.f("Color")));
   }

   @Override
   protected avz u() {
      return awa.xi;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.xk;
   }

   @Override
   protected avz l_() {
      return awa.xj;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.xm, 0.15F, 1.0F);
   }

   public cwe t() {
      return cwe.a(this.al.a(bG) & 15);
   }

   public void b(cwe $$0) {
      byte $$1 = this.al.a(bG);
      this.al.a(bG, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean x() {
      return (this.al.a(bG) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(bG);
      if ($$0) {
         this.al.a(bG, (byte)($$1 | 16));
      } else {
         this.al.a(bG, (byte)($$1 & -17));
      }
   }

   public static cwe a(azh $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cwe.p;
      } else if ($$1 < 10) {
         return cwe.h;
      } else if ($$1 < 15) {
         return cwe.i;
      } else if ($$1 < 18) {
         return cwe.m;
      } else {
         return $$0.a(500) == 0 ? cwe.g : cwe.a;
      }
   }

   @Nullable
   public cin b(ard $$0, buq $$1) {
      cin $$2 = bvi.ba.a($$0, bvh.e);
      if ($$2 != null) {
         cwe $$3 = this.t();
         cwe $$4 = ((cin)$$1).t();
         $$2.b(cwe.a($$0, $$3, $$4));
      }

      return $$2;
   }

   @Override
   public void R() {
      super.R();
      this.w(false);
      if (this.n_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.b(a($$0.C_()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
