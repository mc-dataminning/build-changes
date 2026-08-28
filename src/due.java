import com.mojang.serialization.MapCodec;

public class due extends dob {
   public static final MapCodec<due> c = b(due::new);
   public static final fcs e = dkm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<due> a() {
      return c;
   }

   public due(dxu.d $$0) {
      super($$0, jm.a, e, false);
   }

   @Override
   protected doc c() {
      return (doc)dko.oU;
   }
}
