import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djj extends diu implements djw {
   public static final MapCodec<djj> c = b(djj::new);
   protected static final ews g = dff.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djj> a() {
      return c;
   }

   protected djj(dsg.d $$0) {
      super($$0, jf.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dsh $$0) {
      return $$0.a(dfh.G);
   }

   @Override
   protected dff b() {
      return dfh.md;
   }

   @Override
   protected boolean m(dsh $$0) {
      return !$$0.a(dfh.kJ);
   }

   @Override
   public boolean a(@Nullable cmh $$0, dbj $$1, ja $$2, dsh $$3, eoa $$4) {
      return false;
   }

   @Override
   public boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      return false;
   }

   @Override
   protected int a(aym $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      eob $$1 = $$0.q().b_($$0.a());
      return $$1.a(awa.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eob b_(dsh $$0) {
      return eoc.c.a(false);
   }
}
