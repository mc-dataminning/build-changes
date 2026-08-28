import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cpp extends cpe implements czv.b {
   private static final int cb = 5;
   @Nullable
   private jh cc;
   private int cd;

   public cpp(bvr<? extends cpp> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccy(this));
      this.bT.a(0, new cep<>(this, czo.a(cxt.sZ, czp.g), axf.BX, $$0 -> this.dW().V() && !$$0.cp()));
      this.bT.a(0, new cep<>(this, new cxp(cxt.rc), axf.Cc, $$0 -> this.dW().U() && $$0.cp()));
      this.bT.a(1, new cen(this));
      this.bT.a(1, new ccl<>(this, cnq.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccl<>(this, cmq.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new ccl<>(this, cnm.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccl<>(this, cnl.class, 8.0F, 0.5, 0.5));
      this.bT.a(1, new ccl<>(this, cna.class, 15.0F, 0.5, 0.5));
      this.bT.a(1, new ccl<>(this, cmv.class, 12.0F, 0.5, 0.5));
      this.bT.a(1, new ccl<>(this, cnp.class, 10.0F, 0.5, 0.5));
      this.bT.a(1, new cdx(this, 0.5));
      this.bT.a(1, new cdn(this));
      this.bT.a(2, new cpp.a(this, 2.0, 0.35));
      this.bT.a(4, new cds(this, 0.35));
      this.bT.a(8, new cer(this, 0.35));
      this.bT.a(9, new cdh(this, cpx.class, 3.0F, 1.0F));
      this.bT.a(10, new cdm(this, bwi.class, 8.0F));
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      return null;
   }

   @Override
   public boolean gr() {
      return false;
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      if (!$$2.a(cxt.ux) && this.bL() && !this.gp() && !this.e_()) {
         if ($$1 == bti.a) {
            $$0.a(axp.S);
         }

         if (!this.dW().C) {
            if (this.gq().isEmpty()) {
               return btj.c;
            }

            this.a($$0);
            this.a($$0, this.p_(), 1);
         }

         return btj.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gv() {
      if (this.dW().J().b(csv.c)) {
         this.gy();
      } else {
         cpn.g[] $$0 = (cpn.g[])cpn.b.get(1);
         cpn.g[] $$1 = (cpn.g[])cpn.b.get(2);
         if ($$0 != null && $$1 != null) {
            dgg $$2 = this.gq();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            cpn.g $$4 = $$1[$$3];
            dgf $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gy() {
      dgg $$0 = this.gq();

      for (Pair<cpn.g[], Integer> $$1 : cpn.d) {
         cpn.g[] $$2 = (cpn.g[])$$1.getLeft();
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
   protected void b(dgf $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dW().b(new bvw(this.dW(), this.dB(), this.dD() + 0.5, this.dH(), $$1));
      }
   }

   @Override
   protected axe u() {
      return this.gp() ? axf.Cd : axf.BV;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.Ca;
   }

   @Override
   protected axe o_() {
      return axf.BW;
   }

   @Override
   public axe j(cxp $$0) {
      return $$0.a(cxt.rc) ? axf.BY : axf.BZ;
   }

   @Override
   protected axe x(boolean $$0) {
      return $$0 ? axf.Ce : axf.Cb;
   }

   @Override
   public axe gs() {
      return axf.Ce;
   }

   public void t(int $$0) {
      this.cd = $$0;
   }

   public int gx() {
      return this.cd;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C) {
         this.gz();
      }
   }

   private void gz() {
      if (this.cd > 0 && !this.gp() && --this.cd == 0) {
         this.at();
      }
   }

   public void h(@Nullable jh $$0) {
      this.cc = $$0;
   }

   @Nullable
   jh gB() {
      return this.cc;
   }

   class a extends cde {
      final cpp a;
      final double b;
      final double c;

      a(final cpp $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(cde.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         cpp.this.bS.o();
      }

      @Override
      public boolean b() {
         jh $$0 = this.a.gB();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         jh $$0 = this.a.gB();
         if ($$0 != null && cpp.this.bS.m()) {
            if (this.a($$0, 10.0)) {
               fby $$1 = new fby((double)$$0.u() - this.a.dB(), (double)$$0.v() - this.a.dD(), (double)$$0.w() - this.a.dH()).d();
               fby $$2 = $$1.c(10.0).b(this.a.dB(), this.a.dD(), this.a.dH());
               cpp.this.bS.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               cpp.this.bS.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(jh $$0, double $$1) {
         return !$$0.a(this.a.du(), $$1);
      }
   }
}
