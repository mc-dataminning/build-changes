import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cnm extends cni {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cfq<? extends cfp<? super cnm>>> d = ImmutableList.of(cfq.c, cfq.d, cfq.b, cfq.f, cfq.m);
   protected static final ImmutableList<cej<?>> bY = ImmutableList.of(
      cej.n, cej.v, cej.g, cej.h, cej.k, cej.l, cej.ao, cej.an, cej.x, cej.y, cej.m, cej.E, new cej[]{cej.o, cej.p, cej.q, cej.t, cej.ab, cej.M, cej.b}
   );

   public cnm(buq<? extends cnm> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bwm.a t() {
      return clw.gu().a(bwn.s, 50.0).a(bwn.v, 0.35F).a(bwn.c, 7.0).a(bwn.m, 12.0);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      cnn.a(this);
      this.a($$0.H_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azg $$0, bsg $$1) {
      this.a(bur.a, new cwn(cwr.pE));
   }

   @Override
   protected bwh.b<cnm> ed() {
      return bwh.a(bY, d);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cnn.a(this, this.ed().a($$0));
   }

   @Override
   public bwh<cnm> ec() {
      return (bwh<cnm>)super.ec();
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean c(arc $$0, cwn $$1) {
      return $$1.a(cwr.pE) ? super.c($$0, $$1) : false;
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("piglinBruteBrain");
      this.ec().a($$0, this);
      $$1.c();
      cnn.b(this);
      cnn.c(this);
      super.a($$0);
   }

   @Override
   public cnl gq() {
      return this.ge() && this.gr() ? cnl.a : cnl.f;
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      boolean $$3 = super.a($$0, $$1, $$2);
      if ($$3 && $$1.d() instanceof bvf $$4) {
         cnn.a($$0, this, $$4);
      }

      return $$3;
   }

   @Override
   protected avy u() {
      return avz.up;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.us;
   }

   @Override
   protected avy o_() {
      return avz.ur;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.ut, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(avz.uq);
   }

   @Override
   protected void gs() {
      this.b(avz.uu);
   }
}
