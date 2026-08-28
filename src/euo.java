import com.mojang.serialization.MapCodec;

public class euo extends eva {
   public static final MapCodec<euo> a = MapCodec.unit(() -> euo.b);
   public static final euo b = new euo();

   private euo() {
   }

   @Override
   protected evc<?> a() {
      return evc.j;
   }
}
