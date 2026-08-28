import com.mojang.serialization.MapCodec;

public class dpg extends dsr {
   public static final MapCodec<dpg> b = b(dpg::new);

   @Override
   public MapCodec<dpg> a() {
      return b;
   }

   protected dpg(dwv.d $$0) {
      super(dqs.b.e, $$0);
   }
}
