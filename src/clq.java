import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clq extends clm {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cea<? extends cdz<? super clq>>> e = ImmutableList.of(cea.c, cea.d, cea.b, cea.f, cea.m);
   protected static final ImmutableList<cct<?>> bY = ImmutableList.of(
      cct.n, cct.v, cct.g, cct.h, cct.k, cct.l, cct.ao, cct.an, cct.x, cct.y, cct.m, cct.E, new cct[]{cct.o, cct.p, cct.q, cct.t, cct.ab, cct.M, cct.b}
   );

   public clq(bta<? extends clq> $$0, dby $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static buw.a y() {
      return ckd.gw().a(bux.q, 50.0).a(bux.r, 0.35F).a(bux.c, 7.0);
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      clr.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      this.a(btb.a, new cup(cus.oY));
   }

   @Override
   protected bur.b<clq> dT() {
      return bur.a(bY, e);
   }

   @Override
   protected bur<?> a(Dynamic<?> $$0) {
      return clr.a(this, this.dT().a($$0));
   }

   @Override
   public bur<clq> dS() {
      return (bur<clq>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cup $$0) {
      return $$0.a(cus.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBruteBrain");
      this.dS().a((arf)this.dP(), this);
      this.dP().ag().c();
      clr.b(this);
      clr.c(this);
      super.Z();
   }

   @Override
   public clp gs() {
      return this.gi() && this.gt() ? clp.a : clp.f;
   }

   @Override
   public boolean a(brn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btp) {
            clr.a(this, (btp)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avz v() {
      return awa.tM;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.tP;
   }

   @Override
   protected avz o_() {
      return awa.tO;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.tQ, 0.15F, 1.0F);
   }

   protected void gx() {
      this.b(awa.tN);
   }

   @Override
   protected void gu() {
      this.b(awa.tR);
   }
}
