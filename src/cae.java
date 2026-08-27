import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cae extends caa {
   private static final int bV = 50;
   private static final float bW = 0.35F;
   private static final int bX = 7;
   protected static final ImmutableList<btd<? extends btc<? super cae>>> bT = ImmutableList.of(btd.c, btd.d, btd.b, btd.f, btd.l);
   protected static final ImmutableList<bry<?>> bU = ImmutableList.of(
      bry.n, bry.v, bry.g, bry.h, bry.k, bry.l, bry.an, bry.am, bry.x, bry.y, bry.m, bry.E, new bry[]{bry.o, bry.p, bry.q, bry.t, bry.aa, bry.L, bry.b}
   );

   public cae(bik<? extends cae> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 20;
   }

   public static bkc.a t() {
      return byz.gf().a(bkd.a, 50.0).a(bkd.d, 0.35F).a(bkd.f, 7.0);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      caf.a(this);
      this.a($$0.y_(), $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      this.a(bil.a, new ciw(ciz.ok));
   }

   @Override
   protected bjx.b<cae> dN() {
      return bjx.a(bU, bT);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return caf.a(this, this.dN().a($$0));
   }

   @Override
   public bjx<cae> dM() {
      return (bjx<cae>)super.dM();
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public boolean k(ciw $$0) {
      return $$0.a(ciz.ok) ? super.k($$0) : false;
   }

   @Override
   protected void V() {
      this.dK().ad().a("piglinBruteBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      caf.b(this);
      caf.c(this);
      super.V();
   }

   @Override
   public cad gb() {
      return this.fS() && this.gc() ? cad.a : cad.f;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof biw) {
            caf.a(this, (biw)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected aot r() {
      return aou.sd;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.sg;
   }

   @Override
   protected aot h_() {
      return aou.sf;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.sh, 0.15F, 1.0F);
   }

   protected void gg() {
      this.a(aou.se, 1.0F, this.eV());
   }

   @Override
   protected void gd() {
      this.a(aou.si, 1.0F, this.eV());
   }
}
