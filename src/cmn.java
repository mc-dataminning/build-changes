import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmn extends cmj {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<ceu<? extends cet<? super cmn>>> e = ImmutableList.of(ceu.c, ceu.d, ceu.b, ceu.f, ceu.m);
   protected static final ImmutableList<cdn<?>> bY = ImmutableList.of(
      cdn.n, cdn.v, cdn.g, cdn.h, cdn.k, cdn.l, cdn.ao, cdn.an, cdn.x, cdn.y, cdn.m, cdn.E, new cdn[]{cdn.o, cdn.p, cdn.q, cdn.t, cdn.ab, cdn.M, cdn.b}
   );

   public cmn(btv<? extends cmn> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bvq.a y() {
      return cla.gv().a(bvr.s, 50.0).a(bvr.v, 0.35F).a(bvr.c, 7.0).a(bvr.m, 12.0);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      cmo.a(this);
      this.a($$0.C_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      this.a(btw.a, new cvp(cvt.pa));
   }

   @Override
   protected bvl.b<cmn> dY() {
      return bvl.a(bY, e);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return cmo.a(this, this.dY().a($$0));
   }

   @Override
   public bvl<cmn> dX() {
      return (bvl<cmn>)super.dX();
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public boolean j(cvp $$0) {
      return $$0.a(cvt.pa) ? super.j($$0) : false;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("piglinBruteBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      cmo.b(this);
      cmo.c(this);
      super.ad();
   }

   @Override
   public cmm gr() {
      return this.gg() && this.gs() ? cmm.a : cmm.f;
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof buk) {
            cmo.a(this, (buk)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected awd w() {
      return awe.tQ;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.tT;
   }

   @Override
   protected awd n_() {
      return awe.tS;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.tU, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(awe.tR);
   }

   @Override
   protected void gt() {
      this.b(awe.tV);
   }
}
