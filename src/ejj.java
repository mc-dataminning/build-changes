import com.mojang.serialization.Codec;
import java.util.Optional;

public class ejj extends egp {
   public static final Codec<ejj> d = a(ejj::new);

   public ejj(egp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egp.b> a(egp.a $$0) {
      return a($$0, dvz.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ehh $$0, egp.a $$1) {
      $$0.a(new eji($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public egy<?> e() {
      return egy.o;
   }
}
