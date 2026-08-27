import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chc extends cbd implements cfq, che {
   private static final aim<Boolean> ca = aiq.a(chc.class, aio.k);
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
   protected static final ImmutableList<? extends bzy<? extends bzx<? super chc>>> bX = ImmutableList.of(bzy.c, bzy.d, bzy.o, bzy.n);
   protected static final ImmutableList<? extends byr<?>> bY = ImmutableList.of(
      byr.r,
      byr.g,
      byr.h,
      byr.k,
      byr.l,
      byr.n,
      byr.m,
      byr.E,
      byr.t,
      byr.o,
      byr.p,
      byr.aq,
      new byr[]{byr.z, byr.as, byr.at, byr.ap, byr.K, byr.aw, byr.ax, byr.Z}
   );

   public chc(bpc<? extends chc> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 5;
   }

   @Override
   public boolean a(cis $$0) {
      return !this.gb();
   }

   public static bqu.a r() {
      return cfy.gt().a(bqv.q, 40.0).a(bqv.r, 0.3F).a(bqv.n, 0.6F).a(bqv.d, 1.0).a(bqv.c, 6.0);
   }

   @Override
   public boolean C(bow $$0) {
      if (!($$0 instanceof bpo)) {
         return false;
      } else {
         this.cj = 10;
         this.dM().a(this, (byte)4);
         this.b(aty.lV);
         chd.a(this, (bpo)$$0);
         return che.a(this, (bpo)$$0);
      }
   }

   @Override
   protected void e(bpo $$0) {
      if (this.s()) {
         che.b(this, $$0);
      }
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bpo) {
            chd.b(this, (bpo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected bqp.b<chc> dQ() {
      return bqp.a(bY, bX);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return chd.a(this.dQ().a($$0));
   }

   @Override
   public bqp<chc> dP() {
      return (bqp<chc>)super.dP();
   }

   @Override
   protected void Y() {
      this.dM().ae().a("hoglinBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      chd.a(this);
      if (this.y()) {
         this.ck++;
         if (this.ck > 300) {
            this.b(aty.lW);
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
         this.f(bqv.c).a(0.5);
      } else {
         this.bM = 5;
         this.f(bqv.c).a(6.0);
      }
   }

   public static boolean c(bpc<chc> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return !$$1.a_($$3.d()).a(dac.kK);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
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
   public float a(ib $$0, cxc $$1) {
      if (chd.a(this, $$0)) {
         return -1.0F;
      } else {
         return $$1.a_($$0.d()).a(dac.ow) ? 10.0F : 0.0F;
      }
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      bnc $$2 = super.b($$0, $$1);
      if ($$2.a()) {
         this.fS();
      }

      return $$2;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 10;
         this.b(aty.lV);
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
      cgq $$1 = this.a(bpc.bs, true);
      if ($$1 != null) {
         $$1.b(new boj(bol.i, 200, 0));
      }
   }

   @Override
   public boolean o(cqk $$0) {
      return $$0.a(cqn.dB);
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
   public bor a(apf $$0, bor $$1) {
      chc $$2 = bpc.Z.a((cwz)$$0);
      if ($$2 != null) {
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean go() {
      return !chd.c(this) && super.go();
   }

   @Override
   public atz db() {
      return atz.f;
   }

   @Override
   protected atx v() {
      return this.dM().B ? null : chd.b(this).orElse(null);
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.lY;
   }

   @Override
   protected atx n_() {
      return aty.lX;
   }

   @Override
   protected atx aN() {
      return aty.mD;
   }

   @Override
   protected atx aO() {
      return aty.mC;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.ma, 0.15F, 1.0F);
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }
}
