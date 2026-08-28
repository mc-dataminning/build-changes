import com.mojang.serialization.MapCodec;

public class dtj extends dob {
   public static final MapCodec<dtj> c = b(dtj::new);
   public static final fcs e = dkm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dtj> a() {
      return c;
   }

   public dtj(dxu.d $$0) {
      super($$0, jm.b, e, false);
   }

   @Override
   protected doc c() {
      return (doc)dko.oW;
   }
}
