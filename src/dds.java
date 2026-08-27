import com.mojang.serialization.MapCodec;

public class dds extends cyo {
   public static final MapCodec<dds> c = b(dds::new);
   public static final ekn e = cva.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dds> a() {
      return c;
   }

   public dds(dhh.d $$0) {
      super($$0, hx.b, e, false);
   }

   @Override
   protected cyp c() {
      return (cyp)cvc.oB;
   }
}
