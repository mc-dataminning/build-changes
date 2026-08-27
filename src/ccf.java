import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ccf extends ccb {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<bve<? extends bvd<? super ccf>>> bT = ImmutableList.of(bve.c, bve.d, bve.b, bve.f, bve.l);
   protected static final ImmutableList<btz<?>> bU = ImmutableList.of(
      btz.n, btz.v, btz.g, btz.h, btz.k, btz.l, btz.an, btz.am, btz.x, btz.y, btz.m, btz.E, new btz[]{btz.o, btz.p, btz.q, btz.t, btz.aa, btz.L, btz.b}
   );

   public ccf(bkm<? extends ccf> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bmd.a y() {
      return cba.gk().a(bme.l, 50.0).a(bme.m, 0.35F).a(bme.c, 7.0);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ccg.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      this.a(bkn.a, new clb(cle.ok));
   }

   @Override
   protected bly.b<ccf> dO() {
      return bly.a(bU, bT);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return ccg.a(this, this.dO().a($$0));
   }

   @Override
   public bly<ccf> dN() {
      return (bly<ccf>)super.dN();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(clb $$0) {
      return $$0.a(cle.ok) ? super.k($$0) : false;
   }

   @Override
   protected void X() {
      this.dL().ad().a("piglinBruteBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      ccg.b(this);
      ccg.c(this);
      super.X();
   }

   @Override
   public cce gg() {
      return this.fW() && this.gh() ? cce.a : cce.f;
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dL().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof bky) {
            ccg.a(this, (bky)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aqm w() {
      return aqn.sh;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.sk;
   }

   @Override
   protected aqm m_() {
      return aqn.sj;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.sl, 0.15F, 1.0F);
   }

   protected void gl() {
      this.a(aqn.si, 1.0F, this.eW());
   }

   @Override
   protected void gi() {
      this.a(aqn.sm, 1.0F, this.eW());
   }
}
