import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cqg extends cjk implements cor, cqi {
   private static final akl<Boolean> bM = akp.a(cqg.class, akn.k);
   private static final int bN = 40;
   private static final float bO = 0.3F;
   private static final int bP = 1;
   private static final float bQ = 0.6F;
   private static final int bR = 6;
   private static final float bS = 0.5F;
   private static final boolean bT = false;
   private static final int bU = 0;
   private static final boolean bV = false;
   public static final int bI = 300;
   private int bW;
   private int bX = 0;
   private boolean bY = false;
   protected static final ImmutableList<? extends cid<? extends cic<? super cqg>>> bJ = ImmutableList.of(cid.c, cid.d, cid.o, cid.n);
   protected static final ImmutableList<? extends cgw<?>> bK = ImmutableList.of(
      cgw.s,
      cgw.g,
      cgw.h,
      cgw.k,
      cgw.l,
      cgw.o,
      cgw.n,
      cgw.F,
      cgw.u,
      cgw.p,
      cgw.q,
      cgw.ar,
      new cgw[]{cgw.A, cgw.at, cgw.au, cgw.aq, cgw.L, cgw.ax, cgw.ay, cgw.aa}
   );

   public cqg(bxc<? extends cqg> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
   }

   @VisibleForTesting
   public void s(int $$0) {
      this.bX = $$0;
   }

   @Override
   public boolean w() {
      return true;
   }

   public static byz.a t() {
      return coz.gx().a(bza.s, 40.0).a(bza.v, 0.3F).a(bza.p, 0.6F).a(bza.d, 1.0).a(bza.c, 6.0);
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      if ($$1 instanceof bxu $$2) {
         this.bW = 10;
         this.dV().a(this, (byte)4);
         this.b(awp.mS);
         cqh.a(this, $$2);
         return cqi.a($$0, this, $$2);
      } else {
         return false;
      }
   }

   @Override
   protected void d(bxu $$0) {
      if (this.x()) {
         cqi.a(this, $$0);
      }
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxu $$4) {
         cqh.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected byu.b<cqg> ed() {
      return byu.a(bK, bJ);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cqh.a(this.ed().a($$0));
   }

   @Override
   public byu<cqg> ec() {
      return (byu<cqg>)super.ec();
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("hoglinBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqh.a(this);
      if (this.gu()) {
         this.bX++;
         if (this.bX > 300) {
            this.b(awp.mT);
            this.gw();
         }
      } else {
         this.bX = 0;
      }
   }

   @Override
   public void k_() {
      if (this.bW > 0) {
         this.bW--;
      }

      super.k_();
   }

   @Override
   protected void j() {
      if (this.n_()) {
         this.bA = 3;
         this.g(bza.c).a(0.5);
      } else {
         this.bA = 5;
         this.g(bza.c).a(6.0);
      }
   }

   public static boolean c(bxc<cqg> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      return !$$1.a_($$3.e()).a(dne.lq);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      if ($$0.G_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.gd();
   }

   @Override
   public float a(iv $$0, dka $$1) {
      if (cqh.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.e()).a(dne.pc) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      bur $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.gc();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.bW = 10;
         this.b(awp.mS);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int q() {
      return this.bW;
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected int e(ars $$0) {
      return this.bA;
   }

   private void gw() {
      this.a(bxc.bO, bwn.a(this, true, false), $$0 -> $$0.a(new bvx(bvz.i, 200, 0)));
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.aq);
   }

   public boolean x() {
      return !this.n_();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bM, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("IsImmuneToZombification", this.gx());
      $$0.a("TimeInOverworld", this.bX);
      $$0.a("CannotBeHunted", this.bY);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("IsImmuneToZombification", false));
      this.bX = $$0.b("TimeInOverworld", 0);
      this.x($$0.b("CannotBeHunted", false));
   }

   public void w(boolean $$0) {
      this.ar().a(bM, $$0);
   }

   private boolean gx() {
      return this.ar().a(bM);
   }

   public boolean gu() {
      return !this.dV().F_().b() && !this.gx() && !this.gj();
   }

   private void x(boolean $$0) {
      this.bY = $$0;
   }

   public boolean gv() {
      return this.x() && !this.bY;
   }

   @Nullable
   @Override
   public bwj a(ars $$0, bwj $$1) {
      cqg $$2 = bxc.ak.a($$0, bxb.e);
      if ($$2 != null) {
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean gB() {
      return !cqh.c(this) && super.gB();
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   protected awo u() {
      return this.dV().C ? null : cqh.b(this).orElse(null);
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.mV;
   }

   @Override
   protected awo l_() {
      return awp.mU;
   }

   @Override
   protected awo aU() {
      return awp.nA;
   }

   @Override
   protected awo aV() {
      return awp.nz;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.mX, 0.15F, 1.0F);
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Nullable
   @Override
   public bxu f() {
      return this.Q();
   }
}
