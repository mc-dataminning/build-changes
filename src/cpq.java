import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cpq extends cpm {
   private static final int bG = 50;
   private static final float bH = 0.35F;
   private static final int bI = 7;
   private static final double bJ = 12.0;
   protected static final ImmutableList<chl<? extends chk<? super cpq>>> d = ImmutableList.of(chl.c, chl.d, chl.b, chl.f, chl.m);
   protected static final ImmutableList<cge<?>> bF = ImmutableList.of(
      cge.o, cge.w, cge.g, cge.h, cge.k, cge.l, cge.ap, cge.ao, cge.y, cge.z, cge.n, cge.F, new cge[]{cge.p, cge.q, cge.r, cge.u, cge.ac, cge.N, cge.b}
   );

   public cpq(bwm<? extends cpq> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 20;
   }

   public static byh.a n() {
      return cnz.gt().a(byi.s, 50.0).a(byi.v, 0.35F).a(byi.c, 7.0).a(byi.m, 12.0);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      cpr.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, btz $$1) {
      this.a(bwn.a, new cyy(czc.pK));
   }

   @Override
   protected byc.b<cpq> ec() {
      return byc.a(bF, d);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return cpr.a(this, this.ec().a($$0));
   }

   @Override
   public byc<cpq> eb() {
      return (byc<cpq>)super.eb();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(arq $$0, cyy $$1) {
      return $$1.a(czc.pK) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cpr.b(this);
      cpr.c(this);
      super.a($$0);
   }

   @Override
   public cpp x() {
      return this.gh() && this.gq() ? cpp.a : cpp.f;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxc $$4) {
         cpr.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awm u() {
      return awn.uA;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.uD;
   }

   @Override
   protected awm l_() {
      return awn.uC;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.uE, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(awn.uB);
   }

   @Override
   protected void gr() {
      this.b(awn.uF);
   }
}
