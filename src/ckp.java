import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckp extends ckl {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<ccz<? extends ccy<? super ckp>>> e = ImmutableList.of(ccz.c, ccz.d, ccz.b, ccz.f, ccz.m);
   protected static final ImmutableList<cbs<?>> bY = ImmutableList.of(
      cbs.n, cbs.v, cbs.g, cbs.h, cbs.k, cbs.l, cbs.ao, cbs.an, cbs.x, cbs.y, cbs.m, cbs.E, new cbs[]{cbs.o, cbs.p, cbs.q, cbs.t, cbs.ab, cbs.M, cbs.b}
   );

   public ckp(bsa<? extends ckp> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static btv.a y() {
      return cjc.gv().a(btw.q, 50.0).a(btw.r, 0.35F).a(btw.c, 7.0);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ckq.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      this.a(bsb.a, new cto(ctr.oY));
   }

   @Override
   protected btq.b<ckp> dT() {
      return btq.a(bY, e);
   }

   @Override
   protected btq<?> a(Dynamic<?> $$0) {
      return ckq.a(this, this.dT().a($$0));
   }

   @Override
   public btq<ckp> dS() {
      return (btq<ckp>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cto $$0) {
      return $$0.a(ctr.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dP().af().a("piglinBruteBrain");
      this.dS().a((aqm)this.dP(), this);
      this.dP().af().c();
      ckq.b(this);
      ckq.c(this);
      super.Y();
   }

   @Override
   public cko gr() {
      return this.gh() && this.gs() ? cko.a : cko.f;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bso) {
            ckq.a(this, (bso)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avg v() {
      return avh.tM;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.tP;
   }

   @Override
   protected avg o_() {
      return avh.tO;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.tQ, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(avh.tN);
   }

   @Override
   protected void gt() {
      this.b(avh.tR);
   }
}
