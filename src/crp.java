import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class crp extends cre implements dcd.b {
   private static final int bK = 0;
   @Nullable
   private iv bL;
   private int bM = 0;

   public crp(bxc<? extends crp> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cek(this));
      this.bF.a(0, new cgb<>(this, dbu.a(dac.tt, dbv.g), awp.CC, $$0 -> this.dV().W() && !$$0.co()));
      this.bF.a(0, new cgb<>(this, new czy(dac.ru), awp.CH, $$0 -> this.dV().V() && $$0.co()));
      this.bF.a(1, new cfz(this));
      this.bF.a(1, new cdx<>(this, cps.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cdx<>(this, cos.class, 12.0F, 0.5, 0.5));
      this.bF.a(1, new cdx<>(this, cpo.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cdx<>(this, cpn.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cdx<>(this, cpc.class, 15.0F, 0.5, 0.5));
      this.bF.a(1, new cdx<>(this, cox.class, 12.0F, 0.5, 0.5));
      this.bF.a(1, new cdx<>(this, cpr.class, 10.0F, 0.5, 0.5));
      this.bF.a(1, new cfj(this, 0.5));
      this.bF.a(1, new cez(this));
      this.bF.a(2, new crp.a(this, 2.0, 0.35));
      this.bF.a(4, new cfe(this, 0.35));
      this.bF.a(8, new cgd(this, 0.35));
      this.bF.a(9, new cet(this, crx.class, 3.0F, 1.0F));
      this.bF.a(10, new cey(this, bxw.class, 8.0F));
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      return null;
   }

   @Override
   public boolean gw() {
      return false;
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (!$$2.a(dac.uR) && this.bJ() && !this.gu() && !this.n_()) {
         if ($$1 == buq.a) {
            $$0.a(awz.S);
         }

         if (!this.dV().C) {
            if (this.gv().isEmpty()) {
               return bur.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return bur.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gA() {
      diu $$0 = this.gv();

      for (Pair<crn.g[], Integer> $$1 : crn.b) {
         crn.g[] $$2 = (crn.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bM);
      $$0.b("wander_target", iv.a, this.bL);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.bM = $$0.b("DespawnDelay", 0);
      this.bL = $$0.<iv>a("wander_target", iv.a).orElse(null);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dit $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bxh(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awo u() {
      return this.gu() ? awp.CI : awp.CA;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.CF;
   }

   @Override
   protected awo l_() {
      return awp.CB;
   }

   @Override
   public awo j(czy $$0) {
      return $$0.a(dac.ru) ? awp.CD : awp.CE;
   }

   @Override
   protected awo w(boolean $$0) {
      return $$0 ? awp.CJ : awp.CG;
   }

   @Override
   public awo gx() {
      return awp.CJ;
   }

   public void t(int $$0) {
      this.bM = $$0;
   }

   public int gC() {
      return this.bM;
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.gD();
      }
   }

   private void gD() {
      if (this.bM > 0 && !this.gu() && --this.bM == 0) {
         this.aq();
      }
   }

   public void h(@Nullable iv $$0) {
      this.bL = $$0;
   }

   @Nullable
   iv gE() {
      return this.bL;
   }

   class a extends ceq {
      final crp a;
      final double b;
      final double c;

      a(final crp $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         crp.this.bE.m();
      }

      @Override
      public boolean b() {
         iv $$0 = this.a.gE();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         iv $$0 = this.a.gE();
         if ($$0 != null && crp.this.bE.k()) {
            if (this.a($$0, 10.0)) {
               ffq $$1 = new ffq((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               ffq $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               crp.this.bE.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               crp.this.bE.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iv $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
