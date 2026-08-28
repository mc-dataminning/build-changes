import com.mojang.serialization.MapCodec;

public class eob extends eon {
   public static final MapCodec<eob> a = MapCodec.unit(() -> eob.b);
   public static final eob b = new eob();

   private eob() {
   }

   @Override
   protected eop<?> a() {
      return eop.j;
   }
}
