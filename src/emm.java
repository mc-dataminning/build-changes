import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class emm extends ejr {
   public static final MapCodec<emm> d = a(emm::new);

   public emm(ejr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      return a($$0, dyy.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ekj $$0, ejr.a $$1) {
      $$0.a(new eml($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eka<?> e() {
      return eka.o;
   }
}
