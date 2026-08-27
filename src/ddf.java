import com.mojang.serialization.MapCodec;

public class ddf extends cxn {
   public static final MapCodec<ddf> c = b(ddf::new);
   public static final eiy e = cua.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<ddf> a() {
      return c;
   }

   public ddf(dga.d $$0) {
      super($$0, hx.a, e, false);
   }

   @Override
   protected cxo c() {
      return (cxo)cuc.oz;
   }
}
