import com.mojang.serialization.MapCodec;

public class eup extends euq {
   public static final MapCodec<eup> a = MapCodec.unit(() -> eup.b);
   public static final eup b = new eup();

   private eup() {
   }

   @Override
   public boolean a(iu $$0, iu $$1, iu $$2, azv $$3) {
      return true;
   }

   @Override
   protected eur<?> a() {
      return eur.a;
   }
}
