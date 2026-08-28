import com.mojang.serialization.MapCodec;

public class dwk extends dwp {
   public static final MapCodec<dwk> a = b(dwk::new);

   @Override
   public MapCodec<dwk> a() {
      return a;
   }

   public dwk(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(ebq $$0) {
      return false;
   }

   @Override
   protected int i_(ebq $$0) {
      return 15;
   }
}
