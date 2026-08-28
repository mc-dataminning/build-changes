import com.mojang.serialization.MapCodec;

public class eob extends eoy {
   public static final MapCodec<eob> a = MapCodec.unit(() -> eob.b);
   public static final eob b = new eob();

   private eob() {
   }

   @Override
   public boolean a(duo $$0, azl $$1) {
      return true;
   }

   @Override
   protected eoz<?> a() {
      return eoz.a;
   }
}
