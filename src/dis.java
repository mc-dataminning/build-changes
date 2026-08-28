import com.mojang.serialization.MapCodec;

public abstract class dis extends dfw implements dir {
   public dis(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dis> a();

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cje $$4 = cje.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cje $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dta $$0) {
      return $$0.i() || $$0.a(awd.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$3.a(16) == 0) {
         jd $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayr.a($$1, $$2, $$3, new le(lm.C, $$0));
         }
      }
   }

   public int b(dta $$0, dca $$1, jd $$2) {
      return -16777216;
   }
}
