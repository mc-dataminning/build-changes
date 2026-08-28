import java.util.Map;
import javax.annotation.Nullable;

public class cmi extends cjm implements bym {
   private static final int bI = 40;
   private static final akn<Byte> bJ = akr.a(cmi.class, akp.a);
   private static final Map<cyy, Integer> bK = ag.a(cyy.class, cmi::c);
   private static final cyy bM = cyy.a;
   private static final boolean bN = false;
   private int bO;
   private cek bP;

   private static int c(cyy $$0) {
      if ($$0 == cyy.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return aya.a(255, azq.d((float)aya.b($$1) * 0.75F), azq.d((float)aya.c($$1) * 0.75F), azq.d((float)aya.d($$1) * 0.75F));
      }
   }

   public static int a(cyy $$0) {
      return bK.get($$0);
   }

   public cmi(bxe<? extends cmi> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bP = new cek(this);
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cfl(this, 1.25));
      this.bF.a(2, new cee(this, 1.0));
      this.bF.a(3, new cga(this, 1.1, $$0 -> $$0.a(axo.ah), false));
      this.bF.a(4, new cer(this, 1.1));
      this.bF.a(5, this.bP);
      this.bF.a(6, new cgf(this, 1.0));
      this.bF.a(7, new cfa(this, crz.class, 6.0F));
      this.bF.a(8, new cfn(this));
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ah);
   }

   @Override
   protected void a(aru $$0) {
      this.bO = this.bP.h();
      super.a($$0);
   }

   @Override
   public void k_() {
      if (this.dV().C) {
         this.bO = Math.max(0, this.bO - 1);
      }

      super.k_();
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.s, 8.0).a(bzc.v, 0.23F);
   }

   @Override
   protected void a(akr.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * azq.a($$1 * 28.7F);
      } else {
         return this.bO > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(dae.td)) {
         if (this.dV() instanceof aru $$3 && this.a()) {
            this.a($$3, aws.h, $$2);
            this.a(egg.M, $$0);
            $$2.a(1, $$0, d($$1));
            return but.b;
         }

         return but.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aru $$0, aws $$1, daa $$2) {
      $$0.a(null, this, awr.xr, $$1, 1.0F, 1.0F);
      this.a($$0, faf.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            coe $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.i($$3.dy().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
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
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", cyy.s, this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("Sheared", false));
      this.b($$0.<cyy>a("Color", cyy.s).orElse(bM));
   }

   @Override
   protected awq u() {
      return awr.xo;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.xq;
   }

   @Override
   protected awq l_() {
      return awr.xp;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.xs, 0.15F, 1.0F);
   }

   public cyy t() {
      return cyy.a(this.al.a(bJ) & 15);
   }

   public void b(cyy $$0) {
      byte $$1 = this.al.a(bJ);
      this.al.a(bJ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aR ? c((kk<T>)$$0, this.t()) : super.a($$0);
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

   public boolean x() {
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

   public static cyy a(dkq $$0, iw $$1) {
      jg<dlc> $$2 = $$0.u($$1);
      return cmj.a($$2, $$0.G_());
   }

   @Nullable
   public cmi b(aru $$0, bwl $$1) {
      cmi $$2 = bxe.bc.a($$0, bxd.e);
      if ($$2 != null) {
         cyy $$3 = this.t();
         cyy $$4 = ((cmi)$$1).t();
         $$2.b(cyy.a($$0, $$3, $$4));
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.b(a($$0, this.dv()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
