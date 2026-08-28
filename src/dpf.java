import com.mojang.serialization.MapCodec;

public class dpf extends dsq {
   public static final MapCodec<dpf> b = b(dpf::new);

   @Override
   public MapCodec<dpf> a() {
      return b;
   }

   protected dpf(dwu.d $$0) {
      super(dqr.b.e, $$0);
   }
}
