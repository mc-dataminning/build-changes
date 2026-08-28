import com.mojang.serialization.MapCodec;

public class dpn extends djn {
   public static final MapCodec<dpn> c = b(dpn::new);
   protected static final exv g = dfy.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dpn> a() {
      return c;
   }

   public dpn(dtb.d $$0) {
      super($$0, ji.a, g, false, 0.1);
   }

   @Override
   protected int a(ayw $$0) {
      return dle.a($$0);
   }

   @Override
   protected dfy b() {
      return dga.oA;
   }

   @Override
   protected boolean g(dtc $$0) {
      return dle.a($$0);
   }
}
