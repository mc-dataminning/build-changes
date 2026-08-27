import com.mojang.serialization.Codec;

public class ecs extends ect {
   public static final Codec<ecs> a = Codec.unit(() -> ecs.b);
   public static final ecs b = new ecs();

   private ecs() {
   }

   @Override
   public boolean a(hx $$0, hx $$1, hx $$2, auv $$3) {
      return true;
   }

   @Override
   protected ecu<?> a() {
      return ecu.a;
   }
}
