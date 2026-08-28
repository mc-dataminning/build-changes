import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class coi extends coe {
   private static final int bG = 50;
   private static final float bH = 0.35F;
   private static final int bI = 7;
   private static final double bJ = 12.0;
   protected static final ImmutableList<cgj<? extends cgi<? super coi>>> d = ImmutableList.of(cgj.c, cgj.d, cgj.b, cgj.f, cgj.m);
   protected static final ImmutableList<cfc<?>> bF = ImmutableList.of(
      cfc.n, cfc.v, cfc.g, cfc.h, cfc.k, cfc.l, cfc.ao, cfc.an, cfc.x, cfc.y, cfc.m, cfc.E, new cfc[]{cfc.o, cfc.p, cfc.q, cfc.t, cfc.ab, cfc.M, cfc.b}
   );

   public coi(bvi<? extends coi> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 20;
   }

   public static bxf.a n() {
      return cms.gv().a(bxg.s, 50.0).a(bxg.v, 0.35F).a(bxg.c, 7.0).a(bxg.m, 12.0);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      coj.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bsw $$1) {
      this.a(bvj.a, new cxh(cxl.pG));
   }

   @Override
   protected bxa.b<coi> eb() {
      return bxa.a(bF, d);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return coj.a(this, this.eb().a($$0));
   }

   @Override
   public bxa<coi> ea() {
      return (bxa<coi>)super.ea();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(ard $$0, cxh $$1) {
      return $$1.a(cxl.pG) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("piglinBruteBrain");
      this.ea().a($$0, this);
      $$1.c();
      coj.b(this);
      coj.c(this);
      super.a($$0);
   }

   @Override
   public coh x() {
      return this.gj() && this.gs() ? coh.a : coh.f;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvy $$4) {
         coj.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected avz u() {
      return awa.uz;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.uC;
   }

   @Override
   protected avz l_() {
      return awa.uB;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.uD, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(awa.uA);
   }

   @Override
   protected void gt() {
      this.b(awa.uE);
   }
}
