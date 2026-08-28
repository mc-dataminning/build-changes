import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epe extends enk {
   public static final MapCodec<epe> d = a(epe::new);

   public epe(enk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      return a($$0, ecq.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eoc $$0, enk.a $$1) {
      ji $$2 = new ji($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new epd.a($$2));
   }

   @Override
   public ent<?> e() {
      return ent.a;
   }
}
