import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cpo extends cpd implements czu.b {
   private static final int cb = 5;
   @Nullable
   private jh cc;
   private int cd;

   public cpo(bvq<? extends cpo> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccx(this));
      this.bT.a(0, new ceo<>(this, czn.a(cxs.sZ, czo.g), axf.BX, $$0 -> this.dV().V() && !$$0.cp()));
      this.bT.a(0, new ceo<>(this, new cxo(cxs.rc), axf.Cc, $$0 -> this.dV().U() && $$0.cp()));
      this.bT.a(1, new cem(this));
      this.bT.a(1, new cck<>(this, cnp.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new cck<>(this, cmp.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new cck<>(this, cnl.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new cck<>(this, cnk.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new cck<>(this, cmz.class, 15.0F, 0.5, 0.5));
      this.bT.a(1, new cck<>(this, cmu.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new cck<>(this, cno.class, 10.0F, 0.5, 0.5));
      this.bT.a(1, new cdw(this, 0.5));
      this.bT.a(1, new cdm(this));
      this.bT.a(2, new cpo.a(this, 2.0, 0.35));
      this.bT.a(4, new cdr(this, 0.35));
      this.bT.a(8, new ceq(this, 0.35));
      this.bT.a(9, new cdg(this, cpw.class, 3.0F, 1.0F));
      this.bT.a(10, new cdl(this, bwh.class, 8.0F));
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      return null;
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if (!$$2.a(cxs.ux) && this.bL() && !this.gn() && !this.e_()) {
         if ($$1 == bth.a) {
            $$0.a(axp.S);
         }

         if (!this.dV().C) {
            if (this.go().isEmpty()) {
               return bti.c;
            }

            this.a($$0);
            this.a($$0, this.p_(), 1);
         }

         return bti.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gt() {
      if (this.dV().J().b(csu.c)) {
         this.gw();
      } else {
         cpm.g[] $$0 = (cpm.g[])cpm.b.get(1);
         cpm.g[] $$1 = (cpm.g[])cpm.b.get(2);
         if ($$0 != null && $$1 != null) {
            dgf $$2 = this.go();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cpm.g $$4 = $$1[$$3];
            dge $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gw() {
      dgf $$0 = this.go();

      for (Pair<cpm.g[], Integer> $$1 : cpm.d) {
         cpm.g[] $$2 = (cpm.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cd);
      if (this.cc != null) {
         $$0.a("wander_target", vm.a(this.cc));
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cd = $$0.h("DespawnDelay");
      }

      vm.a($$0, "wander_target").ifPresent($$0x -> this.cc = $$0x);
      this.c_(Math.max(0, this.Z_()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dge $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bvv(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected axe u() {
      return this.gn() ? axf.Cd : axf.BV;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.Ca;
   }

   @Override
   protected axe o_() {
      return axf.BW;
   }

   @Override
   public axe j(cxo $$0) {
      return $$0.a(cxs.rc) ? axf.BY : axf.BZ;
   }

   @Override
   protected axe x(boolean $$0) {
      return $$0 ? axf.Ce : axf.Cb;
   }

   @Override
   public axe gq() {
      return axf.Ce;
   }

   public void t(int $$0) {
      this.cd = $$0;
   }

   public int gv() {
      return this.cd;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.gx();
      }
   }

   private void gx() {
      if (this.cd > 0 && !this.gn() && --this.cd == 0) {
         this.at();
      }
   }

   public void h(@Nullable jh $$0) {
      this.cc = $$0;
   }

   @Nullable
   jh gz() {
      return this.cc;
   }

   class a extends cdd {
      final cpo a;
      final double b;
      final double c;

      a(final cpo $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cpo.this.bS.o();
      }

      @Override
      public boolean b() {
         jh $$0 = this.a.gz();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gz();
         if ($$0 != null && cpo.this.bS.m()) {
            if (this.a($$0, 10.0)) {
               fbx $$1 = new fbx((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               fbx $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               cpo.this.bS.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cpo.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jh $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
