import com.mojang.serialization.MapCodec;

public class ddz extends dfb {
   public static final MapCodec<ddz> a = b(ddz::new);

   @Override
   public MapCodec<? extends ddz> a() {
      return a;
   }

   public ddz(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dca $$0, dse $$1, evp $$2, cnr $$3) {
      if (!$$0.B) {
         iz $$4 = $$2.a();
         $$0.a(null, $$4, awa.G, awb.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, awa.E, awb.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
