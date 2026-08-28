import com.mojang.serialization.MapCodec;

public class evr extends evs {
   public static final MapCodec<evr> a = MapCodec.unit(() -> evr.b);
   public static final evr b = new evr();

   private evr() {
   }

   @Override
   public boolean a(iw $$0, iw $$1, iw $$2, azz $$3) {
      return true;
   }

   @Override
   protected evt<?> a() {
      return evt.a;
   }
}
