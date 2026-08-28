import com.mojang.serialization.MapCodec;

public class dqr extends dqv {
   public static final MapCodec<dqr> a = b(dqr::new);

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dvo $$0) {
      return false;
   }

   @Override
   protected int i_(dvo $$0) {
      return 15;
   }
}
