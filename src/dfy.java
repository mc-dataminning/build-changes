import com.mojang.serialization.MapCodec;

public class dfy extends dgv implements dgy {
   public static final MapCodec<dfy> a = b(dfy::new);
   protected static final float b = 4.0F;
   protected static final eyx c = dgv.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfy(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      eye $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return $$1.a_($$2.e()).a(aws.av);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         return dgx.a.o();
      } else {
         if ($$1 == jj.b && $$2.a(dgx.mZ)) {
            $$3.a($$4, dgx.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(cvo.dR);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dua $$0, cnp $$1, dcx $$2, je $$3) {
      return $$1.eW().h() instanceof cxb ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dds $$0, je $$1) {
      $$0.a($$1.d(), dgx.mZ.o().b(dfz.i, dum.b), 3);
   }
}
