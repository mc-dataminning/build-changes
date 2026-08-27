import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ceb extends cdx {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bwt<? extends bws<? super ceb>>> bT = ImmutableList.of(bwt.c, bwt.d, bwt.b, bwt.f, bwt.l);
   protected static final ImmutableList<bvn<?>> bU = ImmutableList.of(
      bvn.n, bvn.v, bvn.g, bvn.h, bvn.k, bvn.l, bvn.an, bvn.am, bvn.x, bvn.y, bvn.m, bvn.E, new bvn[]{bvn.o, bvn.p, bvn.q, bvn.t, bvn.aa, bvn.L, bvn.b}
   );

   public ceb(blz<? extends ceb> $$0, ctp $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bnq.a A() {
      return ccp.gk().a(bnr.l, 50.0).a(bnr.m, 0.35F).a(bnr.c, 7.0);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      cec.a(this);
      this.a($$0.F_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      this.a(bma.a, new cmy(cnb.oV));
   }

   @Override
   protected bnl.b<ceb> dP() {
      return bnl.a(bU, bT);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return cec.a(this, this.dP().a($$0));
   }

   @Override
   public bnl<ceb> dO() {
      return (bnl<ceb>)super.dO();
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public boolean k(cmy $$0) {
      return $$0.a(cnb.oV) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dM().af().a("piglinBruteBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      cec.b(this);
      cec.c(this);
      super.Z();
   }

   @Override
   public cea gg() {
      return this.fW() && this.gh() ? cea.a : cea.f;
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bml) {
            cec.a(this, (bml)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected arr y() {
      return ars.sS;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.sV;
   }

   @Override
   protected arr n_() {
      return ars.sU;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.sW, 0.15F, 1.0F);
   }

   protected void gl() {
      this.a(ars.sT, 1.0F, this.eX());
   }

   @Override
   protected void gi() {
      this.a(ars.sX, 1.0F, this.eX());
   }
}
