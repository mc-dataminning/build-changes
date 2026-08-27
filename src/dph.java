import com.mojang.serialization.MapCodec;

public class dph extends div {
   public static final MapCodec<dph> c = b(dph::new);
   protected static final exn g = dfc.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dph> a() {
      return c;
   }

   public dph(dtb.d $$0) {
      super($$0, iw.a, g, false, 0.1);
   }

   @Override
   protected int a(ayt $$0) {
      return dkn.a($$0);
   }

   @Override
   protected dfc b() {
      return dfe.pA;
   }

   @Override
   protected boolean g(dtc $$0) {
      return dkn.a($$0);
   }
}
