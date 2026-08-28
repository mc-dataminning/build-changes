import java.util.Map;
import javax.annotation.Nullable;

public class cmr extends cjv implements byv {
   private static final int bI = 40;
   private static final aku<Byte> bJ = aky.a(cmr.class, akw.a);
   private static final Map<czi, Integer> bK = ag.a(czi.class, cmr::c);
   private static final czi bM = czi.a;
   private static final boolean bN = false;
   private int bO;
   private cet bP;

   private static int c(czi $$0) {
      if ($$0 == czi.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return ayh.a(255, azz.d((float)ayh.b($$1) * 0.75F), azz.d((float)ayh.c($$1) * 0.75F), azz.d((float)ayh.d($$1) * 0.75F));
      }
   }

   public static int a(czi $$0) {
      return bK.get($$0);
   }

   public cmr(bxn<? extends cmr> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void C() {
      this.bP = new cet(this);
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cfu(this, 1.25));
      this.bF.a(2, new cen(this, 1.0));
      this.bF.a(3, new cgj(this, 1.1, $$0 -> $$0.a(axv.ah), false));
      this.bF.a(4, new cfa(this, 1.1));
      this.bF.a(5, this.bP);
      this.bF.a(6, new cgo(this, 1.0));
      this.bF.a(7, new cfj(this, csi.class, 6.0F));
      this.bF.a(8, new cfw(this));
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ah);
   }

   @Override
   protected void a(asb $$0) {
      this.bO = this.bP.h();
      super.a($$0);
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         this.bO = Math.max(0, this.bO - 1);
      }

      super.d_();
   }

   public static bzk.a m() {
      return cjv.gz().a(bzl.s, 8.0).a(bzl.v, 0.23F);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bJ, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.bO = 40;
      } else {
         super.b($$0);
      }
   }

   public float J(float $$0) {
      if (this.bO <= 0) {
         return 0.0F;
      } else if (this.bO >= 4 && this.bO <= 36) {
         return 1.0F;
      } else {
         return this.bO < 4 ? ((float)this.bO - $$0) / 4.0F : -((float)(this.bO - 40) - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.bO > 4 && this.bO <= 36) {
         float $$1 = ((float)(this.bO - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * azz.a($$1 * 28.7F);
      } else {
         return this.bO > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(dao.td)) {
         if (this.dV() instanceof asb $$3 && this.a()) {
            this.a($$3, awz.h, $$2);
            this.a(egq.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bvc.b;
         }

         return bvc.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(asb $$0, awz $$1, dak $$2) {
      $$0.a(null, this, awy.xr, $$1, 1.0F, 1.0F);
      this.a($$0, fap.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            coo $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.i($$3.dy().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.w(true);
   }

   @Override
   public boolean a() {
      return this.bJ() && !this.u() && !this.e_();
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Sheared", this.u());
      $$0.a("Color", czi.s, this.p());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("Sheared", false));
      this.b($$0.<czi>a("Color", czi.s).orElse(bM));
   }

   @Override
   protected awx s() {
      return awy.xo;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.xq;
   }

   @Override
   protected awx j_() {
      return awy.xp;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.xs, 0.15F, 1.0F);
   }

   public czi p() {
      return czi.a(this.al.a(bJ) & 15);
   }

   public void b(czi $$0) {
      byte $$1 = this.al.a(bJ);
      this.al.a(bJ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aR ? c((kk<T>)$$0, this.p()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aR);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aR) {
         this.b(c(kl.aR, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public boolean u() {
      return (this.al.a(bJ) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(bJ);
      if ($$0) {
         this.al.a(bJ, (byte)($$1 | 16));
      } else {
         this.al.a(bJ, (byte)($$1 & -17));
      }
   }

   public static czi a(dla $$0, iw $$1) {
      jg<dlm> $$2 = $$0.u($$1);
      return cms.a($$2, $$0.G_());
   }

   @Nullable
   public cmr b(asb $$0, bwu $$1) {
      cmr $$2 = bxn.bc.a($$0, bxm.e);
      if ($$2 != null) {
         czi $$3 = this.p();
         czi $$4 = ((cmr)$$1).p();
         $$2.b(czi.a($$0, $$3, $$4));
      }

      return $$2;
   }

   @Override
   public void Q() {
      super.Q();
      this.w(false);
      if (this.e_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.b(a($$0, this.dv()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
