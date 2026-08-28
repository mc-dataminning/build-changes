import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmi extends cme {
   private static final int ca = 50;
   private static final float cb = 0.35F;
   private static final int cc = 7;
   private static final double cd = 12.0;
   protected static final ImmutableList<cep<? extends ceo<? super cmi>>> e = ImmutableList.of(cep.c, cep.d, cep.b, cep.f, cep.m);
   protected static final ImmutableList<cdi<?>> bZ = ImmutableList.of(
      cdi.n, cdi.v, cdi.g, cdi.h, cdi.k, cdi.l, cdi.ao, cdi.an, cdi.x, cdi.y, cdi.m, cdi.E, new cdi[]{cdi.o, cdi.p, cdi.q, cdi.t, cdi.ab, cdi.M, cdi.b}
   );

   public cmi(btq<? extends cmi> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 20;
   }

   public static bvl.a y() {
      return ckv.gu().a(bvm.s, 50.0).a(bvm.v, 0.35F).a(bvm.c, 7.0).a(bvm.m, 12.0);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      cmj.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azk $$0, bri $$1) {
      this.a(btr.a, new cvl(cvo.pa));
   }

   @Override
   protected bvg.b<cmi> dY() {
      return bvg.a(bZ, e);
   }

   @Override
   protected bvg<?> a(Dynamic<?> $$0) {
      return cmj.a(this, this.dY().a($$0));
   }

   @Override
   public bvg<cmi> dX() {
      return (bvg<cmi>)super.dX();
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public boolean l(cvl $$0) {
      return $$0.a(cvo.pa) ? super.l($$0) : false;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("piglinBruteBrain");
      this.dX().a((arg)this.dS(), this);
      this.dS().ah().c();
      cmj.b(this);
      cmj.c(this);
      super.ad();
   }

   @Override
   public cmh gq() {
      return this.gf() && this.gr() ? cmh.a : cmh.f;
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buf) {
            cmj.a(this, (buf)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected awc w() {
      return awd.tQ;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.tT;
   }

   @Override
   protected awc n_() {
      return awd.tS;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.tU, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(awd.tR);
   }

   @Override
   protected void gs() {
      this.b(awd.tV);
   }
}
