import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cim extends cii {
   private static final int bY = 50;
   private static final float bZ = 0.35F;
   private static final int ca = 7;
   protected static final ImmutableList<cay<? extends cax<? super cim>>> e = ImmutableList.of(cay.c, cay.d, cay.b, cay.f, cay.m);
   protected static final ImmutableList<bzr<?>> bX = ImmutableList.of(
      bzr.n, bzr.v, bzr.g, bzr.h, bzr.k, bzr.l, bzr.ao, bzr.an, bzr.x, bzr.y, bzr.m, bzr.E, new bzr[]{bzr.o, bzr.p, bzr.q, bzr.t, bzr.ab, bzr.M, bzr.b}
   );

   public cim(bqb<? extends cim> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 20;
   }

   public static bru.a y() {
      return cgz.gt().a(brv.q, 50.0).a(brv.r, 0.35F).a(brv.c, 7.0);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      cin.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axr $$0, bny $$1) {
      this.a(bqc.a, new crj(crm.oX));
   }

   @Override
   protected brp.b<cim> dQ() {
      return brp.a(bX, e);
   }

   @Override
   protected brp<?> a(Dynamic<?> $$0) {
      return cin.a(this, this.dQ().a($$0));
   }

   @Override
   public brp<cim> dP() {
      return (brp<cim>)super.dP();
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean k(crj $$0) {
      return $$0.a(crm.oX) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dM().af().a("piglinBruteBrain");
      this.dP().a((aps)this.dM(), this);
      this.dM().af().c();
      cin.b(this);
      cin.c(this);
      super.Y();
   }

   @Override
   public cil gp() {
      return this.gf() && this.gq() ? cil.a : cil.f;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bqo) {
            cin.a(this, (bqo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aul v() {
      return aum.tt;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.tw;
   }

   @Override
   protected aul o_() {
      return aum.tv;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.tx, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(aum.tu);
   }

   @Override
   protected void gr() {
      this.b(aum.ty);
   }
}
