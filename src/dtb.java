import com.mojang.serialization.MapCodec;

public class dtb extends dnt {
   public static final MapCodec<dtb> c = b(dtb::new);
   public static final fcl g = dkd.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dtb> a() {
      return c;
   }

   public dtb(dxn.d $$0) {
      super($$0, jm.b, g, false, 0.1);
   }

   @Override
   protected int a(bac $$0) {
      return dpm.a($$0);
   }

   @Override
   protected dkd b() {
      return dkf.pe;
   }

   @Override
   protected boolean h(dxo $$0) {
      return dpm.a($$0);
   }
}
