import com.mojang.serialization.MapCodec;

public class diq extends djn implements djq {
   public static final MapCodec<diq> a = b(diq::new);
   protected static final float b = 4.0F;
   protected static final fbv c = djn.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      fbb $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.e()).a(awp.ax);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djp.a.m();
      } else {
         return $$4 == jn.b && $$6.a(djp.nB) ? djp.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(cwu.ed);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dwy $$0, coy $$1, dfo $$2, ji $$3) {
      return $$1.eZ().h() instanceof cye ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dgj $$0, ji $$1) {
      $$0.a($$1.d(), djp.nB.m().b(dir.i, dxk.b), 3);
   }
}
