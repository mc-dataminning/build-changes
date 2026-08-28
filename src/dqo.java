import com.mojang.serialization.MapCodec;

public class dqo extends dsc {
   public static final MapCodec<dqo> b = b(dqo::new);

   @Override
   public MapCodec<dqo> a() {
      return b;
   }

   protected dqo(dyl.d $$0) {
      super(dsc.b.e, $$0);
   }
}
