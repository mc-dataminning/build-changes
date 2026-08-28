import java.util.Map;
import javax.annotation.Nullable;

public class cje extends cig implements bxh {
   private static final int bE = 40;
   private static final akg<Byte> bF = akk.a(cje.class, aki.a);
   private static final Map<cwv, Integer> bG = af.a(cwv.class, cje::c);
   private int bI;
   private cdf bJ;

   private static int c(cwv $$0) {
      if ($$0 == cwv.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axu.a(255, azk.d((float)axu.b($$1) * 0.75F), azk.d((float)axu.c($$1) * 0.75F), azk.d((float)axu.d($$1) * 0.75F));
      }
   }

   public static int a(cwv $$0) {
      return bG.get($$0);
   }

   public cje(bwb<? extends cje> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bJ = new cdf(this);
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new ceg(this, 1.25));
      this.bB.a(2, new ccz(this, 1.0));
      this.bB.a(3, new cev(this, 1.1, $$0 -> $$0.a(axi.af), false));
      this.bB.a(4, new cdm(this, 1.1));
      this.bB.a(5, this.bJ);
      this.bB.a(6, new cfa(this, 1.0));
      this.bB.a(7, new cdv(this, cqi.class, 6.0F));
      this.bB.a(8, new cei(this));
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.af);
   }

   @Override
   protected void a(arn $$0) {
      this.bI = this.bJ.h();
      super.a($$0);
   }

   @Override
   public void k_() {
      if (this.dV().C) {
         this.bI = Math.max(0, this.bI - 1);
      }

      super.k_();
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.s, 8.0).a(bxx.v, 0.23F);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bF, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.bI = 40;
      } else {
         super.b($$0);
      }
   }

   public float K(float $$0) {
      if (this.bI <= 0) {
         return 0.0F;
      } else if (this.bI >= 4 && this.bI <= 36) {
         return 1.0F;
      } else {
         return this.bI < 4 ? ((float)this.bI - $$0) / 4.0F : -((float)(this.bI - 40) - $$0) / 4.0F;
      }
   }

   public float L(float $$0) {
      if (this.bI > 4 && this.bI <= 36) {
         float $$1 = ((float)(this.bI - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * azk.a($$1 * 28.7F);
      } else {
         return this.bI > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.sW)) {
         if (this.dV() instanceof arn $$3 && this.a()) {
            this.a($$3, awl.h, $$2);
            this.a(edm.M, $$0);
            $$2.a(1, $$0, d($$1));
            return btq.b;
         }

         return btq.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arn $$0, awl $$1, cxy $$2) {
      $$0.a(null, this, awk.xl, $$1, 1.0F, 1.0F);
      this.a($$0, exh.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            cmn $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.i($$3.dy().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.w(true);
   }

   @Override
   public boolean a() {
      return this.bK() && !this.x() && !this.n_();
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cwv.a($$0.f("Color")));
   }

   @Override
   protected awj u() {
      return awk.xi;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.xk;
   }

   @Override
   protected awj l_() {
      return awk.xj;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.xm, 0.15F, 1.0F);
   }

   public cwv t() {
      return cwv.a(this.al.a(bF) & 15);
   }

   public void b(cwv $$0) {
      byte $$1 = this.al.a(bF);
      this.al.a(bF, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aL ? b((kw<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aL) {
         this.b(b(kx.aL, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   public boolean x() {
      return (this.al.a(bF) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(bF);
      if ($$0) {
         this.al.a(bF, (byte)($$1 | 16));
      } else {
         this.al.a(bF, (byte)($$1 & -17));
      }
   }

   public static cwv a(azs $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cwv.p;
      } else if ($$1 < 10) {
         return cwv.h;
      } else if ($$1 < 15) {
         return cwv.i;
      } else if ($$1 < 18) {
         return cwv.m;
      } else {
         return $$0.a(500) == 0 ? cwv.g : cwv.a;
      }
   }

   @Nullable
   public cje b(arn $$0, bvi $$1) {
      cje $$2 = bwb.ba.a($$0, bwa.e);
      if ($$2 != null) {
         cwv $$3 = this.t();
         cwv $$4 = ((cje)$$1).t();
         $$2.b(cwv.a($$0, $$3, $$4));
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
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.b(a($$0.C_()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
