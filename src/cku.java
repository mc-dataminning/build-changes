import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cku extends cer implements cji, ckw {
   private static final ajp<Boolean> cd = ajt.a(cku.class, ajr.k);
   private static final float ce = 0.2F;
   private static final int cf = 40;
   private static final float cg = 0.3F;
   private static final int ch = 1;
   private static final float ci = 0.6F;
   private static final int cj = 6;
   private static final float ck = 0.5F;
   private static final int cl = 300;
   private int cm;
   private int cn;
   private boolean co;
   protected static final ImmutableList<? extends cdm<? extends cdl<? super cku>>> ca = ImmutableList.of(cdm.c, cdm.d, cdm.o, cdm.n);
   protected static final ImmutableList<? extends ccf<?>> cb = ImmutableList.of(
      ccf.r,
      ccf.g,
      ccf.h,
      ccf.k,
      ccf.l,
      ccf.n,
      ccf.m,
      ccf.E,
      ccf.t,
      ccf.o,
      ccf.p,
      ccf.aq,
      new ccf[]{ccf.z, ccf.as, ccf.at, ccf.ap, ccf.K, ccf.aw, ccf.ax, ccf.Z}
   );

   public cku(bsm<? extends cku> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public boolean a(cmk $$0) {
      return !this.ga();
   }

   public static bui.a s() {
      return cjq.gu().a(buj.s, 40.0).a(buj.v, 0.3F).a(buj.p, 0.6F).a(buj.d, 1.0).a(buj.c, 6.0);
   }

   @Override
   public boolean D(bsg $$0) {
      if (!($$0 instanceof btb)) {
         return false;
      } else {
         this.cm = 10;
         this.dQ().a(this, (byte)4);
         this.b(avh.mq);
         ckv.a(this, (btb)$$0);
         return ckw.a(this, (btb)$$0);
      }
   }

   @Override
   protected void e(btb $$0) {
      if (this.u()) {
         ckw.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btb) {
            ckv.b(this, (btb)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bud.b<cku> dV() {
      return bud.a(cb, ca);
   }

   @Override
   protected bud<?> a(Dynamic<?> $$0) {
      return ckv.a(this.dV().a($$0));
   }

   @Override
   public bud<cku> dU() {
      return (bud<cku>)super.dU();
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("hoglinBrain");
      this.dU().a((aqm)this.dQ(), this);
      this.dQ().ag().c();
      ckv.a(this);
      if (this.y()) {
         this.cn++;
         if (this.cn > 300) {
            this.b(avh.mr);
            this.c((aqm)this.dQ());
         }
      } else {
         this.cn = 0;
      }
   }

   @Override
   public void n_() {
      if (this.cm > 0) {
         this.cm--;
      }

      super.n_();
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.bP = 3;
         this.f(buj.c).a(0.5);
      } else {
         this.bP = 5;
         this.f(buj.c).a(6.0);
      }
   }

   public static boolean c(bsm<cku> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      return !$$1.a_($$3.d()).a(dfj.kK);
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fT();
   }

   @Override
   public float a(ja $$0, dci $$1) {
      if (ckv.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfj.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      bqg $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fR();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cm = 10;
         this.b(avh.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int go() {
      return this.cm;
   }

   @Override
   public boolean ef() {
      return true;
   }

   @Override
   protected int eh() {
      return this.bP;
   }

   private void c(aqm $$0) {
      cki $$1 = this.a(bsm.bt, true);
      if ($$1 != null) {
         $$1.b(new bro(brq.i, 200, 0));
      }
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.am);
   }

   public boolean u() {
      return !this.p_();
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cd, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      if (this.gv()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cn);
      if (this.co) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cn = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.aq().a(cd, $$0);
   }

   private boolean gv() {
      return this.aq().a(cd);
   }

   public boolean y() {
      return !this.dQ().D_().b() && !this.gv() && !this.gd();
   }

   private void x(boolean $$0) {
      this.co = $$0;
   }

   public boolean gu() {
      return this.u() && !this.co;
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      cku $$2 = bsm.Z.a((dcf)$$0);
      if ($$2 != null) {
         $$2.fR();
      }

      return $$2;
   }

   @Override
   public boolean gp() {
      return !ckv.c(this) && super.gp();
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return this.dQ().B ? null : ckv.b(this).orElse(null);
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.mt;
   }

   @Override
   protected avg o_() {
      return avh.ms;
   }

   @Override
   protected avg aQ() {
      return avh.mY;
   }

   @Override
   protected avg aR() {
      return avh.mX;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Nullable
   @Override
   public btb p() {
      return this.N();
   }
}
