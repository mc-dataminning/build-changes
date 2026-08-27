import com.mojang.serialization.MapCodec;

public class dit extends ddo {
   public static final MapCodec<dit> c = b(dit::new);
   public static final eqk e = daa.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dit> a() {
      return c;
   }

   public dit(dmy.d $$0) {
      super($$0, ih.b, e, false);
   }

   @Override
   protected ddp c() {
      return (ddp)dac.oB;
   }
}
