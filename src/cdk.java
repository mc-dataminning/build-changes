import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cdk extends cdg {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bwd<? extends bwc<? super cdk>>> bT = ImmutableList.of(bwd.c, bwd.d, bwd.b, bwd.f, bwd.l);
   protected static final ImmutableList<bux<?>> bU = ImmutableList.of(
      bux.n, bux.v, bux.g, bux.h, bux.k, bux.l, bux.an, bux.am, bux.x, bux.y, bux.m, bux.E, new bux[]{bux.o, bux.p, bux.q, bux.t, bux.aa, bux.L, bux.b}
   );

   public cdk(blj<? extends cdk> $$0, csy $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bna.a A() {
      return cbz.gk().a(bnb.l, 50.0).a(bnb.m, 0.35F).a(bnb.c, 7.0);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      cdl.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auf $$0, bjj $$1) {
      this.a(blk.a, new cmh(cmk.oV));
   }

   @Override
   protected bmv.b<cdk> dP() {
      return bmv.a(bU, bT);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return cdl.a(this, this.dP().a($$0));
   }

   @Override
   public bmv<cdk> dO() {
      return (bmv<cdk>)super.dO();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(cmh $$0) {
      return $$0.a(cmk.oV) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dM().ae().a("piglinBruteBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      cdl.b(this);
      cdl.c(this);
      super.Z();
   }

   @Override
   public cdj gg() {
      return this.fW() && this.gh() ? cdj.a : cdj.f;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof blv) {
            cdl.a(this, (blv)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected arb y() {
      return arc.sS;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.sV;
   }

   @Override
   protected arb n_() {
      return arc.sU;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.sW, 0.15F, 1.0F);
   }

   protected void gl() {
      this.a(arc.sT, 1.0F, this.eX());
   }

   @Override
   protected void gi() {
      this.a(arc.sX, 1.0F, this.eX());
   }
}
