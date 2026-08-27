import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cdu extends cdq {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bwn<? extends bwm<? super cdu>>> bT = ImmutableList.of(bwn.c, bwn.d, bwn.b, bwn.f, bwn.l);
   protected static final ImmutableList<bvh<?>> bU = ImmutableList.of(
      bvh.n, bvh.v, bvh.g, bvh.h, bvh.k, bvh.l, bvh.an, bvh.am, bvh.x, bvh.y, bvh.m, bvh.E, new bvh[]{bvh.o, bvh.p, bvh.q, bvh.t, bvh.aa, bvh.L, bvh.b}
   );

   public cdu(blt<? extends cdu> $$0, cti $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bnk.a A() {
      return ccj.gk().a(bnl.l, 50.0).a(bnl.m, 0.35F).a(bnl.c, 7.0);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      cdv.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(aup $$0, bjt $$1) {
      this.a(blu.a, new cmr(cmu.oV));
   }

   @Override
   protected bnf.b<cdu> dP() {
      return bnf.a(bU, bT);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return cdv.a(this, this.dP().a($$0));
   }

   @Override
   public bnf<cdu> dO() {
      return (bnf<cdu>)super.dO();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(cmr $$0) {
      return $$0.a(cmu.oV) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dM().af().a("piglinBruteBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      cdv.b(this);
      cdv.c(this);
      super.Z();
   }

   @Override
   public cdt gg() {
      return this.fW() && this.gh() ? cdt.a : cdt.f;
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bmf) {
            cdv.a(this, (bmf)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected arl y() {
      return arm.sS;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.sV;
   }

   @Override
   protected arl n_() {
      return arm.sU;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.sW, 0.15F, 1.0F);
   }

   protected void gl() {
      this.a(arm.sT, 1.0F, this.eX());
   }

   @Override
   protected void gi() {
      this.a(arm.sX, 1.0F, this.eX());
   }
}
