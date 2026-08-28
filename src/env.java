import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class env extends emb {
   public static final MapCodec<env> d = a(env::new);

   public env(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      return a($$0, ebj.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(emt $$0, emb.a $$1) {
      jh $$2 = new jh($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new enu.a($$2));
   }

   @Override
   public emk<?> e() {
      return emk.a;
   }
}
