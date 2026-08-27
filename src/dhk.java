import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhk extends dbn implements ddv {
   public static final MapCodec<dhk> c = b(dhk::new);
   public static final dnc<dna> d = dbn.b;
   protected static final float e = 6.0F;
   protected static final epo f = czf.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dhk> a() {
      return c;
   }

   public dhk(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return f;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(czh.kJ);
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(czh.bw);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = super.a($$0);
      if ($$1 != null) {
         ehr $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(auj.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      if ($$0.c(d) == dna.a) {
         dme $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dna.b;
      } else {
         ehr $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(auj.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ehr c_(dme $$0) {
      return ehs.c.a(false);
   }

   @Override
   public boolean a(@Nullable cia $$0, cvk $$1, ib $$2, dme $$3, ehq $$4) {
      return false;
   }

   @Override
   public boolean a(cwf $$0, ib $$1, dme $$2, ehr $$3) {
      return false;
   }
}
