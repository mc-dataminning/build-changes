import com.mojang.serialization.MapCodec;

public class elg extends emc {
   public static final MapCodec<elg> a = MapCodec.unit(() -> elg.b);
   public static final elg b = new elg();

   private elg() {
   }

   @Override
   public boolean a(dsa $$0, azf $$1) {
      return true;
   }

   @Override
   protected emd<?> a() {
      return emd.a;
   }
}
