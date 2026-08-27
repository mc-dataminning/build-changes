import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddi extends dcu implements ddv {
   public static final MapCodec<ddi> c = b(ddi::new);
   protected static final epo g = czf.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<ddi> a() {
      return c;
   }

   protected ddi(dmd.d $$0) {
      super($$0, ih.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dme $$0) {
      return $$0.a(czh.G);
   }

   @Override
   protected czf b() {
      return czh.md;
   }

   @Override
   protected boolean m(dme $$0) {
      return !$$0.a(czh.kJ);
   }

   @Override
   public boolean a(@Nullable cia $$0, cvk $$1, ib $$2, dme $$3, ehq $$4) {
      return false;
   }

   @Override
   public boolean a(cwf $$0, ib $$1, dme $$2, ehr $$3) {
      return false;
   }

   @Override
   protected int a(awt $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return $$1.a(auj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ehr c_(dme $$0) {
      return ehs.c.a(false);
   }
}
