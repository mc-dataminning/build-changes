import com.mojang.serialization.MapCodec;

public class elv extends emh {
   public static final MapCodec<elv> a = MapCodec.unit(() -> elv.b);
   public static final elv b = new elv();

   private elv() {
   }

   @Override
   protected emj<?> a() {
      return emj.j;
   }
}
