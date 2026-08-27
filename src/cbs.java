import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cbs extends bzu {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bys<? extends byr<? super cbs>>> e = ImmutableList.of(bys.c, bys.d, bys.f, bys.s);
   protected static final ImmutableList<bxl<?>> bT = ImmutableList.of(bxl.n, bxl.h, bxl.m, bxl.E, bxl.t, bxl.K, bxl.P, bxl.R, bxl.O, bxl.r, bxl.Z);

   public cbs(bnw<? extends bzu> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new buk(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new buj(this, 10);
   }

   @Override
   protected bxt b(cvr $$0) {
      return new bxv(this, $$0);
   }

   @Override
   protected bpj.b<cbs> dP() {
      return bpj.a(bT, e);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cbt.a(this.dP().a($$0));
   }

   @Override
   public bpj<cbs> dO() {
      return (bpj<cbs>)super.dO();
   }

   @Override
   protected atk gh() {
      return atl.yN;
   }

   @Override
   protected void aa() {
      this.dM().ae().a("tadpoleBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("tadpoleActivityUpdate");
      cbt.a(this);
      this.dM().ae().c();
      super.aa();
   }

   public static bpo.a gi() {
      return bok.C().a(bpp.o, 1.0).a(bpp.n, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B) {
         this.t(this.bU + 1);
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.t($$0.h("Age"));
   }

   @Nullable
   @Override
   protected atk y() {
      return null;
   }

   @Nullable
   @Override
   protected atk d(bmp $$0) {
      return atl.yP;
   }

   @Nullable
   @Override
   protected atk n_() {
      return atl.yM;
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return blw.a(this.dM().B);
      } else {
         return bzz.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cpd $$0) {
      bzz.a(this, $$0);
      sw $$1 = $$0.x();
      $$1.a("Age", this.gj());
   }

   @Override
   public void c(sw $$0) {
      bzz.a(this, $$0);
      if ($$0.e("Age")) {
         this.t($$0.h("Age"));
      }
   }

   @Override
   public cpd b() {
      return new cpd(cpg.qJ);
   }

   @Override
   public atk A() {
      return atl.df;
   }

   private boolean m(cpd $$0) {
      return cbp.bT.a($$0);
   }

   private void a(chl $$0, cpd $$1) {
      this.b($$0, $$1);
      this.c(bnl.d_(this.gl()));
      this.dM().a(jz.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(chl $$0, cpd $$1) {
      if (!$$0.fU().d) {
         $$1.h(1);
      }
   }

   private int gj() {
      return this.bU;
   }

   private void c(int $$0) {
      this.t(this.bU + $$0 * 20);
   }

   private void t(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gk();
      }
   }

   private void gk() {
      if (this.dM() instanceof aow $$0) {
         cbp $$1 = bnw.Q.a(this.dM());
         if ($$1 != null) {
            $$1.b(this.dr(), this.dt(), this.dx(), this.dC(), this.dE());
            $$1.a($$0, this.dM().d_($$1.dm()), bom.i, null, null);
            $$1.t(this.fW());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fL();
            this.a(atl.yO, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gl() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ed() {
      return false;
   }
}
