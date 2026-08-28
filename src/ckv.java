import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckv extends ces implements cjj, ckx {
   private static final ajp<Boolean> cd = ajt.a(ckv.class, ajr.k);
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
   protected static final ImmutableList<? extends cdn<? extends cdm<? super ckv>>> ca = ImmutableList.of(cdn.c, cdn.d, cdn.o, cdn.n);
   protected static final ImmutableList<? extends ccg<?>> cb = ImmutableList.of(
      ccg.r,
      ccg.g,
      ccg.h,
      ccg.k,
      ccg.l,
      ccg.n,
      ccg.m,
      ccg.E,
      ccg.t,
      ccg.o,
      ccg.p,
      ccg.aq,
      new ccg[]{ccg.z, ccg.as, ccg.at, ccg.ap, ccg.K, ccg.aw, ccg.ax, ccg.Z}
   );

   public ckv(bsn<? extends ckv> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
   }

   @Override
   public boolean a(cml $$0) {
      return !this.fZ();
   }

   public static buj.a s() {
      return cjr.gt().a(buk.s, 40.0).a(buk.v, 0.3F).a(buk.p, 0.6F).a(buk.d, 1.0).a(buk.c, 6.0);
   }

   @Override
   public boolean D(bsh $$0) {
      if (!($$0 instanceof btc)) {
         return false;
      } else {
         this.cm = 10;
         this.dR().a(this, (byte)4);
         this.b(avh.mq);
         ckw.a(this, (btc)$$0);
         return ckx.a(this, (btc)$$0);
      }
   }

   @Override
   protected void e(btc $$0) {
      if (this.t()) {
         ckx.b(this, $$0);
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dR().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btc) {
            ckw.b(this, (btc)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bue.b<ckv> dW() {
      return bue.a(cb, ca);
   }

   @Override
   protected bue<?> a(Dynamic<?> $$0) {
      return ckw.a(this.dW().a($$0));
   }

   @Override
   public bue<ckv> dV() {
      return (bue<ckv>)super.dV();
   }

   @Override
   protected void Z() {
      this.dR().ag().a("hoglinBrain");
      this.dV().a((aqm)this.dR(), this);
      this.dR().ag().c();
      ckw.a(this);
      if (this.x()) {
         this.cn++;
         if (this.cn > 300) {
            this.b(avh.mr);
            this.b((aqm)this.dR());
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
         this.f(buk.c).a(0.5);
      } else {
         this.bP = 5;
         this.f(buk.c).a(6.0);
      }
   }

   public static boolean c(bsn<ckv> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return !$$1.a_($$3.d()).a(dfk.kK);
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
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
   public float a(ja $$0, dcj $$1) {
      if (ckw.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dfk.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bqh b(cml $$0, bqg $$1) {
      bqh $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fQ();
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
   public int gn() {
      return this.cm;
   }

   @Override
   public boolean eg() {
      return true;
   }

   @Override
   protected int ei() {
      return this.bP;
   }

   private void b(aqm $$0) {
      ckj $$1 = this.a(bsn.bt, true);
      if ($$1 != null) {
         $$1.b(new brp(brr.i, 200, 0));
      }
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.am);
   }

   public boolean t() {
      return !this.o_();
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
      this.ar().a(cd, $$0);
   }

   private boolean gu() {
      return this.ar().a(cd);
   }

   public boolean x() {
      return !this.dR().D_().b() && !this.gu() && !this.gc();
   }

   private void x(boolean $$0) {
      this.co = $$0;
   }

   public boolean gt() {
      return this.t() && !this.co;
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      ckv $$2 = bsn.Z.a((dcg)$$0);
      if ($$2 != null) {
         $$2.fQ();
      }

      return $$2;
   }

   @Override
   public boolean go() {
      return !ckw.c(this) && super.go();
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return this.dR().B ? null : ckw.b(this).orElse(null);
   }

   @Override
   protected avg d(bra $$0) {
      return avh.mt;
   }

   @Override
   protected avg n_() {
      return avh.ms;
   }

   @Override
   protected avg aR() {
      return avh.mY;
   }

   @Override
   protected avg aS() {
      return avh.mX;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.mv, 0.15F, 1.0F);
   }

   @Override
   protected void Y() {
      super.Y();
      afy.a(this);
   }

   @Nullable
   @Override
   public btc p() {
      return this.N();
   }
}
