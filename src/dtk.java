import com.mojang.serialization.MapCodec;

public class dtk extends dva {
   public static final MapCodec<dtk> b = b(dtk::new);

   @Override
   public MapCodec<dtk> a() {
      return b;
   }

   protected dtk(ebp.d $$0) {
      super(dva.b.e, $$0);
   }
}
