import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cgb extends ceb {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int ci;
   protected static final ImmutableList<ccy<? extends ccx<? super cgb>>> e = ImmutableList.of(ccy.c, ccy.d, ccy.f, ccy.s);
   protected static final ImmutableList<cbr<?>> ch = ImmutableList.of(cbr.n, cbr.h, cbr.m, cbr.E, cbr.t, cbr.K, cbr.P, cbr.R, cbr.O, cbr.r, cbr.Z);

   public cgb(bsb<? extends ceb> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new byq(this, 85, 10, 0.02F, 0.1F, true);
      this.bX = new byp(this, 10);
   }

   @Override
   protected cbz b(dca $$0) {
      return new ccb(this, $$0);
   }

   @Override
   protected btp.b<cgb> ea() {
      return btp.a(ch, e);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return cgc.a(this.ea().a($$0));
   }

   @Override
   public btp<cgb> dZ() {
      return (btp<cgb>)super.dZ();
   }

   @Override
   protected avn gz() {
      return avo.zP;
   }

   @Override
   protected void Y() {
      this.dU().ag().a("tadpoleBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      this.dU().ag().a("tadpoleActivityUpdate");
      cgc.a(this);
      this.dU().ag().c();
      super.Y();
   }

   public static btu.a gA() {
      return bsq.A().a(btv.r, 1.0).a(btv.q, 6.0);
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dU().C) {
         this.u(this.ci + 1);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Age", this.ci);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.u($$0.h("Age"));
   }

   @Nullable
   @Override
   protected avn u() {
      return null;
   }

   @Nullable
   @Override
   protected avn d(bqt $$0) {
      return avo.zR;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.zO;
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (this.o($$2)) {
         this.a($$0, $$2);
         return bqa.a(this.dU().C);
      } else {
         return ceg.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void n(cuh $$0) {
      ceg.a(this, $$0);
      cxf.a(ke.N, $$0, $$0x -> $$0x.a("Age", this.gB()));
   }

   @Override
   public void c(uk $$0) {
      ceg.a(this, $$0);
      if ($$0.e("Age")) {
         this.u($$0.h("Age"));
      }
   }

   @Override
   public cuh b() {
      return new cuh(cuk.sh);
   }

   @Override
   public avn x() {
      return avo.ds;
   }

   private boolean o(cuh $$0) {
      return $$0.a(awm.al);
   }

   private void a(cly $$0, cuh $$1) {
      this.b($$0, $$1);
      this.c(brp.d_(this.gD()));
      this.dU().a(lb.M, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cly $$0, cuh $$1) {
      $$1.a(1, $$0);
   }

   private int gB() {
      return this.ci;
   }

   private void c(int $$0) {
      this.u(this.ci + $$0 * 20);
   }

   private void u(int $$0) {
      this.ci = $$0;
      if (this.ci >= b) {
         this.gC();
      }
   }

   private void gC() {
      if (this.dU() instanceof aqt $$0) {
         cfy $$1 = bsb.T.a(this.dU());
         if ($$1 != null) {
            $$1.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
            $$1.a($$0, this.dU().d_($$1.du()), bss.i, null);
            $$1.t(this.go());
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cJ());
            }

            $$1.gc();
            this.a(avo.zQ, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ao();
         }
      }
   }

   private int gD() {
      return Math.max(0, b - this.ci);
   }

   @Override
   public boolean ep() {
      return false;
   }
}
