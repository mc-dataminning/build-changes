import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drp extends dmn implements dkh, drl {
   public static final MapCodec<drp> c = b(drp::new);
   private static final dyh e = dyg.I;
   public static final dyo<jn> d = dyg.T;
   private static final fcr f = dke.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<drp> a() {
      return c;
   }

   public drp(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dym.b).b(e, Boolean.valueOf(false)).b(d, jn.c));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return f;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(awp.bz) || $$1.b_($$2.d()).a(etx.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bvy $$3, cxh $$4) {
      if (!$$0.w_()) {
         ji $$5 = $$1.d();
         dxq $$6 = dmn.b($$0, $$5, this.m().b(b, dym.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      if ($$0.c(b) == dym.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ji $$3 = $$2.e();
         dxq $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return true;
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      if ($$3.c(dmn.b) == dym.b) {
         ji $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dkb.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ji $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
