import com.mojang.serialization.MapCodec;

public class dot extends djm {
   public static final MapCodec<dot> c = b(dot::new);
   public static final exv e = dfy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dot> a() {
      return c;
   }

   public dot(dtb.d $$0) {
      super($$0, ji.b, e, false);
   }

   @Override
   protected djn c() {
      return (djn)dga.oB;
   }
}
