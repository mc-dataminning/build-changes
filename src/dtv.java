import com.mojang.serialization.MapCodec;

public class dtv extends dnu {
   public static final MapCodec<dtv> c = b(dtv::new);
   protected static final fcm g = dke.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dtv> a() {
      return c;
   }

   public dtv(dxm.d $$0) {
      super($$0, jm.a, g, false, 0.1);
   }

   @Override
   protected int a(bam $$0) {
      return dpm.a($$0);
   }

   @Override
   protected dke b() {
      return dkg.oV;
   }

   @Override
   protected boolean h(dxn $$0) {
      return dpm.a($$0);
   }
}
