import com.mojang.serialization.MapCodec;

public class elw extends emi {
   public static final MapCodec<elw> a = MapCodec.unit(() -> elw.b);
   public static final elw b = new elw();

   private elw() {
   }

   @Override
   protected emk<?> a() {
      return emk.j;
   }
}
