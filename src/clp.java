import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clp extends cll {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cdz<? extends cdy<? super clp>>> e = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.f, cdz.m);
   protected static final ImmutableList<ccs<?>> bY = ImmutableList.of(
      ccs.n, ccs.v, ccs.g, ccs.h, ccs.k, ccs.l, ccs.ao, ccs.an, ccs.x, ccs.y, ccs.m, ccs.E, new ccs[]{ccs.o, ccs.p, ccs.q, ccs.t, ccs.ab, ccs.M, ccs.b}
   );

   public clp(bsz<? extends clp> $$0, dbx $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static buv.a y() {
      return ckc.gw().a(buw.q, 50.0).a(buw.r, 0.35F).a(buw.c, 7.0);
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      clq.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azg $$0, bqr $$1) {
      this.a(bta.a, new cuo(cur.oY));
   }

   @Override
   protected buq.b<clp> dT() {
      return buq.a(bY, e);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return clq.a(this, this.dT().a($$0));
   }

   @Override
   public buq<clp> dS() {
      return (buq<clp>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cuo $$0) {
      return $$0.a(cur.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dP().ag().a("piglinBruteBrain");
      this.dS().a((are)this.dP(), this);
      this.dP().ag().c();
      clq.b(this);
      clq.c(this);
      super.Z();
   }

   @Override
   public clo gs() {
      return this.gi() && this.gt() ? clo.a : clo.f;
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bto) {
            clq.a(this, (bto)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avy v() {
      return avz.tM;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.tP;
   }

   @Override
   protected avy o_() {
      return avz.tO;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
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
