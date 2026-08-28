import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckw extends cio {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bH;
   protected static final ImmutableList<chl<? extends chk<? super ckw>>> bF = ImmutableList.of(chl.c, chl.d, chl.f, chl.s);
   protected static final ImmutableList<cge<?>> bG = ImmutableList.of(cge.o, cge.h, cge.n, cge.F, cge.u, cge.L, cge.Q, cge.S, cge.P, cge.s, cge.aa);

   public ckw(bwm<? extends cio> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new cdd(this, 85, 10, 0.02F, 0.1F, true);
      this.by = new cdc(this, 10);
   }

   @Override
   protected cgm b(div $$0) {
      return new cgo(this, $$0);
   }

   @Override
   protected byc.b<ckw> ec() {
      return byc.a(bG, bF);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return ckx.a(this.ec().a($$0));
   }

   @Override
   public byc<ckw> eb() {
      return (byc<ckw>)super.eb();
   }

   @Override
   protected awm t() {
      return awn.Av;
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      ckx.a(this);
      $$1.c();
      super.a($$0);
   }

   public static byh.a x() {
      return cis.gv().a(byi.v, 1.0).a(byi.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dV().C) {
         this.c(this.bH + 1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Age", this.bH);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.c($$0.h("Age"));
   }

   @Nullable
   @Override
   protected awm u() {
      return null;
   }

   @Nullable
   @Override
   protected awm e(bus $$0) {
      return awn.Ax;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.Au;
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if (this.k($$2)) {
         this.a($$0, $$2);
         return bub.a;
      } else {
         return ciu.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void a_(cyy $$0) {
      ciu.a(this, $$0);
      dbg.a(kj.Z, $$0, $$0x -> $$0x.a("Age", this.gq()));
   }

   @Override
   public void h(tz $$0) {
      ciu.a(this, $$0);
      if ($$0.e("Age")) {
         this.c($$0.h("Age"));
      }
   }

   @Override
   public cyy R_() {
      return new cyy(czc.rx);
   }

   @Override
   public awm n() {
      return awn.do;
   }

   private boolean k(cyy $$0) {
      return $$0.a(axk.ao);
   }

   private void a(cqy $$0, cyy $$1) {
      this.b($$0, $$1);
      this.b(bvt.d_(this.gs()));
      this.dV().a(lx.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cqy $$0, cyy $$1) {
      $$1.a(1, $$0);
   }

   private int gq() {
      return this.bH;
   }

   private void b(int $$0) {
      this.c(this.bH + $$0 * 20);
   }

   private void c(int $$0) {
      this.bH = $$0;
      if (this.bH >= a) {
         this.gr();
      }
   }

   private void gr() {
      if (this.dV() instanceof arq $$0) {
         this.a(bwm.ab, bvx.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dV().d_($$1.dv()), bwl.i, null);
            $$1.fY();
            $$1.a(this.a(this.aw()));
            this.a(awn.Aw, 0.15F, 1.0F);
         });
      }
   }

   private int gs() {
      return Math.max(0, a - this.bH);
   }

   @Override
   public boolean en() {
      return false;
   }
}
