import com.mojang.serialization.MapCodec;

public class eop extends epb {
   public static final MapCodec<eop> a = MapCodec.unit(() -> eop.b);
   public static final eop b = new eop();

   private eop() {
   }

   @Override
   protected epd<?> a() {
      return epd.j;
   }
}
