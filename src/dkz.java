import com.mojang.serialization.MapCodec;

public class dkz extends dfw {
   public static final MapCodec<dkz> c = b(dkz::new);
   public static final etc g = dch.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dkz> a() {
      return c;
   }

   public dkz(dph.d $$0) {
      super($$0, ij.b, g, false, 0.1);
   }

   @Override
   protected int a(axt $$0) {
      return dhm.a($$0);
   }

   @Override
   protected dch b() {
      return dcj.oC;
   }

   @Override
   protected boolean g(dpi $$0) {
      return dhm.a($$0);
   }
}
