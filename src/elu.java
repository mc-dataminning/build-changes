import com.mojang.serialization.MapCodec;

public class elu extends elv {
   public static final MapCodec<elu> a = MapCodec.unit(() -> elu.b);
   public static final elu b = new elu();

   private elu() {
   }

   @Override
   public boolean a(iz $$0, iz $$1, iz $$2, azf $$3) {
      return true;
   }

   @Override
   protected elw<?> a() {
      return elw.a;
   }
}
