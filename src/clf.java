import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clf extends cfc implements cjt, clh {
   private static final ajv<Boolean> cc = ajz.a(clf.class, ajx.k);
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
   protected static final ImmutableList<? extends cdx<? extends cdw<? super clf>>> ca = ImmutableList.of(cdx.c, cdx.d, cdx.o, cdx.n);
   protected static final ImmutableList<? extends ccq<?>> cb = ImmutableList.of(
      ccq.r,
      ccq.g,
      ccq.h,
      ccq.k,
      ccq.l,
      ccq.n,
      ccq.m,
      ccq.E,
      ccq.t,
      ccq.o,
      ccq.p,
      ccq.aq,
      new ccq[]{ccq.z, ccq.as, ccq.at, ccq.ap, ccq.K, ccq.aw, ccq.ax, ccq.Z}
   );

   public clf(bsw<? extends clf> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public boolean a(cmv $$0) {
      return !this.fY();
   }

   public static but.a s() {
      return ckb.gs().a(buu.s, 40.0).a(buu.v, 0.3F).a(buu.p, 0.6F).a(buu.d, 1.0).a(buu.c, 6.0);
   }

   @Override
   public boolean D(bsq $$0) {
      if (!($$0 instanceof btl)) {
         return false;
      } else {
         this.cm = 10;
         this.dQ().a(this, (byte)4);
         this.b(avo.mq);
         clg.a(this, (btl)$$0);
         return clh.a(this, (btl)$$0);
      }
   }

   @Override
   protected void e(btl $$0) {
      if (this.t()) {
         clh.b(this, $$0);
      }
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btl) {
            clg.b(this, (btl)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected buo.b<clf> dV() {
      return buo.a(cb, ca);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return clg.a(this.dV().a($$0));
   }

   @Override
   public buo<clf> dU() {
      return (buo<clf>)super.dU();
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("hoglinBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      clg.a(this);
      if (this.x()) {
         this.cn++;
         if (this.cn > 300) {
            this.b(avo.mr);
            this.a((aqt)this.dQ());
         }
      } else {
         this.cn = 0;
      }
   }

   @Override
   public void m_() {
      if (this.cm > 0) {
         this.cm--;
      }

      super.m_();
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.bP = 3;
         this.f(buu.c).a(0.5);
      } else {
         this.bP = 5;
         this.f(buu.c).a(6.0);
      }
   }

   public static boolean c(bsw<clf> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return !$$1.a_($$3.d()).a(dfy.kK);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fR();
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      if (clg.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfy.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqq b(cmv $$0, bqp $$1) {
      bqq $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fP();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cm = 10;
         this.b(avo.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gm() {
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

   private void a(aqt $$0) {
      ckt $$1 = this.a(bsw.bt, true);
      if ($$1 != null) {
         $$1.b(new bry(bsa.i, 200, 0));
      }
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awm.am);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      if (this.go()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cn);
      if (this.co) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.cn = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.ar().a(cc, $$0);
   }

   private boolean go() {
      return this.ar().a(cc);
   }

   public boolean x() {
      return !this.dQ().D_().b() && !this.go() && !this.gb();
   }

   private void x(boolean $$0) {
      this.co = $$0;
   }

   public boolean gn() {
      return this.t() && !this.co;
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      clf $$2 = bsw.Z.a((dcu)$$0);
      if ($$2 != null) {
         $$2.fP();
      }

      return $$2;
   }

   @Override
   public boolean gr() {
      return !clg.c(this) && super.gr();
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   protected avn v() {
      return this.dQ().B ? null : clg.b(this).orElse(null);
   }

   @Override
   protected avn d(brj $$0) {
      return avo.mt;
   }

   @Override
   protected avn n_() {
      return avo.ms;
   }

   @Override
   protected avn aQ() {
      return avo.mY;
   }

   @Override
   protected avn aR() {
      return avo.mX;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      age.a(this);
   }

   @Nullable
   @Override
   public btl p() {
      return this.N();
   }
}
