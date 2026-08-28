import com.mojang.serialization.MapCodec;

public class epe extends epq {
   public static final MapCodec<epe> a = MapCodec.unit(() -> epe.b);
   public static final epe b = new epe();

   private epe() {
   }

   @Override
   protected eps<?> a() {
      return eps.j;
   }
}
