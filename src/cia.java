import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cia extends cfz {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int ca;
   protected static final ImmutableList<cex<? extends cew<? super cia>>> bY = ImmutableList.of(cex.c, cex.d, cex.f, cex.s);
   protected static final ImmutableList<cdq<?>> bZ = ImmutableList.of(cdq.n, cdq.h, cdq.m, cdq.E, cdq.t, cdq.K, cdq.P, cdq.R, cdq.O, cdq.r, cdq.Z);

   public cia(bty<? extends cfz> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new cap(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cao(this, 10);
   }

   @Override
   protected cdy b(dej $$0) {
      return new cea(this, $$0);
   }

   @Override
   protected bvo.b<cia> dZ() {
      return bvo.a(bZ, bY);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return cib.a(this.dZ().a($$0));
   }

   @Override
   public bvo<cia> dY() {
      return (bvo<cia>)super.dY();
   }

   @Override
   protected awf gp() {
      return awg.zA;
   }

   @Override
   protected void ac() {
      this.dS().ah().a("tadpoleBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("tadpoleActivityUpdate");
      cib.a(this);
      this.dS().ah().c();
      super.ac();
   }

   public static bvt.a gq() {
      return cgd.gt().a(bvu.v, 1.0).a(bvu.s, 6.0);
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dS().B) {
         this.c(this.ca + 1);
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Age", this.ca);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awf w() {
      return null;
   }

   @Nullable
   @Override
   protected awf d(bsj $$0) {
      return awg.zC;
   }

   @Nullable
   @Override
   protected awf o_() {
      return awg.zz;
   }

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if (this.n($$2)) {
         this.a($$0, $$2);
         return brs.a;
      } else {
         return cgf.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      ago.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void m(cvs $$0) {
      cgf.a(this, $$0);
      cyh.a(ks.S, $$0, $$0x -> $$0x.a("Age", this.gr()));
   }

   @Override
   public void h(ug $$0) {
      cgf.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cvs W_() {
      return new cvs(cvw.qL);
   }

   @Override
   public awf y() {
      return awg.dn;
   }

   private boolean n(cvs $$0) {
      return $$0.a(axe.al);
   }

   private void a(cnx $$0, cvs $$1) {
      this.b($$0, $$1);
      this.b(btk.d_(this.gt()));
      this.dS().a(lo.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cnx $$0, cvs $$1) {
      $$1.a(1, $$0);
   }

   private int gr() {
      return this.ca;
   }

   private void b(int $$0) {
      this.c(this.ca + $$0 * 20);
   }

   private void c(int $$0) {
      this.ca = $$0;
      if (this.ca >= b) {
         this.gs();
      }
   }

   private void gs() {
      if (this.dS() instanceof arj $$0) {
         chx $$1 = bty.R.a(this.dS(), btx.i);
         if ($$1 != null) {
            $$1.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$1.a($$0, this.dS().d_($$1.ds()), btx.i, null);
            $$1.u(this.gd());
            if (this.ak()) {
               $$1.b(this.al());
               $$1.p(this.cI());
            }

            $$1.fW();
            $$1.a(this.a(this.av()));
            this.a(awg.zB, 0.15F, 1.0F);
            $$0.a_($$1);
            this.as();
         }
      }
   }

   private int gt() {
      return Math.max(0, b - this.ca);
   }

   @Override
   public boolean ej() {
      return false;
   }
}
