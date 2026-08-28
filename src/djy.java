import com.mojang.serialization.MapCodec;

public class djy extends dfw implements dio, dje {
   public static final MapCodec<djy> a = b(djy::new);
   public static final dty<jk> b = dtq.T;

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   protected djy(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jk.k));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(b, $$1.a().a($$0.c(b)));
   }

   @Override
   public dta a(cyb $$0) {
      ji $$1 = $$0.k();
      ji $$2;
      if ($$1.o() == ji.a.b) {
         $$2 = $$0.g().g();
      } else {
         $$2 = ji.b;
      }

      return this.o().a(b, jk.a($$1, $$2));
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drg($$0, $$1);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      dqf $$5 = $$1.c_($$2);
      if ($$5 instanceof drg && $$3.gw()) {
         $$3.a((drg)$$5);
         return bqq.a($$1.B);
      } else {
         return bqq.e;
      }
   }

   public static boolean a(enn.c $$0, enn.c $$1) {
      ji $$2 = m($$0.b());
      ji $$3 = m($$1.b());
      ji $$4 = n($$0.b());
      ji $$5 = n($$1.b());
      drg.a $$6 = drg.a.a($$0.c().l("joint")).orElseGet(() -> $$2.o().d() ? drg.a.b : drg.a.a);
      boolean $$7 = $$6 == drg.a.a;
      return $$2 == $$3.g() && ($$7 || $$4 == $$5) && $$0.c().l("target").equals($$1.c().l("name"));
   }

   public static ji m(dta $$0) {
      return $$0.c(b).a();
   }

   public static ji n(dta $$0) {
      return $$0.c(b).b();
   }
}
