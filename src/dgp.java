import com.mojang.serialization.MapCodec;

public class dgp extends dhm implements dhp {
   public static final MapCodec<dgp> a = b(dgp::new);
   protected static final float b = 4.0F;
   protected static final ezq c = dhm.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      eyw $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.e()).a(awv.av);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!$$0.a($$3, $$4)) {
         return dho.a.n();
      } else {
         if ($$1 == jk.b && $$2.a(dho.mZ)) {
            $$3.a($$4, dho.mZ.n(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(cvw.dR);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dus $$0, cnx $$1, ddo $$2, jf $$3) {
      return $$1.eW().h() instanceof cxg ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dej $$0, jf $$1) {
      $$0.a($$1.d(), dho.mZ.n().b(dgq.i, dve.b), 3);
   }
}
