import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cit extends cip {
   private static final int bY = 50;
   private static final float bZ = 0.35F;
   private static final int ca = 7;
   protected static final ImmutableList<cbd<? extends cbc<? super cit>>> e = ImmutableList.of(cbd.c, cbd.d, cbd.b, cbd.f, cbd.m);
   protected static final ImmutableList<bzw<?>> bX = ImmutableList.of(
      bzw.n, bzw.v, bzw.g, bzw.h, bzw.k, bzw.l, bzw.ao, bzw.an, bzw.x, bzw.y, bzw.m, bzw.E, new bzw[]{bzw.o, bzw.p, bzw.q, bzw.t, bzw.ab, bzw.M, bzw.b}
   );

   public cit(bqg<? extends cit> $$0, czg $$1) {
      super($$0, $$1);
      this.bM = 20;
   }

   public static brz.a y() {
      return chg.gt().a(bsa.q, 50.0).a(bsa.r, 0.35F).a(bsa.c, 7.0);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      ciu.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      this.a(bqh.a, new crs(crv.oX));
   }

   @Override
   protected bru.b<cit> dQ() {
      return bru.a(bX, e);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return ciu.a(this, this.dQ().a($$0));
   }

   @Override
   public bru<cit> dP() {
      return (bru<cit>)super.dP();
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean k(crs $$0) {
      return $$0.a(crv.oX) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dM().af().a("piglinBruteBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      ciu.b(this);
      ciu.c(this);
      super.Y();
   }

   @Override
   public cis gp() {
      return this.gf() && this.gq() ? cis.a : cis.f;
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bqt) {
            ciu.a(this, (bqt)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aun v() {
      return auo.tt;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.tw;
   }

   @Override
   protected aun o_() {
      return auo.tv;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.tx, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(auo.tu);
   }

   @Override
   protected void gr() {
      this.b(auo.ty);
   }
}
