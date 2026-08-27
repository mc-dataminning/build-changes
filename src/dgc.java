import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgc extends czo implements czi, ddv {
   public static final MapCodec<dgc> a = b(dgc::new);
   protected static final float b = 6.0F;
   protected static final epo c = czf.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   protected dgc(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.d($$1, $$2, ih.b) && !$$0.a(czh.kJ);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return $$1.a(auj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      dme $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   protected ehr c_(dme $$0) {
      return ehs.c.a(false);
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      dme $$4 = czh.bx.o();
      dme $$5 = $$4.a(dhk.d, dna.a);
      ib $$6 = $$2.c();
      if ($$0.a_($$6).a(czh.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
