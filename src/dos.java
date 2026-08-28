import com.mojang.serialization.MapCodec;

public class dos extends djn {
   public static final MapCodec<dos> c = b(dos::new);
   public static final exv g = dfy.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dos> a() {
      return c;
   }

   public dos(dtb.d $$0) {
      super($$0, ji.b, g, false, 0.1);
   }

   @Override
   protected int a(ayw $$0) {
      return dle.a($$0);
   }

   @Override
   protected dfy b() {
      return dga.oC;
   }

   @Override
   protected boolean g(dtc $$0) {
      return dle.a($$0);
   }
}
