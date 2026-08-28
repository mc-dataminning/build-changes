import java.util.Map;
import javax.annotation.Nullable;

public class cly extends ciz implements bxz {
   private static final int bG = 40;
   private static final akj<Byte> bH = akn.a(cly.class, akl.a);
   private static final Map<cyi, Integer> bI = ag.a(cyi.class, cly::c);
   private int bK;
   private cdx bL;

   private static int c(cyi $$0) {
      if ($$0 == cyi.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axw.a(255, azm.d((float)axw.b($$1) * 0.75F), azm.d((float)axw.c($$1) * 0.75F), azm.d((float)axw.d($$1) * 0.75F));
      }
   }

   public static int a(cyi $$0) {
      return bI.get($$0);
   }

   public cly(bwr<? extends cly> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bL = new cdx(this);
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cey(this, 1.25));
      this.bD.a(2, new cdr(this, 1.0));
      this.bD.a(3, new cfn(this, 1.1, $$0 -> $$0.a(axk.ag), false));
      this.bD.a(4, new cee(this, 1.1));
      this.bD.a(5, this.bL);
      this.bD.a(6, new cfs(this, 1.0));
      this.bD.a(7, new cen(this, crj.class, 6.0F));
      this.bD.a(8, new cfa(this));
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.ag);
   }

   @Override
   protected void a(arq $$0) {
      this.bK = this.bL.h();
      super.a($$0);
   }

   @Override
   public void k_() {
      if (this.dU().C) {
         this.bK = Math.max(0, this.bK - 1);
      }

      super.k_();
   }

   public static byo.a q() {
      return ciz.gy().a(byp.s, 8.0).a(byp.v, 0.23F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.bK = 40;
      } else {
         super.b($$0);
      }
   }

   public float J(float $$0) {
      if (this.bK <= 0) {
         return 0.0F;
      } else if (this.bK >= 4 && this.bK <= 36) {
         return 1.0F;
      } else {
         return this.bK < 4 ? ((float)this.bK - $$0) / 4.0F : -((float)(this.bK - 40) - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.bK > 4 && this.bK <= 36) {
         float $$1 = ((float)(this.bK - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * azm.a($$1 * 28.7F);
      } else {
         return this.bK > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if ($$2.a(czo.td)) {
         if (this.dU() instanceof arq $$3 && this.a()) {
            this.a($$3, awo.h, $$2);
            this.a(efo.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bug.b;
         }

         return bug.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arq $$0, awo $$1, czk $$2) {
      $$0.a(null, this, awn.xr, $$1, 1.0F, 1.0F);
      this.a($$0, ezk.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            cno $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.i($$3.dx().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.w(true);
   }

   @Override
   public boolean a() {
      return this.bI() && !this.x() && !this.n_();
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", cyi.s, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.o("Sheared"));
      this.b($$0.<cyi>a("Color", cyi.s).orElse(cyi.a));
   }

   @Override
   protected awm u() {
      return awn.xo;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.xq;
   }

   @Override
   protected awm l_() {
      return awn.xp;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.xs, 0.15F, 1.0F);
   }

   public cyi t() {
      return cyi.a(this.al.a(bH) & 15);
   }

   public void b(cyi $$0) {
      byte $$1 = this.al.a(bH);
      this.al.a(bH, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aQ ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aQ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aQ) {
         this.b(c(kk.aQ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public boolean x() {
      return (this.al.a(bH) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(bH);
      if ($$0) {
         this.al.a(bH, (byte)($$1 | 16));
      } else {
         this.al.a(bH, (byte)($$1 & -17));
      }
   }

   public static cyi a(djy $$0, iv $$1) {
      jf<dkk> $$2 = $$0.u($$1);
      return clz.a($$2, $$0.C_());
   }

   @Nullable
   public cly b(arq $$0, bvy $$1) {
      cly $$2 = bwr.bb.a($$0, bwq.e);
      if ($$2 != null) {
         cyi $$3 = this.t();
         cyi $$4 = ((cly)$$1).t();
         $$2.b(cyi.a($$0, $$3, $$4));
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
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.b(a($$0, this.du()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
