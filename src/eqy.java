import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqy extends eod {
   public static final MapCodec<eqy> d = a(eqy::new);

   public eqy(eod.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      return a($$0, edj.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eov $$0, eod.a $$1) {
      $$0.a(new eqx($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eom<?> e() {
      return eom.o;
   }
}
