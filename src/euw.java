import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class euw extends esb {
   public static final MapCodec<euw> d = a(euw::new);

   public euw(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      return a($$0, ehd.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(est $$0, esb.a $$1) {
      $$0.a(new euv($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public esk<?> e() {
      return esk.o;
   }
}
