import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ckr extends ckn {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cdb<? extends cda<? super ckr>>> e = ImmutableList.of(cdb.c, cdb.d, cdb.b, cdb.f, cdb.m);
   protected static final ImmutableList<cbu<?>> bY = ImmutableList.of(
      cbu.n, cbu.v, cbu.g, cbu.h, cbu.k, cbu.l, cbu.ao, cbu.an, cbu.x, cbu.y, cbu.m, cbu.E, new cbu[]{cbu.o, cbu.p, cbu.q, cbu.t, cbu.ab, cbu.M, cbu.b}
   );

   public ckr(bsc<? extends ckr> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static btx.a y() {
      return cje.gv().a(bty.q, 50.0).a(bty.r, 0.35F).a(bty.c, 7.0);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      cks.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      this.a(bsd.a, new ctq(ctt.oY));
   }

   @Override
   protected bts.b<ckr> dT() {
      return bts.a(bY, e);
   }

   @Override
   protected bts<?> a(Dynamic<?> $$0) {
      return cks.a(this, this.dT().a($$0));
   }

   @Override
   public bts<ckr> dS() {
      return (bts<ckr>)super.dS();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(ctq $$0) {
      return $$0.a(ctt.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dP().af().a("piglinBruteBrain");
      this.dS().a((aqn)this.dP(), this);
      this.dP().af().c();
      cks.b(this);
      cks.c(this);
      super.Y();
   }

   @Override
   public ckq gr() {
      return this.gh() && this.gs() ? ckq.a : ckq.f;
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dP().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bsq) {
            cks.a(this, (bsq)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avh v() {
      return avi.tM;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.tP;
   }

   @Override
   protected avh o_() {
      return avi.tO;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.tQ, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(avi.tN);
   }

   @Override
   protected void gt() {
      this.b(avi.tR);
   }
}
