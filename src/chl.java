import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chl extends chh {
   private static final int bY = 50;
   private static final float bZ = 0.35F;
   private static final int ca = 7;
   protected static final ImmutableList<bzy<? extends bzx<? super chl>>> e = ImmutableList.of(bzy.c, bzy.d, bzy.b, bzy.f, bzy.m);
   protected static final ImmutableList<byr<?>> bX = ImmutableList.of(
      byr.n, byr.v, byr.g, byr.h, byr.k, byr.l, byr.ao, byr.an, byr.x, byr.y, byr.m, byr.E, new byr[]{byr.o, byr.p, byr.q, byr.t, byr.ab, byr.M, byr.b}
   );

   public chl(bpc<? extends chl> $$0, cwz $$1) {
      super($$0, $$1);
      this.bM = 20;
   }

   public static bqu.a y() {
      return cfy.gt().a(bqv.q, 50.0).a(bqv.r, 0.35F).a(bqv.c, 7.0);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      chm.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axd $$0, bna $$1) {
      this.a(bpd.a, new cqk(cqn.oX));
   }

   @Override
   protected bqp.b<chl> dQ() {
      return bqp.a(bX, e);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return chm.a(this, this.dQ().a($$0));
   }

   @Override
   public bqp<chl> dP() {
      return (bqp<chl>)super.dP();
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean k(cqk $$0) {
      return $$0.a(cqn.oX) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("piglinBruteBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      chm.b(this);
      chm.c(this);
      super.Y();
   }

   @Override
   public chk gp() {
      return this.gf() && this.gq() ? chk.a : chk.f;
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bpo) {
            chm.a(this, (bpo)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected atx v() {
      return aty.tl;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.to;
   }

   @Override
   protected atx n_() {
      return aty.tn;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.tp, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(aty.tm);
   }

   @Override
   protected void gr() {
      this.b(aty.tq);
   }
}
