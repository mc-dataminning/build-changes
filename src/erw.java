import com.mojang.serialization.MapCodec;

public class erw extends esi {
   public static final MapCodec<erw> a = MapCodec.unit(() -> erw.b);
   public static final erw b = new erw();

   private erw() {
   }

   @Override
   protected esk<?> a() {
      return esk.j;
   }
}
