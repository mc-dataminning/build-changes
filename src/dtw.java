import com.mojang.serialization.MapCodec;

public class dtw extends dnt {
   public static final MapCodec<dtw> c = b(dtw::new);
   protected static final fcl g = dkd.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dtw> a() {
      return c;
   }

   public dtw(dxn.d $$0) {
      super($$0, jm.a, g, false, 0.1);
   }

   @Override
   protected int a(bac $$0) {
      return dpm.a($$0);
   }

   @Override
   protected dkd b() {
      return dkf.pc;
   }

   @Override
   protected boolean h(dxo $$0) {
      return dpm.a($$0);
   }
}
