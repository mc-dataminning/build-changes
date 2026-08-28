import com.mojang.serialization.MapCodec;

public class dpf extends dqs {
   public static final MapCodec<dpf> b = b(dpf::new);

   @Override
   public MapCodec<dpf> a() {
      return b;
   }

   protected dpf(dwv.d $$0) {
      super(dqs.b.e, $$0);
   }
}
