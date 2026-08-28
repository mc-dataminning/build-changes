import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clb extends civ {
   @VisibleForTesting
   public static int a = Math.abs(-24000);
   public static final float b = 0.4F;
   public static final float c = 0.3F;
   private int bI;
   protected static final ImmutableList<chs<? extends chr<? super clb>>> bG = ImmutableList.of(chs.c, chs.d, chs.f, chs.s);
   protected static final ImmutableList<cgl<?>> bH = ImmutableList.of(cgl.o, cgl.h, cgl.n, cgl.F, cgl.u, cgl.L, cgl.Q, cgl.S, cgl.P, cgl.s, cgl.aa);

   public clb(bwr<? extends civ> $$0, djm $$1) {
      super($$0, $$1);
      this.bA = new cdk(this, 85, 10, 0.02F, 0.1F, true);
      this.bz = new cdj(this, 10);
   }

   @Override
   protected cgt b(djm $$0) {
      return new cgv(this, $$0);
   }

   @Override
   protected byj.b<clb> ec() {
      return byj.a(bH, bG);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return clc.a(this.ec().a($$0));
   }

   @Override
   public byj<clb> eb() {
      return (byj<clb>)super.eb();
   }

   @Override
   protected awm t() {
      return awn.Ay;
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("tadpoleBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("tadpoleActivityUpdate");
      clc.a(this);
      $$1.c();
      super.a($$0);
   }

   public static byo.a x() {
      return ciz.gy().a(byp.v, 1.0).a(byp.s, 6.0);
   }

   @Override
   public void k_() {
      super.k_();
      if (!this.dU().C) {
         this.c(this.bI + 1);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Age", this.bI);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.c($$0.f("Age"));
   }

   @Nullable
   @Override
   protected awm u() {
      return null;
   }

   @Nullable
   @Override
   protected awm e(bux $$0) {
      return awn.AA;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.Ax;
   }

   @Override
   public bug b(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if (this.j($$2)) {
         this.a($$0, $$2);
         return bug.a;
      } else {
         return cjb.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void ac() {
      super.ac();
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
   public void a_(czn $$0) {
      cjb.a(this, $$0);
      dbv.a(kk.Z, $$0, $$0x -> $$0x.a("Age", this.gt()));
   }

   @Override
   public void h(tz $$0) {
      cjb.a(this, $$0);
      if ($$0.c("Age")) {
         this.c($$0.f("Age"));
      }
   }

   @Override
   public czn S_() {
      return new czn(czr.rA);
   }

   @Override
   public awm n() {
      return awn.do;
   }

   private boolean j(czn $$0) {
      return $$0.a(axk.ap);
   }

   private void a(crm $$0, czn $$1) {
      this.b($$0, $$1);
      this.b(bvy.d_(this.gv()));
      this.dU().a(ly.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(crm $$0, czn $$1) {
      $$1.a(1, $$0);
   }

   private int gt() {
      return this.bI;
   }

   private void b(int $$0) {
      this.c(this.bI + $$0 * 20);
   }

   private void c(int $$0) {
      this.bI = $$0;
      if (this.bI >= a) {
         this.gu();
      }
   }

   private void gu() {
      if (this.dU() instanceof arq $$0) {
         this.a(bwr.ab, bwc.a(this, false, false), $$1 -> {
            $$1.a($$0, this.dU().d_($$1.du()), bwq.i, null);
            $$1.gb();
            $$1.a(this.a(this.at()));
            this.a(awn.Az, 0.15F, 1.0F);
         });
      }
   }

   private int gv() {
      return Math.max(0, a - this.bI);
   }

   @Override
   public boolean en() {
      return false;
   }
}
