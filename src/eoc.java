import com.mojang.serialization.MapCodec;

public class eoc extends eod {
   public static final MapCodec<eoc> a = MapCodec.unit(() -> eoc.b);
   public static final eoc b = new eoc();

   private eoc() {
   }

   @Override
   public boolean a(je $$0, je $$1, je $$2, azk $$3) {
      return true;
   }

   @Override
   protected eoe<?> a() {
      return eoe.a;
   }
}
