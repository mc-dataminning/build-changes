import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clm extends cjg {
   private static final int bI = 0;
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bJ = 0;
   protected static final ImmutableList<cid<? extends cic<? super clm>>> e = ImmutableList.of(cid.c, cid.d, cid.f, cid.s);
   protected static final ImmutableList<cgw<?>> f = ImmutableList.of(cgw.o, cgw.h, cgw.n, cgw.F, cgw.u, cgw.L, cgw.Q, cgw.S, cgw.P, cgw.s, cgw.aa);

   public clm(bxc<? extends cjg> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cdv(this, 85, 10, 0.02F, 0.1F, true);
      this.bB = new cdu(this, 10);
   }

   @Override
   protected che b(djx $$0) {
      return new chg(this, $$0);
   }

   @Override
   protected byu.b<clm> ed() {
      return byu.a(f, e);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cln.a(this.ed().a($$0));
   }

   @Override
   public byu<clm> ec() {
      return (byu<clm>)super.ec();
   }

   @Override
   protected awo t() {
      return awp.Ay;
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("tadpoleBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      cln.a(this);
      $$1.c();
      super.a($$0);
   }

   public static byz.a x() {
      return cjk.gz().a(bza.v, 1.0).a(bza.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.c(this.bJ + 1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Age", this.bJ);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.c($$0.b("Age", 0));
   }

   @Nullable
   @Override
   protected awo u() {
      return null;
   }

   @Nullable
   @Override
   protected awo e(bvi $$0) {
      return awp.AA;
   }

   @Nullable
   @Override
   protected awo l_() {
      return awp.Ax;
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bur.a;
      } else {
         return cjm.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void a_(czy $$0) {
      cjm.a(this, $$0);
      dcg.a(kk.Z, $$0, $$0x -> $$0x.a("Age", this.gu()));
   }

   @Override
   public void d(tz $$0) {
      cjm.a(this, $$0);
      $$0.e("Age").ifPresent(this::c);
   }

   @Override
   public czy W_() {
      return new czy(dac.rA);
   }

   @Override
   public awo n() {
      return awp.do;
   }

   private boolean j(czy $$0) {
      return $$0.a(axm.ap);
   }

   private void a(crx $$0, czy $$1) {
      this.b($$0, $$1);
      this.b(bwj.d_(this.gw()));
      this.dV().a(ly.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(crx $$0, czy $$1) {
      $$1.a(1, $$0);
   }

   private int gu() {
      return this.bJ;
   }

   private void b(int $$0) {
      this.c(this.bJ + $$0 * 20);
   }

   private void c(int $$0) {
      this.bJ = $$0;
      if (this.bJ >= a) {
         this.gv();
      }
   }

   private void gv() {
      if (this.dV() instanceof ars $$0) {
         this.a(bxc.ac, bwn.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bxb.i, null);
            $$1.gc();
            $$1.a(this.a(this.at()));
            this.a(awp.Az, 0.15F, 1.0F);
         });
      }
   }

   private int gw() {
      return Math.max(0, a - this.bJ);
   }

   @Override
   public boolean eo() {
      return false;
   }
}
