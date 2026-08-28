import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clo extends clk {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cdy<? extends cdx<? super clo>>> e = ImmutableList.of(cdy.c, cdy.d, cdy.b, cdy.f, cdy.m);
   protected static final ImmutableList<ccr<?>> bY = ImmutableList.of(
      ccr.n, ccr.v, ccr.g, ccr.h, ccr.k, ccr.l, ccr.ao, ccr.an, ccr.x, ccr.y, ccr.m, ccr.E, new ccr[]{ccr.o, ccr.p, ccr.q, ccr.t, ccr.ab, ccr.M, ccr.b}
   );

   public clo(bsy<? extends clo> $$0, dbw $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static buu.a y() {
      return ckb.gw().a(buv.q, 50.0).a(buv.r, 0.35F).a(buv.c, 7.0);
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      clp.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      this.a(bsz.a, new cun(cuq.oY));
   }

   @Override
   protected bup.b<clo> dT() {
      return bup.a(bY, e);
   }

   @Override
   protected bup<?> a(Dynamic<?> $$0) {
      return clp.a(this, this.dT().a($$0));
   }

   @Override
   public bup<clo> dS() {
      return (bup<clo>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cun $$0) {
      return $$0.a(cuq.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBruteBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      clp.b(this);
      clp.c(this);
      super.Z();
   }

   @Override
   public cln gs() {
      return this.gi() && this.gt() ? cln.a : cln.f;
   }

   @Override
   public boolean a(brl $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btn) {
            clp.a(this, (btn)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avy v() {
      return avz.tM;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.tP;
   }

   @Override
   protected avy o_() {
      return avz.tO;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.tQ, 0.15F, 1.0F);
   }

   protected void gx() {
      this.b(avz.tN);
   }

   @Override
   protected void gu() {
      this.b(avz.tR);
   }
}
