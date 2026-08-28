import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class csa extends crp implements dcp.b {
   private static final int bK = 0;
   @Nullable
   private iw bL;
   private int bM = 0;

   public csa(bxn<? extends csa> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cev(this));
      this.bF.a(0, new cgm<>(this, dcg.a(dao.tt, dch.g), awy.CC, $$0 -> this.dV().W() && !$$0.co()));
      this.bF.a(0, new cgm<>(this, new dak(dao.ru), awy.CH, $$0 -> this.dV().V() && $$0.co()));
      this.bF.a(1, new cgk(this));
      this.bF.a(1, new cei<>(this, cqd.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cei<>(this, cpd.class, 12.0F, 0.5, 0.5));
      this.bF.a(1, new cei<>(this, cpz.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cei<>(this, cpy.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cei<>(this, cpn.class, 15.0F, 0.5, 0.5));
      this.bF.a(1, new cei<>(this, cpi.class, 12.0F, 0.5, 0.5));
      this.bF.a(1, new cei<>(this, cqc.class, 10.0F, 0.5, 0.5));
      this.bF.a(1, new cfu(this, 0.5));
      this.bF.a(1, new cfk(this));
      this.bF.a(2, new csa.a(this, 2.0, 0.35));
      this.bF.a(4, new cfp(this, 0.35));
      this.bF.a(8, new cgo(this, 0.35));
      this.bF.a(9, new cfe(this, csi.class, 3.0F, 1.0F));
      this.bF.a(10, new cfj(this, byh.class, 8.0F));
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      return null;
   }

   @Override
   public boolean gw() {
      return false;
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if (!$$2.a(dao.uR) && this.bJ() && !this.gu() && !this.n_()) {
         if ($$1 == bvb.a) {
            $$0.a(axi.S);
         }

         if (!this.dV().C) {
            if (this.gv().isEmpty()) {
               return bvc.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return bvc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gA() {
      djg $$0 = this.gv();

      for (Pair<cry.g[], Integer> $$1 : cry.b) {
         cry.g[] $$2 = (cry.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bM);
      $$0.b("wander_target", iw.a, this.bL);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.bM = $$0.b("DespawnDelay", 0);
      this.bL = $$0.<iw>a("wander_target", iw.a).orElse(null);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(djf $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bxs(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awx u() {
      return this.gu() ? awy.CI : awy.CA;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.CF;
   }

   @Override
   protected awx l_() {
      return awy.CB;
   }

   @Override
   public awx j(dak $$0) {
      return $$0.a(dao.ru) ? awy.CD : awy.CE;
   }

   @Override
   protected awx w(boolean $$0) {
      return $$0 ? awy.CJ : awy.CG;
   }

   @Override
   public awx gx() {
      return awy.CJ;
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

   public void h(@Nullable iw $$0) {
      this.bL = $$0;
   }

   @Nullable
   iw gE() {
      return this.bL;
   }

   class a extends cfb {
      final csa a;
      final double b;
      final double c;

      a(final csa $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         csa.this.bE.m();
      }

      @Override
      public boolean b() {
         iw $$0 = this.a.gE();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         iw $$0 = this.a.gE();
         if ($$0 != null && csa.this.bE.k()) {
            if (this.a($$0, 10.0)) {
               fgc $$1 = new fgc((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               fgc $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               csa.this.bE.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               csa.this.bE.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iw $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
