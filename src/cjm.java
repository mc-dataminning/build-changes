import java.util.Map;
import javax.annotation.Nullable;

public class cjm extends cio implements bxp {
   private static final int bF = 40;
   private static final akh<Byte> bG = akl.a(cjm.class, akj.a);
   private static final Map<cxq, Integer> bH = af.a(cxq.class, cjm::c);
   private int bJ;
   private cdn bK;

   private static int c(cxq $$0) {
      if ($$0 == cxq.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axu.a(255, azk.d((float)axu.b($$1) * 0.75F), azk.d((float)axu.c($$1) * 0.75F), azk.d((float)axu.d($$1) * 0.75F));
      }
   }

   public static int a(cxq $$0) {
      return bH.get($$0);
   }

   public cjm(bwj<? extends cjm> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bK = new cdn(this);
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new ceo(this, 1.25));
      this.bC.a(2, new cdh(this, 1.0));
      this.bC.a(3, new cfd(this, 1.1, $$0 -> $$0.a(axi.af), false));
      this.bC.a(4, new cdu(this, 1.1));
      this.bC.a(5, this.bK);
      this.bC.a(6, new cfi(this, 1.0));
      this.bC.a(7, new ced(this, cqs.class, 6.0F));
      this.bC.a(8, new ceq(this));
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.af);
   }

   @Override
   protected void a(aro $$0) {
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

   public static bye.a q() {
      return cio.gv().a(byf.s, 8.0).a(byf.v, 0.23F);
   }

   @Override
   protected void a(akl.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * azk.a($$1 * 28.7F);
      } else {
         return this.bJ > 0 ? (float) (Math.PI / 5) : this.k($$0) * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.sW)) {
         if (this.dV() instanceof aro $$3 && this.a()) {
            this.a($$3, awm.h, $$2);
            this.a(eeo.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bty.b;
         }

         return bty.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aro $$0, awm $$1, cys $$2) {
      $$0.a(null, this, awl.xl, $$1, 1.0F, 1.0F);
      this.a($$0, eyj.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            cmx $$3 = this.a($$0x, $$1x.c(1), 1.0F);
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
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("Sheared"));
      this.b(cxq.a($$0.f("Color")));
   }

   @Override
   protected awk u() {
      return awl.xi;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.xk;
   }

   @Override
   protected awk l_() {
      return awl.xj;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.xm, 0.15F, 1.0F);
   }

   public cxq t() {
      return cxq.a(this.al.a(bG) & 15);
   }

   public void b(cxq $$0) {
      byte $$1 = this.al.a(bG);
      this.al.a(bG, (byte)($$1 & 240 | $$0.a() & 15));
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aO ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aO);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aO) {
         this.b(c(kj.aO, $$1));
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

   public static cxq a(azt $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cxq.p;
      } else if ($$1 < 10) {
         return cxq.h;
      } else if ($$1 < 15) {
         return cxq.i;
      } else if ($$1 < 18) {
         return cxq.m;
      } else {
         return $$0.a(500) == 0 ? cxq.g : cxq.a;
      }
   }

   @Nullable
   public cjm b(aro $$0, bvq $$1) {
      cjm $$2 = bwj.bb.a($$0, bwi.e);
      if ($$2 != null) {
         cxq $$3 = this.t();
         cxq $$4 = ((cjm)$$1).t();
         $$2.b(cxq.a($$0, $$3, $$4));
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
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.b(a($$0.C_()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
