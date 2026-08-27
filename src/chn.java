import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class chn extends chj {
   private static final int bY = 50;
   private static final float bZ = 0.35F;
   private static final int ca = 7;
   protected static final ImmutableList<bzz<? extends bzy<? super chn>>> e = ImmutableList.of(bzz.c, bzz.d, bzz.b, bzz.f, bzz.m);
   protected static final ImmutableList<bys<?>> bX = ImmutableList.of(
      bys.n, bys.v, bys.g, bys.h, bys.k, bys.l, bys.ao, bys.an, bys.x, bys.y, bys.m, bys.E, new bys[]{bys.o, bys.p, bys.q, bys.t, bys.ab, bys.M, bys.b}
   );

   public chn(bpd<? extends chn> $$0, cxb $$1) {
      super($$0, $$1);
      this.bM = 20;
   }

   public static bqv.a y() {
      return cga.gt().a(bqw.q, 50.0).a(bqw.r, 0.35F).a(bqw.c, 7.0);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      cho.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      this.a(bpe.a, new cqm(cqp.oX));
   }

   @Override
   protected bqq.b<chn> dQ() {
      return bqq.a(bX, e);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return cho.a(this, this.dQ().a($$0));
   }

   @Override
   public bqq<chn> dP() {
      return (bqq<chn>)super.dP();
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean k(cqm $$0) {
      return $$0.a(cqp.oX) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("piglinBruteBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      cho.b(this);
      cho.c(this);
      super.Y();
   }

   @Override
   public chm gp() {
      return this.gf() && this.gq() ? chm.a : chm.f;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dM().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bpp) {
            cho.a(this, (bpp)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected atx v() {
      return aty.tq;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.tt;
   }

   @Override
   protected atx n_() {
      return aty.ts;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.tu, 0.15F, 1.0F);
   }

   protected void gu() {
      this.b(aty.tr);
   }

   @Override
   protected void gr() {
      this.b(aty.tv);
   }
}
