import com.mojang.serialization.MapCodec;

public class euw extends eux {
   public static final MapCodec<euw> a = MapCodec.unit(() -> euw.b);
   public static final euw b = new euw();

   private euw() {
   }

   @Override
   public boolean a(iv $$0, iv $$1, iv $$2, azv $$3) {
      return true;
   }

   @Override
   protected euy<?> a() {
      return euy.a;
   }
}
