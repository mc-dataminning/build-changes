import com.mojang.serialization.MapCodec;

public class elh extends emd {
   public static final MapCodec<elh> a = MapCodec.unit(() -> elh.b);
   public static final elh b = new elh();

   private elh() {
   }

   @Override
   public boolean a(dsb $$0, azg $$1) {
      return true;
   }

   @Override
   protected eme<?> a() {
      return eme.a;
   }
}
