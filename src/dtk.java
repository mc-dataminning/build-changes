import com.mojang.serialization.MapCodec;

public class dtk extends dto {
   public static final MapCodec<dtk> a = b(dtk::new);

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   public dtk(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dym $$0) {
      return false;
   }

   @Override
   protected int i_(dym $$0) {
      return 15;
   }
}
