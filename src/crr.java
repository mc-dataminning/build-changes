import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class crr extends crg implements dcf.b {
   private static final int bK = 0;
   @Nullable
   private iw bL;
   private int bM = 0;

   public crr(bxe<? extends crr> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cem(this));
      this.bF.a(0, new cgd<>(this, dbw.a(dae.tt, dbx.g), awr.CC, $$0 -> this.dV().W() && !$$0.co()));
      this.bF.a(0, new cgd<>(this, new daa(dae.ru), awr.CH, $$0 -> this.dV().V() && $$0.co()));
      this.bF.a(1, new cgb(this));
      this.bF.a(1, new cdz<>(this, cpu.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cdz<>(this, cou.class, 12.0F, 0.5, 0.5));
      this.bF.a(1, new cdz<>(this, cpq.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cdz<>(this, cpp.class, 8.0F, 0.5, 0.5));
      this.bF.a(1, new cdz<>(this, cpe.class, 15.0F, 0.5, 0.5));
      this.bF.a(1, new cdz<>(this, coz.class, 12.0F, 0.5, 0.5));
      this.bF.a(1, new cdz<>(this, cpt.class, 10.0F, 0.5, 0.5));
      this.bF.a(1, new cfl(this, 0.5));
      this.bF.a(1, new cfb(this));
      this.bF.a(2, new crr.a(this, 2.0, 0.35));
      this.bF.a(4, new cfg(this, 0.35));
      this.bF.a(8, new cgf(this, 0.35));
      this.bF.a(9, new cev(this, crz.class, 3.0F, 1.0F));
      this.bF.a(10, new cfa(this, bxy.class, 8.0F));
   }

   @Nullable
   @Override
   public bwl a(aru $$0, bwl $$1) {
      return null;
   }

   @Override
   public boolean gw() {
      return false;
   }

   @Override
   public but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if (!$$2.a(dae.uR) && this.bJ() && !this.gu() && !this.n_()) {
         if ($$1 == bus.a) {
            $$0.a(axb.S);
         }

         if (!this.dV().C) {
            if (this.gv().isEmpty()) {
               return but.c;
            }

            this.a($$0);
            this.a($$0, this.m_(), 1);
         }

         return but.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gA() {
      diw $$0 = this.gv();

      for (Pair<crp.g[], Integer> $$1 : crp.b) {
         crp.g[] $$2 = (crp.g[])$$1.getLeft();
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
   protected void b(div $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bxj(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected awq u() {
      return this.gu() ? awr.CI : awr.CA;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.CF;
   }

   @Override
   protected awq l_() {
      return awr.CB;
   }

   @Override
   public awq j(daa $$0) {
      return $$0.a(dae.ru) ? awr.CD : awr.CE;
   }

   @Override
   protected awq w(boolean $$0) {
      return $$0 ? awr.CJ : awr.CG;
   }

   @Override
   public awq gx() {
      return awr.CJ;
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

   class a extends ces {
      final crr a;
      final double b;
      final double c;

      a(final crr $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         crr.this.bE.m();
      }

      @Override
      public boolean b() {
         iw $$0 = this.a.gE();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         iw $$0 = this.a.gE();
         if ($$0 != null && crr.this.bE.k()) {
            if (this.a($$0, 10.0)) {
               ffs $$1 = new ffs((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               ffs $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               crr.this.bE.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               crr.this.bE.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(iw $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
