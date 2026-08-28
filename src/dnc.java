import com.mojang.serialization.MapCodec;

public class dnc extends dng {
   public static final MapCodec<dnc> a = b(dnc::new);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(drw.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return false;
   }

   @Override
   protected int g(drx $$0, daz $$1, iz $$2) {
      return $$1.Q();
   }
}
