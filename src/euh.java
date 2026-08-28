import com.mojang.serialization.MapCodec;

public class euh extends eui {
   public static final MapCodec<euh> a = MapCodec.unit(() -> euh.b);
   public static final euh b = new euh();

   private euh() {
   }

   @Override
   public boolean a(iu $$0, iu $$1, iu $$2, azv $$3) {
      return true;
   }

   @Override
   protected euj<?> a() {
      return euj.a;
   }
}
