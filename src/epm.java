import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epm extends enm {
   public static final MapCodec<epm> d = a(epm::new);

   public epm(enm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      return a($$0, ecs.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(eoe $$0, enm.a $$1) {
      dfo $$2 = $$1.h();
      edr $$3 = $$1.f();
      ji $$4 = new ji($$2.d(), 90, $$2.e());
      dqe $$5 = dqe.a($$3);
      epl.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public env<?> e() {
      return env.e;
   }
}
