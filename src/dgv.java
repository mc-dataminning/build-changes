import com.mojang.serialization.MapCodec;

public class dgv extends dgz {
   public static final MapCodec<dgv> a = b(dgv::new);

   @Override
   public MapCodec<dgv> a() {
      return a;
   }

   public dgv(dle.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return false;
   }

   @Override
   protected int g(dlf $$0, cut $$1, hz $$2) {
      return $$1.O();
   }
}
