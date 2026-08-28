import com.mojang.serialization.MapCodec;

public class dpe extends dpi {
   public static final MapCodec<dpe> a = b(dpe::new);

   @Override
   public MapCodec<dpe> a() {
      return a;
   }

   public dpe(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dua $$0) {
      return false;
   }

   @Override
   protected int i_(dua $$0) {
      return 15;
   }
}
