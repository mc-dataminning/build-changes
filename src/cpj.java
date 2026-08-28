import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cpj extends coy implements czl.b {
   private static final int bH = 5;
   @Nullable
   private ji bI;
   private int bJ;

   public cpj(bvi<? extends cpj> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new ccq(this));
      this.bC.a(0, new ceh<>(this, cze.a(cxl.tk, czf.g), awa.Cw, $$0 -> this.dU().W() && !$$0.co()));
      this.bC.a(0, new ceh<>(this, new cxh(cxl.rn), awa.CB, $$0 -> this.dU().V() && $$0.co()));
      this.bC.a(1, new cef(this));
      this.bC.a(1, new ccd<>(this, cnl.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new ccd<>(this, cml.class, 12.0F, 0.5, 0.5));
      this.bC.a(1, new ccd<>(this, cnh.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new ccd<>(this, cng.class, 8.0F, 0.5, 0.5));
      this.bC.a(1, new ccd<>(this, cmv.class, 15.0F, 0.5, 0.5));
      this.bC.a(1, new ccd<>(this, cmq.class, 12.0F, 0.5, 0.5));
      this.bC.a(1, new ccd<>(this, cnk.class, 10.0F, 0.5, 0.5));
      this.bC.a(1, new cdp(this, 0.5));
      this.bC.a(1, new cdf(this));
      this.bC.a(2, new cpj.a(this, 2.0, 0.35));
      this.bC.a(4, new cdk(this, 0.35));
      this.bC.a(8, new cej(this, 0.35));
      this.bC.a(9, new ccz(this, cpr.class, 3.0F, 1.0F));
      this.bC.a(10, new cde(this, bwa.class, 8.0F));
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return null;
   }

   @Override
   public boolean gu() {
      return false;
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      cxh $$2 = $$0.b($$1);
      if (!$$2.a(cxl.uI) && this.bJ() && !this.gs() && !this.n_()) {
         if ($$1 == bsx.a) {
            $$0.a(awk.S);
         }

         if (!this.dU().C) {
            if (this.gt().isEmpty()) {
               return bsy.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return bsy.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gy() {
      if (this.dU().K().b(csp.b)) {
         this.gB();
      } else {
         cph.g[] $$0 = (cph.g[])cph.b.get(1);
         cph.g[] $$1 = (cph.g[])cph.b.get(2);
         if ($$0 != null && $$1 != null) {
            dfy $$2 = this.gt();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cph.g $$4 = $$1[$$3];
            dfx $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gB() {
      dfy $$0 = this.gt();

      for (Pair<cph.g[], Integer> $$1 : cph.d) {
         cph.g[] $$2 = (cph.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bJ);
      if (this.bI != null) {
         $$0.a("wander_target", uf.a(this.bI));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bJ = $$0.h("DespawnDelay");
      }

      uf.a($$0, "wander_target").ifPresent($$0x -> this.bI = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dfx $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dU().b(new bvn(this.dU(), this.dz(), this.dB() + 0.5, this.dF(), $$1));
      }
   }

   @Override
   protected avz u() {
      return this.gs() ? awa.CC : awa.Cu;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.Cz;
   }

   @Override
   protected avz l_() {
      return awa.Cv;
   }

   @Override
   public avz j(cxh $$0) {
      return $$0.a(cxl.rn) ? awa.Cx : awa.Cy;
   }

   @Override
   protected avz w(boolean $$0) {
      return $$0 ? awa.CD : awa.CA;
   }

   @Override
   public avz gv() {
      return awa.CD;
   }

   public void t(int $$0) {
      this.bJ = $$0;
   }

   public int gA() {
      return this.bJ;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         this.gC();
      }
   }

   private void gC() {
      if (this.bJ > 0 && !this.gs() && --this.bJ == 0) {
         this.at();
      }
   }

   public void i(@Nullable ji $$0) {
      this.bI = $$0;
   }

   @Nullable
   ji gE() {
      return this.bI;
   }

   class a extends ccw {
      final cpj a;
      final double b;
      final double c;

      a(final cpj $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public void e() {
         this.a.i(null);
         cpj.this.bB.m();
      }

      @Override
      public boolean b() {
         ji $$0 = this.a.gE();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         ji $$0 = this.a.gE();
         if ($$0 != null && cpj.this.bB.k()) {
            if (this.a($$0, 10.0)) {
               fbx $$1 = new fbx((double)$$0.u() - this.a.dz(), (double)$$0.v() - this.a.dB(), (double)$$0.w() - this.a.dF()).d();
               fbx $$2 = $$1.c(10.0).b(this.a.dz(), this.a.dB(), this.a.dF());
               cpj.this.bB.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cpj.this.bB.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ji $$0, double $$1) {
         return !$$0.a(this.a.ds(), $$1);
      }
   }
}
