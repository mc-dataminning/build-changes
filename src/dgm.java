import com.mojang.serialization.MapCodec;

public class dgm extends dhj implements dhm {
   public static final MapCodec<dgm> a = b(dgm::new);
   protected static final float b = 4.0F;
   protected static final ezm c = dhj.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      eys $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return $$1.a_($$2.e()).a(awt.av);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         return dhl.a.o();
      } else {
         if ($$1 == jj.b && $$2.a(dhl.mZ)) {
            $$3.a($$4, dhl.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(cvt.dR);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(duo $$0, cnu $$1, ddl $$2, je $$3) {
      return $$1.eW().h() instanceof cxd ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(deg $$0, je $$1) {
      $$0.a($$1.d(), dhl.mZ.o().b(dgn.i, dva.b), 3);
   }
}
