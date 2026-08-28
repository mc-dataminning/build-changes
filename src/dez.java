import com.mojang.serialization.MapCodec;

public class dez extends dfw implements dfz {
   public static final MapCodec<dez> a = b(dez::new);
   protected static final float b = 4.0F;
   protected static final exp c = dfw.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public dez(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      eww $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.d()).a(awd.au);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfy.a.o();
      } else {
         if ($$1 == ji.b && $$2.a(dfy.mZ)) {
            $$3.a($$4, dfy.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(cur.dR);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dta $$0, cmv $$1, dca $$2, jd $$3) {
      return $$1.eU().g() instanceof cwe ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dcu $$0, jd $$1) {
      $$0.a($$1.c(), dfy.mZ.o().a(dfa.i, dtm.b), 3);
   }
}
