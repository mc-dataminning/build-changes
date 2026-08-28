import com.mojang.serialization.MapCodec;

public class elo extends emk {
   public static final MapCodec<elo> a = MapCodec.unit(() -> elo.b);
   public static final elo b = new elo();

   private elo() {
   }

   @Override
   public boolean a(dsh $$0, aym $$1) {
      return true;
   }

   @Override
   protected eml<?> a() {
      return eml.a;
   }
}
