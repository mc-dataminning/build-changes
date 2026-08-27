import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cje extends cja {
   private static final int bZ = 50;
   private static final float ca = 0.35F;
   private static final int cb = 7;
   protected static final ImmutableList<cbo<? extends cbn<? super cje>>> e = ImmutableList.of(cbo.c, cbo.d, cbo.b, cbo.f, cbo.m);
   protected static final ImmutableList<cah<?>> bY = ImmutableList.of(
      cah.n, cah.v, cah.g, cah.h, cah.k, cah.l, cah.ao, cah.an, cah.x, cah.y, cah.m, cah.E, new cah[]{cah.o, cah.p, cah.q, cah.t, cah.ab, cah.M, cah.b}
   );

   public cje(bqr<? extends cje> $$0, czu $$1) {
      super($$0, $$1);
      this.bN = 20;
   }

   public static bsk.a y() {
      return chr.gv().a(bsl.q, 50.0).a(bsl.r, 0.35F).a(bsl.c, 7.0);
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      cjf.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayd $$0, boo $$1) {
      this.a(bqs.a, new csd(csg.oY));
   }

   @Override
   protected bsf.b<cje> dR() {
      return bsf.a(bY, e);
   }

   @Override
   protected bsf<?> a(Dynamic<?> $$0) {
      return cjf.a(this, this.dR().a($$0));
   }

   @Override
   public bsf<cje> dQ() {
      return (bsf<cje>)super.dQ();
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean k(csd $$0) {
      return $$0.a(csg.oY) ? super.k($$0) : false;
   }

   @Override
   protected void Y() {
      this.dN().af().a("piglinBruteBrain");
      this.dQ().a((aqe)this.dN(), this);
      this.dN().af().c();
      cjf.b(this);
      cjf.c(this);
      super.Y();
   }

   @Override
   public cjd gr() {
      return this.gh() && this.gs() ? cjd.a : cjd.f;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dN().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bre) {
            cjf.a(this, (bre)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected auy v() {
      return auz.tA;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.tD;
   }

   @Override
   protected auy o_() {
      return auz.tC;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.tE, 0.15F, 1.0F);
   }

   protected void gw() {
      this.b(auz.tB);
   }

   @Override
   protected void gt() {
      this.b(auz.tF);
   }
}
