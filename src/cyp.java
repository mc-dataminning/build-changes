import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyp extends czf implements dgf {
   public static final dmv d = dmu.C;
   private static final epo a = czf.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected cyp(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends cyp> a();

   protected void a(dme $$0, cwf $$1, ib $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.F_().a(40));
      }
   }

   protected static boolean e(dme $$0, cvk $$1, ib $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ih $$3 : ih.values()) {
            if ($$1.b_($$2.a($$3)).a(auj.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(auj.a) && $$1.e() == 8));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return a;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return $$1 == ih.a && !this.a($$0, (cwh)$$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ih.b);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(d);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(d) ? ehs.c.a(false) : super.c_($$0);
   }
}
