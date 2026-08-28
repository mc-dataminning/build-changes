import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends diw implements djy {
   public static final MapCodec<djl> c = b(djl::new);
   protected static final ewy g = dfh.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djl> a() {
      return c;
   }

   protected djl(dsj.d $$0) {
      super($$0, jf.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dsk $$0) {
      return $$0.a(dfj.G);
   }

   @Override
   protected dfh b() {
      return dfj.md;
   }

   @Override
   protected boolean m(dsk $$0) {
      return !$$0.a(dfj.kJ);
   }

   @Override
   public boolean a(@Nullable cmk $$0, dbl $$1, ja $$2, dsk $$3, eog $$4) {
      return false;
   }

   @Override
   public boolean a(dcg $$0, ja $$1, dsk $$2, eoh $$3) {
      return false;
   }

   @Override
   protected int a(ayo $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return $$1.a(awc.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eoh b_(dsk $$0) {
      return eoi.c.a(false);
   }
}
