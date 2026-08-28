import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chs extends cfr {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int cb;
   protected static final ImmutableList<cep<? extends ceo<? super chs>>> bZ = ImmutableList.of(cep.c, cep.d, cep.f, cep.s);
   protected static final ImmutableList<cdi<?>> ca = ImmutableList.of(cdi.n, cdi.h, cdi.m, cdi.E, cdi.t, cdi.K, cdi.P, cdi.R, cdi.O, cdi.r, cdi.Z);

   public chs(btq<? extends cfr> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cah(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cag(this, 10);
   }

   @Override
   protected cdq b(dds $$0) {
      return new cds(this, $$0);
   }

   @Override
   protected bvg.b<chs> dY() {
      return bvg.a(ca, bZ);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return cht.a(this.dY().a($$0));
   }

   @Override
   public bvg<chs> dX() {
      return (bvg<chs>)super.dX();
   }

   @Override
   protected awc gp() {
      return awd.zA;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("tadpoleBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("tadpoleActivityUpdate");
      cht.a(this);
      this.dS().ah().c();
      super.ad();
   }

   public static bvl.a gq() {
      return cfv.gt().a(bvm.v, 1.0).a(bvm.s, 6.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B) {
         this.c(this.cb + 1);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Age", this.cb);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awc w() {
      return null;
   }

   @Nullable
   @Override
   protected awc d(bsb $$0) {
      return awd.zC;
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.zz;
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if (this.p($$2)) {
         this.a($$0, $$2);
         return brk.a;
      } else {
         return cfx.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void o(cvl $$0) {
      cfx.a(this, $$0);
      cya.a(kr.P, $$0, $$0x -> $$0x.a("Age", this.gr()));
   }

   @Override
   public void h(uf $$0) {
      cfx.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cvl V_() {
      return new cvl(cvo.qL);
   }

   @Override
   public awc y() {
      return awd.dn;
   }

   private boolean p(cvl $$0) {
      return $$0.a(axb.al);
   }

   private void a(cnp $$0, cvl $$1) {
      this.b($$0, $$1);
      this.b(btc.d_(this.gt()));
      this.dS().a(ln.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cnp $$0, cvl $$1) {
      $$1.a(1, $$0);
   }

   private int gr() {
      return this.cb;
   }

   private void b(int $$0) {
      this.c(this.cb + $$0 * 20);
   }

   private void c(int $$0) {
      this.cb = $$0;
      if (this.cb >= b) {
         this.gs();
      }
   }

   private void gs() {
      if (this.dS() instanceof arg $$0) {
         chp $$1 = btq.R.a(this.dS(), btp.i);
         if ($$1 != null) {
            $$1.b(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
            $$1.a($$0, this.dS().d_($$1.ds()), btp.i, null);
            $$1.u(this.gd());
            if (this.ak()) {
               $$1.b(this.al());
               $$1.p(this.cI());
            }

            $$1.fV();
            $$1.a(this.a(this.av()));
            this.a(awd.zB, 0.15F, 1.0F);
            $$0.a_($$1);
            this.as();
         }
      }
   }

   private int gt() {
      return Math.max(0, b - this.cb);
   }

   @Override
   public boolean ei() {
      return false;
   }
}
