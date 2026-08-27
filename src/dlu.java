import com.mojang.serialization.MapCodec;

public class dlu extends dfw {
   public static final MapCodec<dlu> c = b(dlu::new);
   protected static final etc g = dch.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dlu> a() {
      return c;
   }

   public dlu(dph.d $$0) {
      super($$0, ij.a, g, false, 0.1);
   }

   @Override
   protected int a(axt $$0) {
      return dhm.a($$0);
   }

   @Override
   protected dch b() {
      return dcj.oA;
   }

   @Override
   protected boolean g(dpi $$0) {
      return dhm.a($$0);
   }
}
