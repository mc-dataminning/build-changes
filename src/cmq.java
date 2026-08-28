import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cmq extends cmm {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   private static final double cc = 12.0;
   protected static final ImmutableList<cex<? extends cew<? super cmq>>> e = ImmutableList.of(cex.c, cex.d, cex.b, cex.f, cex.m);
   protected static final ImmutableList<cdq<?>> bY = ImmutableList.of(
      cdq.n, cdq.v, cdq.g, cdq.h, cdq.k, cdq.l, cdq.ao, cdq.an, cdq.x, cdq.y, cdq.m, cdq.E, new cdq[]{cdq.o, cdq.p, cdq.q, cdq.t, cdq.ab, cdq.M, cdq.b}
   );

   public cmq(bty<? extends cmq> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bvt.a y() {
      return cld.gu().a(bvu.s, 50.0).a(bvu.v, 0.35F).a(bvu.c, 7.0).a(bvu.m, 12.0);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      cmr.a(this);
      this.a($$0.D_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      this.a(btz.a, new cvs(cvw.pa));
   }

   @Override
   protected bvo.b<cmq> dZ() {
      return bvo.a(bY, e);
   }

   @Override
   protected bvo<?> a(Dynamic<?> $$0) {
      return cmr.a(this, this.dZ().a($$0));
   }

   @Override
   public bvo<cmq> dY() {
      return (bvo<cmq>)super.dY();
   }

   @Override
   public boolean q() {
      return false;
   }

   @Override
   public boolean j(cvs $$0) {
      return $$0.a(cvw.pa) ? super.j($$0) : false;
   }

   @Override
   protected void ac() {
      this.dS().ah().a("piglinBruteBrain");
      this.dY().a((arj)this.dS(), this);
      this.dS().ah().c();
      cmr.b(this);
      cmr.c(this);
      super.ac();
   }

   @Override
   public cmp gq() {
      return this.gf() && this.gr() ? cmp.a : cmp.f;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dS().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bun) {
            cmr.a(this, (bun)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected awf w() {
      return awg.tQ;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.tT;
   }

   @Override
   protected awf o_() {
      return awg.tS;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.tU, 0.15F, 1.0F);
   }

   protected void gv() {
      this.b(awg.tR);
   }

   @Override
   protected void gs() {
      this.b(awg.tV);
   }
}
