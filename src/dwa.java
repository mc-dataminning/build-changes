import com.mojang.serialization.MapCodec;

public class dwa extends dwf {
   public static final MapCodec<dwa> a = b(dwa::new);

   @Override
   public MapCodec<dwa> a() {
      return a;
   }

   public dwa(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(ebg $$0) {
      return false;
   }

   @Override
   protected int i_(ebg $$0) {
      return 15;
   }
}
