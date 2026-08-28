import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqx extends dlw implements djq, dqt {
   public static final MapCodec<dqx> c = b(dqx::new);
   private static final dxp g = dxo.J;
   public static final dxv<jn> d = dxo.U;
   protected static final float e = 6.0F;
   protected static final fbv f = djn.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dqx> a() {
      return c;
   }

   public dqx(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxt.b).b(g, Boolean.valueOf(false)).b(d, jn.c));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return f;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(awp.bz) || $$1.b_($$2.d()).a(etb.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      if (!$$0.B_()) {
         ji $$5 = $$1.d();
         dwy $$6 = dlw.b($$0, $$5, this.m().b(b, dxt.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(g) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      if ($$0.c(b) == dxt.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ji $$3 = $$2.e();
         dwy $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return true;
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      if ($$3.c(dlw.b) == dxt.b) {
         ji $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         djk.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ji $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
