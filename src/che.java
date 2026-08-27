import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class che extends cbe implements cfs, chg {
   private static final aim<Boolean> ca = aiq.a(che.class, aio.k);
   private static final float cb = 0.2F;
   private static final int cc = 40;
   private static final float cd = 0.3F;
   private static final int ce = 1;
   private static final float cf = 0.6F;
   private static final int cg = 6;
   private static final float ch = 0.5F;
   private static final int ci = 300;
   private int cj;
   private int ck;
   private boolean cl;
   protected static final ImmutableList<? extends bzz<? extends bzy<? super che>>> bX = ImmutableList.of(bzz.c, bzz.d, bzz.o, bzz.n);
   protected static final ImmutableList<? extends bys<?>> bY = ImmutableList.of(
      bys.r,
      bys.g,
      bys.h,
      bys.k,
      bys.l,
      bys.n,
      bys.m,
      bys.E,
      bys.t,
      bys.o,
      bys.p,
      bys.aq,
      new bys[]{bys.z, bys.as, bys.at, bys.ap, bys.K, bys.aw, bys.ax, bys.Z}
   );

   public che(bpd<? extends che> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public boolean a(ciu $$0) {
      return !this.gb();
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.q, 40.0).a(bqw.r, 0.3F).a(bqw.n, 0.6F).a(bqw.d, 1.0).a(bqw.c, 6.0);
   }

   @Override
   public boolean C(box $$0) {
      if (!($$0 instanceof bpp)) {
         return false;
      } else {
         this.cj = 10;
         this.dM().a(this, (byte)4);
         this.b(aty.lZ);
         chf.a(this, (bpp)$$0);
         return chg.a(this, (bpp)$$0);
      }
   }

   @Override
   protected void e(bpp $$0) {
      if (this.s()) {
         chg.b(this, $$0);
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bpp) {
            chf.b(this, (bpp)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bqq.b<che> dQ() {
      return bqq.a(bY, bX);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return chf.a(this.dQ().a($$0));
   }

   @Override
   public bqq<che> dP() {
      return (bqq<che>)super.dP();
   }

   @Override
   protected void Y() {
      this.dM().ae().a("hoglinBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      chf.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(aty.ma);
            this.c((apf)this.dM());
         }
      } else {
         this.ck = 0;
      }
   }

   @Override
   public void m_() {
      if (this.cj > 0) {
         this.cj--;
      }

      super.m_();
   }

   @Override
   protected void k() {
      if (this.o_()) {
         this.bM = 3;
         this.f(bqw.c).a(0.5);
      } else {
         this.bM = 5;
         this.f(bqw.c).a(6.0);
      }
   }

   public static boolean c(bpd<che> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return !$$1.a_($$3.d()).a(dae.kK);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if ($$0.E_().i() < 0.2F) {
         this.a(true);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean h(double $$0) {
      return !this.fU();
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      if (chf.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dae.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      bnd $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fS();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(aty.lZ);
      } else {
         super.b($$0);
      }
   }

   @Override
   public int gn() {
      return this.cj;
   }

   @Override
   public boolean ee() {
      return true;
   }

   @Override
   public int eg() {
      return this.bM;
   }

   private void c(apf $$0) {
      cgs $$1 = this.a(bpd.bt, true);
      if ($$1 != null) {
         $$1.b(new bok(bom.i, 200, 0));
      }
   }

   @Override
   public boolean o(cqm $$0) {
      return $$0.a(cqp.dB);
   }

   public boolean s() {
      return !this.o_();
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (this.gu()) {
         $$0.a("IsImmuneToZombification", true);
      }

      $$0.a("TimeInOverworld", this.ck);
      if (this.cl) {
         $$0.a("CannotBeHunted", true);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.w($$0.q("IsImmuneToZombification"));
      this.ck = $$0.h("TimeInOverworld");
      this.x($$0.q("CannotBeHunted"));
   }

   public void w(boolean $$0) {
      this.an().a(ca, $$0);
   }

   private boolean gu() {
      return this.an().a(ca);
   }

   public boolean y() {
      return !this.dM().D_().b() && !this.gu() && !this.gd();
   }

   private void x(boolean $$0) {
      this.cl = $$0;
   }

   public boolean gt() {
      return this.s() && !this.cl;
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      che $$2 = bpd.aa.a((cxb)$$0);
      if ($$2 != null) {
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean go() {
      return !chf.c(this) && super.go();
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected atx v() {
      return this.dM().B ? null : chf.b(this).orElse(null);
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.mc;
   }

   @Override
   protected atx n_() {
      return aty.mb;
   }

   @Override
   protected atx aN() {
      return aty.mH;
   }

   @Override
   protected atx aO() {
      return aty.mG;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.me, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }
}
