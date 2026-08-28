import com.mojang.serialization.MapCodec;

public class dvn extends dvs {
   public static final MapCodec<dvn> a = b(dvn::new);

   @Override
   public MapCodec<dvn> a() {
      return a;
   }

   public dvn(eas.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(eat $$0) {
      return false;
   }

   @Override
   protected int i_(eat $$0) {
      return 15;
   }
}
