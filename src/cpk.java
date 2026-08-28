import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cpk extends coz implements czq.b {
   private static final int cb = 5;
   @Nullable
   private jh cc;
   private int cd;

   public cpk(bvm<? extends cpk> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new cct(this));
      this.bT.a(0, new cek<>(this, czj.a(cxo.sZ, czk.g), axf.BW, $$0 -> this.dV().V() && !$$0.cp()));
      this.bT.a(0, new cek<>(this, new cxk(cxo.rc), axf.Cb, $$0 -> this.dV().U() && $$0.cp()));
      this.bT.a(1, new cei(this));
      this.bT.a(1, new ccg<>(this, cnl.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccg<>(this, cml.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new ccg<>(this, cnh.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccg<>(this, cng.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccg<>(this, cmv.class, 15.0F, 0.5, 0.5));
      this.bT.a(1, new ccg<>(this, cmq.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new ccg<>(this, cnk.class, 10.0F, 0.5, 0.5));
      this.bT.a(1, new cds(this, 0.5));
      this.bT.a(1, new cdi(this));
      this.bT.a(2, new cpk.a(this, 2.0, 0.35));
      this.bT.a(4, new cdn(this, 0.35));
      this.bT.a(8, new cem(this, 0.35));
      this.bT.a(9, new cdc(this, cps.class, 3.0F, 1.0F));
      this.bT.a(10, new cdh(this, bwd.class, 8.0F));
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      return null;
   }

   @Override
   public boolean gp() {
      return false;
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if (!$$2.a(cxo.ux) && this.bL() && !this.gn() && !this.e_()) {
         if ($$1 == btd.a) {
            $$0.a(axp.S);
         }

         if (!this.dV().C) {
            if (this.go().isEmpty()) {
               return bte.c;
            }

            this.a($$0);
            this.a($$0, this.p_(), 1);
         }

         return bte.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gt() {
      if (this.dV().J().b(csq.c)) {
         this.gw();
      } else {
         cpi.g[] $$0 = (cpi.g[])cpi.b.get(1);
         cpi.g[] $$1 = (cpi.g[])cpi.b.get(2);
         if ($$0 != null && $$1 != null) {
            dfy $$2 = this.go();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cpi.g $$4 = $$1[$$3];
            dfx $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gw() {
      dfy $$0 = this.go();

      for (Pair<cpi.g[], Integer> $$1 : cpi.d) {
         cpi.g[] $$2 = (cpi.g[])$$1.getLeft();
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
   protected void b(dfx $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new bvr(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected axe u() {
      return this.gn() ? axf.Cc : axf.BU;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.BZ;
   }

   @Override
   protected axe o_() {
      return axf.BV;
   }

   @Override
   public axe j(cxk $$0) {
      return $$0.a(cxo.rc) ? axf.BX : axf.BY;
   }

   @Override
   protected axe x(boolean $$0) {
      return $$0 ? axf.Cd : axf.Ca;
   }

   @Override
   public axe gq() {
      return axf.Cd;
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

   class a extends ccz {
      final cpk a;
      final double b;
      final double c;

      a(final cpk $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cpk.this.bS.o();
      }

      @Override
      public boolean b() {
         jh $$0 = this.a.gz();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gz();
         if ($$0 != null && cpk.this.bS.m()) {
            if (this.a($$0, 10.0)) {
               fbs $$1 = new fbs((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               fbs $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               cpk.this.bS.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cpk.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jh $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
