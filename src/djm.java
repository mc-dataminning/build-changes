import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djm extends dix implements djz {
   public static final MapCodec<djm> c = b(djm::new);
   protected static final exa g = dfi.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djm> a() {
      return c;
   }

   protected djm(dsk.d $$0) {
      super($$0, jf.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dsl $$0) {
      return $$0.a(dfk.G);
   }

   @Override
   protected dfi b() {
      return dfk.md;
   }

   @Override
   protected boolean m(dsl $$0) {
      return !$$0.a(dfk.kJ);
   }

   @Override
   public boolean a(@Nullable cml $$0, dbm $$1, ja $$2, dsl $$3, eoi $$4) {
      return false;
   }

   @Override
   public boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      return false;
   }

   @Override
   protected int a(ayo $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return $$1.a(awc.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eoj b_(dsl $$0) {
      return eok.c.a(false);
   }
}
