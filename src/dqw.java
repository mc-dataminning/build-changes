import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqw extends dlv implements djp, dqs {
   public static final MapCodec<dqw> c = b(dqw::new);
   private static final dxo g = dxn.J;
   public static final dxu<jn> d = dxn.U;
   protected static final float e = 6.0F;
   protected static final fbu f = djm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqw> a() {
      return c;
   }

   public dqw(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxs.b).b(g, Boolean.valueOf(false)).b(d, jn.c));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return f;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(awp.bz) || $$1.b_($$2.d()).a(eta.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      dwx $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, bvh $$3, cwp $$4) {
      if (!$$0.B_()) {
         ji $$5 = $$1.d();
         dwx $$6 = dlv.b($$0, $$5, this.m().b(b, dxs.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(g) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      if ($$0.c(b) == dxs.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ji $$3 = $$2.e();
         dwx $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return true;
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      if ($$3.c(dlv.b) == dxs.b) {
         ji $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         djj.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ji $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
