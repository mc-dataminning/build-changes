import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clh extends cfe implements cjv, clj {
   private static final ajw<Boolean> cc = aka.a(clh.class, ajy.k);
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
   protected static final ImmutableList<? extends cdz<? extends cdy<? super clh>>> ca = ImmutableList.of(cdz.c, cdz.d, cdz.o, cdz.n);
   protected static final ImmutableList<? extends ccs<?>> cb = ImmutableList.of(
      ccs.r,
      ccs.g,
      ccs.h,
      ccs.k,
      ccs.l,
      ccs.n,
      ccs.m,
      ccs.E,
      ccs.t,
      ccs.o,
      ccs.p,
      ccs.aq,
      new ccs[]{ccs.z, ccs.as, ccs.at, ccs.ap, ccs.K, ccs.aw, ccs.ax, ccs.Z}
   );

   public clh(bsx<? extends clh> $$0, dcw $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public boolean y() {
      return true;
   }

   public static buv.a s() {
      return ckd.gq().a(buw.s, 40.0).a(buw.v, 0.3F).a(buw.p, 0.6F).a(buw.d, 1.0).a(buw.c, 6.0);
   }

   @Override
   public boolean D(bsr $$0) {
      if (!($$0 instanceof btn)) {
         return false;
      } else {
         this.cm = 10;
         this.dO().a(this, (byte)4);
         this.b(avp.mq);
         cli.a(this, (btn)$$0);
         return clj.a(this, (btn)$$0);
      }
   }

   @Override
   protected void e(btn $$0) {
      if (this.t()) {
         clj.b(this, $$0);
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dO().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btn) {
            cli.b(this, (btn)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected buq.b<clh> dU() {
      return buq.a(cb, ca);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return cli.a(this.dU().a($$0));
   }

   @Override
   public buq<clh> dT() {
      return (buq<clh>)super.dT();
   }

   @Override
   protected void ab() {
      this.dO().ag().a("hoglinBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      cli.a(this);
      if (this.x()) {
         this.cn++;
         if (this.cn > 300) {
            this.b(avp.mr);
            this.a((aqu)this.dO());
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
         this.f(buw.c).a(0.5);
      } else {
         this.bP = 5;
         this.f(buw.c).a(6.0);
      }
   }

   public static boolean c(bsx<clh> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return !$$1.a_($$3.e()).a(dga.kK);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
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
   public float a(jd $$0, dcz $$1) {
      if (cli.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dga.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqr b(cmx $$0, bqq $$1) {
      bqr $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fR();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cm = 10;
         this.b(avp.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gk() {
      return this.cm;
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   protected int eg() {
      return this.bP;
   }

   private void a(aqu $$0) {
      ckv $$1 = this.a(bsx.bt, true);
      if ($$1 != null) {
         $$1.b(new brz(bsb.i, 200, 0));
      }
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.am);
   }

   public boolean t() {
      return !this.o_();
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      if (this.gm()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.cn);
      if (this.co) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.x($$0.q("IsImmuneToZombification"));
      this.cn = $$0.h("TimeInOverworld");
      this.y($$0.q("CannotBeHunted"));
   }

   public void x(boolean $$0) {
      this.ar().a(cc, $$0);
   }

   private boolean gm() {
      return this.ar().a(cc);
   }

   public boolean x() {
      return !this.dO().D_().b() && !this.gm() && !this.fZ();
   }

   private void y(boolean $$0) {
      this.co = $$0;
   }

   public boolean gl() {
      return this.t() && !this.co;
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      clh $$2 = bsx.Z.a((dcw)$$0);
      if ($$2 != null) {
         $$2.fR();
      }

      return $$2;
   }

   @Override
   public boolean gp() {
      return !cli.c(this) && super.gp();
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   protected avo v() {
      return this.dO().B ? null : cli.b(this).orElse(null);
   }

   @Override
   protected avo d(brk $$0) {
      return avp.mt;
   }

   @Override
   protected avo n_() {
      return avp.ms;
   }

   @Override
   protected avo aQ() {
      return avp.mY;
   }

   @Override
   protected avo aR() {
      return avp.mX;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.mv, 0.15F, 1.0F);
   }

   @Override
   protected void aa() {
      super.aa();
      agf.a(this);
   }

   @Nullable
   @Override
   public btn p() {
      return this.P();
   }
}
