import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class emk extends ejp {
   public static final MapCodec<emk> d = a(emk::new);

   public emk(ejp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      return a($$0, dyy.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ekh $$0, ejp.a $$1) {
      $$0.a(new emj($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ejy<?> e() {
      return ejy.o;
   }
}
