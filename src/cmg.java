import java.util.Map;
import javax.annotation.Nullable;

public class cmg extends cjk implements byk {
   private static final int bI = 40;
   private static final akl<Byte> bJ = akp.a(cmg.class, akn.a);
   private static final Map<cyw, Integer> bK = ag.a(cyw.class, cmg::c);
   private static final cyw bM = cyw.a;
   private static final boolean bN = false;
   private int bO;
   private cei bP;

   private static int c(cyw $$0) {
      if ($$0 == cyw.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axy.a(255, azo.d((float)axy.b($$1) * 0.75F), azo.d((float)axy.c($$1) * 0.75F), azo.d((float)axy.d($$1) * 0.75F));
      }
   }

   public static int a(cyw $$0) {
      return bK.get($$0);
   }

   public cmg(bxc<? extends cmg> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bP = new cei(this);
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cfj(this, 1.25));
      this.bF.a(2, new cec(this, 1.0));
      this.bF.a(3, new cfy(this, 1.1, $$0 -> $$0.a(axm.ag), false));
      this.bF.a(4, new cep(this, 1.1));
      this.bF.a(5, this.bP);
      this.bF.a(6, new cgd(this, 1.0));
      this.bF.a(7, new cey(this, crx.class, 6.0F));
      this.bF.a(8, new cfl(this));
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ag);
   }

   @Override
   protected void a(ars $$0) {
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

   public static byz.a q() {
      return cjk.gz().a(bza.s, 8.0).a(bza.v, 0.23F);
   }

   @Override
   protected void a(akp.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * azo.a($$1 * 28.7F);
      } else {
         return this.bO > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if ($$2.a(dac.td)) {
         if (this.dV() instanceof ars $$3 && this.a()) {
            this.a($$3, awq.h, $$2);
            this.a(ege.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bur.b;
         }

         return bur.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ars $$0, awq $$1, czy $$2) {
      $$0.a(null, this, awp.xr, $$1, 1.0F, 1.0F);
      this.a($$0, fad.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            coc $$3 = this.a($$0x, $$1x.c(1), 1.0F);
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", cyw.s, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("Sheared", false));
      this.b($$0.<cyw>a("Color", cyw.s).orElse(bM));
   }

   @Override
   protected awo u() {
      return awp.xo;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.xq;
   }

   @Override
   protected awo l_() {
      return awp.xp;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.xs, 0.15F, 1.0F);
   }

   public cyw t() {
      return cyw.a(this.al.a(bJ) & 15);
   }

   public void b(cyw $$0) {
      byte $$1 = this.al.a(bJ);
      this.al.a(bJ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aR ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aR);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aR) {
         this.b(c(kk.aR, $$1));
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

   public static cyw a(dko $$0, iv $$1) {
      jf<dla> $$2 = $$0.u($$1);
      return cmh.a($$2, $$0.G_());
   }

   @Nullable
   public cmg b(ars $$0, bwj $$1) {
      cmg $$2 = bxc.bc.a($$0, bxb.e);
      if ($$2 != null) {
         cyw $$3 = this.t();
         cyw $$4 = ((cmg)$$1).t();
         $$2.b(cyw.a($$0, $$3, $$4));
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
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.b(a($$0, this.dv()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
