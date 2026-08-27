import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cki extends cee implements ciu, ckk {
   private static final ajy<Boolean> ck = akc.a(cki.class, aka.k);
   private static final float cl = 0.2F;
   private static final int cm = 40;
   private static final float cn = 0.3F;
   private static final int co = 1;
   private static final float cp = 0.6F;
   private static final int cq = 6;
   private static final float cr = 0.5F;
   private static final int cs = 300;
   private int ct;
   private int cu;
   private boolean cv;
   protected static final ImmutableList<? extends ccy<? extends ccx<? super cki>>> ch = ImmutableList.of(ccy.c, ccy.d, ccy.o, ccy.n);
   protected static final ImmutableList<? extends cbr<?>> ci = ImmutableList.of(
      cbr.r,
      cbr.g,
      cbr.h,
      cbr.k,
      cbr.l,
      cbr.n,
      cbr.m,
      cbr.E,
      cbr.t,
      cbr.o,
      cbr.p,
      cbr.aq,
      new cbr[]{cbr.z, cbr.as, cbr.at, cbr.ap, cbr.K, cbr.aw, cbr.ax, cbr.Z}
   );

   public cki(bsb<? extends cki> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
   }

   @Override
   public boolean a(cly $$0) {
      return !this.gl();
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 40.0).a(btv.r, 0.3F).a(btv.n, 0.6F).a(btv.d, 1.0).a(btv.c, 6.0);
   }

   @Override
   public boolean C(brv $$0) {
      if (!($$0 instanceof bso)) {
         return false;
      } else {
         this.ct = 10;
         this.dU().a(this, (byte)4);
         this.b(avo.mG);
         ckj.a(this, (bso)$$0);
         return ckk.a(this, (bso)$$0);
      }
   }

   @Override
   protected void e(bso $$0) {
      if (this.t()) {
         ckk.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dU().C) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bso) {
            ckj.b(this, (bso)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected btp.b<cki> ea() {
      return btp.a(ci, ch);
   }

   @Override
   protected btp<?> a(Dynamic<?> $$0) {
      return ckj.a(this.ea().a($$0));
   }

   @Override
   public btp<cki> dZ() {
      return (btp<cki>)super.dZ();
   }

   @Override
   protected void Y() {
      this.dU().ag().a("hoglinBrain");
      this.dZ().a((aqt)this.dU(), this);
      this.dU().ag().c();
      ckj.a(this);
      if (this.x()) {
         this.cu++;
         if (this.cu > 300) {
            this.b(avo.mH);
            this.a((aqt)this.dU());
         }
      } else {
         this.cu = 0;
      }
   }

   @Override
   public void m_() {
      if (this.ct > 0) {
         this.ct--;
      }

      super.m_();
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.bW = 3;
         this.f(btv.c).a(0.5);
      } else {
         this.bW = 5;
         this.f(btv.c).a(6.0);
      }
   }

   public static boolean c(bsb<cki> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return !$$1.a_($$3.d()).a(dfe.lI);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$0.F_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.ge();
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      if (ckj.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfe.pw) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      bqa $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gc();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ct = 10;
         this.b(avo.mG);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gy() {
      return this.ct;
   }

   @Override
   public boolean ep() {
      return true;
   }

   @Override
   public int er() {
      return this.bW;
   }

   private void a(aqt $$0) {
      cjw $$1 = this.a(bsb.bx, true);
      if ($$1 != null) {
         $$1.b(new brh(brj.i, 200, 0));
      }
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.am);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ck, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (this.gF()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cu);
      if (this.cv) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cu = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.ap().a(ck, $$0);
   }

   private boolean gF() {
      return this.ap().a(ck);
   }

   public boolean x() {
      return !this.dU().E_().b() && !this.gF() && !this.go();
   }

   private void x(boolean $$0) {
      this.cv = $$0;
   }

   public boolean gE() {
      return this.t() && !this.cv;
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      cki $$2 = bsb.ab.a((dca)$$0);
      if ($$2 != null) {
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean gz() {
      return !ckj.c(this) && super.gz();
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected avn u() {
      return this.dU().C ? null : ckj.b(this).orElse(null);
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.mJ;
   }

   @Override
   protected avn n_() {
      return avo.mI;
   }

   @Override
   protected avn aT() {
      return avo.no;
   }

   @Override
   protected avn aU() {
      return avo.nn;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.mL, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      agi.a(this);
   }
}
