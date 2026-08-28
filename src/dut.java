import com.mojang.serialization.MapCodec;

public class dut extends duy {
   public static final MapCodec<dut> a = b(dut::new);

   @Override
   public MapCodec<dut> a() {
      return a;
   }

   public dut(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dzz $$0) {
      return false;
   }

   @Override
   protected int i_(dzz $$0) {
      return 15;
   }
}
