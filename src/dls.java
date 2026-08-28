import com.mojang.serialization.MapCodec;

public class dls extends djn {
   public static final MapCodec<dls> a = b(dls::new);
   protected static final fbv b = dml.c;

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   protected dls(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dwy $$0) {
      return true;
   }

   @Override
   public dwy a(dah $$0) {
      return !this.m().a((dgm)$$0.q(), $$0.a()) ? djn.a(this.m(), djp.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      dml.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dmn;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
