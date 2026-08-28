import com.mojang.serialization.MapCodec;

public class dpv extends dpz {
   public static final MapCodec<dpv> a = b(dpv::new);

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(dur.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dus $$0) {
      return false;
   }

   @Override
   protected int i_(dus $$0) {
      return 15;
   }
}
