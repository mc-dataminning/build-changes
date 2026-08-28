import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clo extends clk {
   private static final int cb = 50;
   private static final float cc = 0.35F;
   private static final int cd = 7;
   protected static final ImmutableList<cdx<? extends cdw<? super clo>>> e = ImmutableList.of(cdx.c, cdx.d, cdx.b, cdx.f, cdx.m);
   protected static final ImmutableList<ccq<?>> ca = ImmutableList.of(
      ccq.n, ccq.v, ccq.g, ccq.h, ccq.k, ccq.l, ccq.ao, ccq.an, ccq.x, ccq.y, ccq.m, ccq.E, new ccq[]{ccq.o, ccq.p, ccq.q, ccq.t, ccq.ab, ccq.M, ccq.b}
   );

   public clo(bsw<? extends clo> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 20;
   }

   public static but.a x() {
      return ckb.gs().a(buu.s, 50.0).a(buu.v, 0.35F).a(buu.c, 7.0);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      clp.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayv $$0, bqo $$1) {
      this.a(bsx.a, new cuo(cur.oZ));
   }

   @Override
   protected buo.b<clo> dV() {
      return buo.a(ca, e);
   }

   @Override
   protected buo<?> a(Dynamic<?> $$0) {
      return clp.a(this, this.dV().a($$0));
   }

   @Override
   public buo<clo> dU() {
      return (buo<clo>)super.dU();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cuo $$0) {
      return $$0.a(cur.oZ) ? super.k($$0) : false;
   }

   @Override
   protected void Z() {
      this.dQ().ag().a("piglinBruteBrain");
      this.dU().a((aqt)this.dQ(), this);
      this.dQ().ag().c();
      clp.b(this);
      clp.c(this);
      super.Z();
   }

   @Override
   public cln go() {
      return this.gd() && this.gp() ? cln.a : cln.f;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dQ().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btl) {
            clp.a(this, (btl)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avn v() {
      return avo.tP;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.tS;
   }

   @Override
   protected avn n_() {
      return avo.tR;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.tT, 0.15F, 1.0F);
   }

   protected void gt() {
      this.b(avo.tQ);
   }

   @Override
   protected void gq() {
      this.b(avo.tU);
   }
}
