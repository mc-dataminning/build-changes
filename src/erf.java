import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class erf extends eok {
   public static final MapCodec<erf> d = a(erf::new);

   public erf(eok.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      return a($$0, edq.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(epc $$0, eok.a $$1) {
      $$0.a(new ere($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eot<?> e() {
      return eot.o;
   }
}
