import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqh extends enm {
   public static final MapCodec<eqh> d = a(eqh::new);

   public eqh(enm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      return a($$0, ecs.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eoe $$0, enm.a $$1) {
      $$0.a(new eqg($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public env<?> e() {
      return env.o;
   }
}
