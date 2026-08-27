import com.mojang.serialization.MapCodec;

public class ddw extends czb {
   public static final MapCodec<ddw> a = b(ddw::new);
   protected static final eos b = cys.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(dli.d $$0) {
      super($$0);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(aua.aK) || $$0.a(cyu.dX) || super.b($$0, $$1, $$2);
   }
}
