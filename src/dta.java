import com.mojang.serialization.MapCodec;

public class dta extends dnu {
   public static final MapCodec<dta> c = b(dta::new);
   public static final fcm g = dke.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dta> a() {
      return c;
   }

   public dta(dxm.d $$0) {
      super($$0, jm.b, g, false, 0.1);
   }

   @Override
   protected int a(bam $$0) {
      return dpm.a($$0);
   }

   @Override
   protected dke b() {
      return dkg.oX;
   }

   @Override
   protected boolean h(dxn $$0) {
      return dpm.a($$0);
   }
}
