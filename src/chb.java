import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chb extends cfb {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static final float c = 0.4F;
   public static final float d = 0.3F;
   private int cd;
   protected static final ImmutableList<cdz<? extends cdy<? super chb>>> e = ImmutableList.of(cdz.c, cdz.d, cdz.f, cdz.s);
   protected static final ImmutableList<ccs<?>> cc = ImmutableList.of(ccs.n, ccs.h, ccs.m, ccs.E, ccs.t, ccs.K, ccs.P, ccs.R, ccs.O, ccs.r, ccs.Z);

   public chb(bsx<? extends cfb> $$0, dcw $$1) {
      super($$0, $$1);
      this.bT = new bzr(this, 85, 10, 0.02F, 0.1F, true);
      this.bS = new bzq(this, 10);
   }

   @Override
   protected cda b(dcw $$0) {
      return new cdc(this, $$0);
   }

   @Override
   protected buq.b<chb> dU() {
      return buq.a(cc, e);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return chc.a(this.dU().a($$0));
   }

   @Override
   public buq<chb> dT() {
      return (buq<chb>)super.dT();
   }

   @Override
   protected avo gl() {
      return avp.zu;
   }

   @Override
   protected void ab() {
      this.dO().ag().a("tadpoleBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      this.dO().ag().a("tadpoleActivityUpdate");
      chc.a(this);
      this.dO().ag().c();
      super.ab();
   }

   public static buv.a gm() {
      return btp.C().a(buw.v, 1.0).a(buw.s, 6.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dO().B) {
         this.s(this.cd + 1);
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Age", this.cd);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avo v() {
      return null;
   }

   @Nullable
   @Override
   protected avo d(brk $$0) {
      return avp.zw;
   }

   @Nullable
   @Override
   protected avo n_() {
      return avp.zt;
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      cuq $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqr.a(this.dO().B);
      } else {
         return cfg.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void x(boolean $$0) {
   }

   @Override
   public void n(cuq $$0) {
      cfg.a(this, $$0);
      cxh.a(kq.N, $$0, $$0x -> $$0x.a("Age", this.gn()));
   }

   @Override
   public void h(ub $$0) {
      cfg.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cuq b() {
      return new cuq(cut.qK);
   }

   @Override
   public avo x() {
      return avp.dn;
   }

   private boolean o(cuq $$0) {
      return $$0.a(awn.al);
   }

   private void a(cmx $$0, cuq $$1) {
      this.b($$0, $$1);
      this.c(bsl.d_(this.gp()));
      this.dO().a(lm.O, this.d(1.0), this.dw() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cmx $$0, cuq $$1) {
      $$1.a(1, $$0);
   }

   private int gn() {
      return this.cd;
   }

   private void c(int $$0) {
      this.s(this.cd + $$0 * 20);
   }

   private void s(int $$0) {
      this.cd = $$0;
      if (this.cd >= b) {
         this.go();
      }
   }

   private void go() {
      if (this.dO() instanceof aqu $$0) {
         cgy $$1 = bsx.R.a(this.dO());
         if ($$1 != null) {
            $$1.b(this.dt(), this.dv(), this.dz(), this.dE(), this.dG());
            $$1.a($$0, this.dO().d_($$1.do()), btr.i, null);
            $$1.u(this.fZ());
            if (this.ai()) {
               $$1.b(this.aj());
               $$1.p(this.cE());
            }

            $$1.fR();
            $$1.a(this.a(this.at()));
            this.a(avp.zv, 0.15F, 1.0F);
            $$0.a_($$1);
            this.aq();
         }
      }
   }

   private int gp() {
      return Math.max(0, b - this.cd);
   }

   @Override
   public boolean ee() {
      return false;
   }
}
