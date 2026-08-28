import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqv extends dlu implements djo, dqr {
   public static final MapCodec<dqv> c = b(dqv::new);
   private static final dxn g = dxm.J;
   public static final dxt<jn> d = dxm.U;
   protected static final float e = 6.0F;
   protected static final fbt f = djl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqv> a() {
      return c;
   }

   public dqv(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxr.b).b(g, Boolean.valueOf(false)).b(d, jn.c));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return f;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(awp.bz) || $$1.b_($$2.d()).a(esz.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      dww $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, bvg $$3, cwo $$4) {
      if (!$$0.B_()) {
         ji $$5 = $$1.d();
         dww $$6 = dlu.b($$0, $$5, this.m().b(b, dxr.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(g) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      if ($$0.c(b) == dxr.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ji $$3 = $$2.e();
         dww $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return true;
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      if ($$3.c(dlu.b) == dxr.b) {
         ji $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dji.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ji $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
