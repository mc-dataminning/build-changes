import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckr extends ceo implements cjf, ckt {
   private static final ajp<Boolean> cd = ajt.a(ckr.class, ajr.k);
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
   protected static final ImmutableList<? extends cdj<? extends cdi<? super ckr>>> ca = ImmutableList.of(cdj.c, cdj.d, cdj.o, cdj.n);
   protected static final ImmutableList<? extends ccc<?>> cb = ImmutableList.of(
      ccc.r,
      ccc.g,
      ccc.h,
      ccc.k,
      ccc.l,
      ccc.n,
      ccc.m,
      ccc.E,
      ccc.t,
      ccc.o,
      ccc.p,
      ccc.aq,
      new ccc[]{ccc.z, ccc.as, ccc.at, ccc.ap, ccc.K, ccc.aw, ccc.ax, ccc.Z}
   );

   public ckr(bsj<? extends ckr> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public boolean a(cmh $$0) {
      return !this.fZ();
   }

   public static buf.a s() {
      return cjn.gt().a(bug.s, 40.0).a(bug.v, 0.3F).a(bug.p, 0.6F).a(bug.d, 1.0).a(bug.c, 6.0);
   }

   @Override
   public boolean D(bsd $$0) {
      if (!($$0 instanceof bsy)) {
         return false;
      } else {
         this.cm = 10;
         this.dP().a(this, (byte)4);
         this.b(avf.mq);
         cks.a(this, (bsy)$$0);
         return ckt.a(this, (bsy)$$0);
      }
   }

   @Override
   protected void e(bsy $$0) {
      if (this.u()) {
         ckt.b(this, $$0);
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsy) {
            cks.b(this, (bsy)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bua.b<ckr> dU() {
      return bua.a(cb, ca);
   }

   @Override
   protected bua<?> a(Dynamic<?> $$0) {
      return cks.a(this.dU().a($$0));
   }

   @Override
   public bua<ckr> dT() {
      return (bua<ckr>)super.dT();
   }

   @Override
   protected void Z() {
      this.dP().ag().a("hoglinBrain");
      this.dT().a((aqk)this.dP(), this);
      this.dP().ag().c();
      cks.a(this);
      if (this.y()) {
         this.cn++;
         if (this.cn > 300) {
            this.b(avf.mr);
            this.c((aqk)this.dP());
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
         this.f(bug.c).a(0.5);
      } else {
         this.bP = 5;
         this.f(bug.c).a(6.0);
      }
   }

   public static boolean c(bsj<ckr> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      return !$$1.a_($$3.d()).a(dfh.kK);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fS();
   }

   @Override
   public float a(ja $$0, dcg $$1) {
      if (cks.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfh.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      bqd $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fQ();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cm = 10;
         this.b(avf.mq);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
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

   private void c(aqk $$0) {
      ckf $$1 = this.a(bsj.bt, true);
      if ($$1 != null) {
         $$1.b(new brl(brn.i, 200, 0));
      }
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.am);
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
      if (this.gu()) {
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
      this.ap().a(cd, $$0);
   }

   private boolean gu() {
      return this.ap().a(cd);
   }

   public boolean y() {
      return !this.dP().D_().b() && !this.gu() && !this.gc();
   }

   private void x(boolean $$0) {
      this.co = $$0;
   }

   public boolean gt() {
      return this.u() && !this.co;
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      ckr $$2 = bsj.Z.a((dcd)$$0);
      if ($$2 != null) {
         $$2.fQ();
      }

      return $$2;
   }

   @Override
   public boolean go() {
      return !cks.c(this) && super.go();
   }

   @Override
   public avg de() {
      return avg.f;
   }

   @Override
   protected ave v() {
      return this.dP().B ? null : cks.b(this).orElse(null);
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.mt;
   }

   @Override
   protected ave o_() {
      return avf.ms;
   }

   @Override
   protected ave aP() {
      return avf.mY;
   }

   @Override
   protected ave aQ() {
      return avf.mX;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Nullable
   @Override
   public bsy p() {
      return this.N();
   }
}
