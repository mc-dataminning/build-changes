import com.mojang.serialization.MapCodec;

public class dxt extends drh {
   public static final MapCodec<dxt> c = b(dxt::new);
   private static final fgw g = dno.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dxt> a() {
      return c;
   }

   public dxt(ebp.d $$0) {
      super($$0, jc.a, g, false, 0.1);
   }

   @Override
   protected int a(bai $$0) {
      return dtb.a($$0);
   }

   @Override
   protected dno b() {
      return dnq.pg;
   }

   @Override
   protected boolean h(ebq $$0) {
      return dtb.a($$0);
   }
}
