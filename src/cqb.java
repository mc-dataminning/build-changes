import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cqb extends cpx {
   private static final int bH = 50;
   private static final float bI = 0.35F;
   private static final int bJ = 7;
   private static final double bK = 12.0;
   protected static final ImmutableList<chs<? extends chr<? super cqb>>> d = ImmutableList.of(chs.c, chs.d, chs.b, chs.f, chs.m);
   protected static final ImmutableList<cgl<?>> bG = ImmutableList.of(
      cgl.o, cgl.w, cgl.g, cgl.h, cgl.k, cgl.l, cgl.ap, cgl.ao, cgl.y, cgl.z, cgl.n, cgl.F, new cgl[]{cgl.p, cgl.q, cgl.r, cgl.u, cgl.ac, cgl.N, cgl.b}
   );

   public cqb(bwr<? extends cqb> $$0, djh $$1) {
      super($$0, $$1);
      this.by = 20;
   }

   public static byo.a n() {
      return cok.gw().a(byp.s, 50.0).a(byp.v, 0.35F).a(byp.c, 7.0).a(byp.m, 12.0);
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      cqc.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azv $$0, bue $$1) {
      this.a(bws.a, new czk(czo.pN));
   }

   @Override
   protected byj.b<cqb> ec() {
      return byj.a(bG, d);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cqc.a(this, this.ec().a($$0));
   }

   @Override
   public byj<cqb> eb() {
      return (byj<cqb>)super.eb();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(arq $$0, czk $$1) {
      return $$1.a(czo.pN) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("piglinBruteBrain");
      this.eb().a($$0, this);
      $$1.c();
      cqc.b(this);
      cqc.c(this);
      super.a($$0);
   }

   @Override
   public cqa x() {
      return this.gk() && this.gt() ? cqa.a : cqa.f;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxj $$4) {
         cqc.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awm u() {
      return awn.uD;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.uG;
   }

   @Override
   protected awm l_() {
      return awn.uF;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.uH, 0.15F, 1.0F);
   }

   protected void gx() {
      this.b(awn.uE);
   }

   @Override
   protected void gu() {
      this.b(awn.uI);
   }
}
