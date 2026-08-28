import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class epg extends enm {
   public static final MapCodec<epg> d = a(epg::new);

   public epg(enm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      return a($$0, ecs.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eoe $$0, enm.a $$1) {
      ji $$2 = new ji($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new epf.a($$2));
   }

   @Override
   public env<?> e() {
      return env.a;
   }
}
