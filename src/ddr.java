import com.mojang.serialization.MapCodec;

public class ddr extends cyp {
   public static final MapCodec<ddr> c = b(ddr::new);
   public static final ekn g = cva.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<ddr> a() {
      return c;
   }

   public ddr(dhh.d $$0) {
      super($$0, hx.b, g, false, 0.1);
   }

   @Override
   protected int a(ats $$0) {
      return daf.a($$0);
   }

   @Override
   protected cva b() {
      return cvc.oC;
   }

   @Override
   protected boolean g(dhi $$0) {
      return daf.a($$0);
   }
}
