import java.util.Map;
import javax.annotation.Nullable;

public class cjs extends cis implements bxs {
   private static final int bF = 40;
   private static final akj<Byte> bG = akn.a(cjs.class, akl.a);
   private static final Map<cxw, Integer> bH = af.a(cxw.class, cjs::c);
   private int bJ;
   private cdq bK;

   private static int c(cxw $$0) {
      if ($$0 == cxw.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axw.a(255, azm.d((float)axw.b($$1) * 0.75F), azm.d((float)axw.c($$1) * 0.75F), azm.d((float)axw.d($$1) * 0.75F));
      }
   }

   public static int a(cxw $$0) {
      return bH.get($$0);
   }

   public cjs(bwm<? extends cjs> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bK = new cdq(this);
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cer(this, 1.25));
      this.bC.a(2, new cdk(this, 1.0));
      this.bC.a(3, new cfg(this, 1.1, $$0 -> $$0.a(axk.af), false));
      this.bC.a(4, new cdx(this, 1.1));
      this.bC.a(5, this.bK);
      this.bC.a(6, new cfl(this, 1.0));
      this.bC.a(7, new ceg(this, cqy.class, 6.0F));
      this.bC.a(8, new cet(this));
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.af);
   }

   @Override
   protected void a(arq $$0) {
      this.bJ = this.bK.h();
      super.a($$0);
   }

   @Override
   public void k_() {
      if (this.dV().C) {
         this.bJ = Math.max(0, this.bJ - 1);
      }

      super.k_();
   }

   public static byh.a q() {
      return cis.gv().a(byi.s, 8.0).a(byi.v, 0.23F);
   }

   @Override
   protected void a(akn.a $$0) {
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

   public float J(float $$0) {
      if (this.bJ <= 0) {
         return 0.0F;
      } else if (this.bJ >= 4 && this.bJ <= 36) {
         return 1.0F;
      } else {
         return this.bJ < 4 ? ((float)this.bJ - $$0) / 4.0F : -((float)(this.bJ - 40) - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.bJ > 4 && this.bJ <= 36) {
         float $$1 = ((float)(this.bJ - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * azm.a($$1 * 28.7F);
      } else {
         return this.bJ > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if ($$2.a(czc.sY)) {
         if (this.dV() instanceof arq $$3 && this.a()) {
            this.a($$3, awo.h, $$2);
            this.a(eez.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bub.b;
         }

         return bub.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(arq $$0, awo $$1, cyy $$2) {
      $$0.a(null, this, awn.xo, $$1, 1.0F, 1.0F);
      this.a($$0, eyv.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            cnd $$3 = this.a($$0x, $$1x.c(1), 1.0F);
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
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cxw.a($$0.f("Color")));
   }

   @Override
   protected awm u() {
      return awn.xl;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.xn;
   }

   @Override
   protected awm l_() {
      return awn.xm;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.xp, 0.15F, 1.0F);
   }

   public cxw t() {
      return cxw.a(this.al.a(bG) & 15);
   }

   public void b(cxw $$0) {
      byte $$1 = this.al.a(bG);
      this.al.a(bG, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aP ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aP);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aP) {
         this.b(c(kj.aP, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
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

   public static cxw a(azv $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cxw.p;
      } else if ($$1 < 10) {
         return cxw.h;
      } else if ($$1 < 15) {
         return cxw.i;
      } else if ($$1 < 18) {
         return cxw.m;
      } else {
         return $$0.a(500) == 0 ? cxw.g : cxw.a;
      }
   }

   @Nullable
   public cjs b(arq $$0, bvt $$1) {
      cjs $$2 = bwm.bb.a($$0, bwl.e);
      if ($$2 != null) {
         cxw $$3 = this.t();
         cxw $$4 = ((cjs)$$1).t();
         $$2.b(cxw.a($$0, $$3, $$4));
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
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.b(a($$0.C_()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
