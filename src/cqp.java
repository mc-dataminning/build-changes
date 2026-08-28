import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cqp extends cql {
   private static final int f = 50;
   private static final float bI = 0.35F;
   private static final int bJ = 7;
   private static final double bK = 12.0;
   protected static final ImmutableList<cid<? extends cic<? super cqp>>> d = ImmutableList.of(cid.c, cid.d, cid.b, cid.f, cid.m);
   protected static final ImmutableList<cgw<?>> e = ImmutableList.of(
      cgw.o, cgw.w, cgw.g, cgw.h, cgw.k, cgw.l, cgw.ap, cgw.ao, cgw.y, cgw.z, cgw.n, cgw.F, new cgw[]{cgw.p, cgw.q, cgw.r, cgw.u, cgw.ac, cgw.N, cgw.b}
   );

   public cqp(bxc<? extends cqp> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 20;
   }

   public static byz.a n() {
      return coz.gx().a(bza.s, 50.0).a(bza.v, 0.35F).a(bza.c, 7.0).a(bza.m, 12.0);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      cqq.a(this);
      this.a($$0.G_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      this.a(bxd.a, new czy(dac.pN));
   }

   @Override
   protected byu.b<cqp> ed() {
      return byu.a(e, d);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cqq.a(this, this.ed().a($$0));
   }

   @Override
   public byu<cqp> ec() {
      return (byu<cqp>)super.ec();
   }

   @Override
   public boolean j() {
      return false;
   }

   @Override
   public boolean c(ars $$0, czy $$1) {
      return $$1.a(dac.pN) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      cqq.b(this);
      cqq.c(this);
      super.a($$0);
   }

   @Override
   public cqo x() {
      return this.gl() && this.gu() ? cqo.a : cqo.f;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bxu $$4) {
         cqq.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected awo u() {
      return awp.uD;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.uG;
   }

   @Override
   protected awo l_() {
      return awp.uF;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.uH, 0.15F, 1.0F);
   }

   protected void gy() {
      this.b(awp.uE);
   }

   @Override
   protected void gv() {
      this.b(awp.uI);
   }
}
