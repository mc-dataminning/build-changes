import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eld extends eij {
   public static final MapCodec<eld> d = a(eld::new);

   public eld(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      return a($$0, dxt.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ejb $$0, eij.a $$1) {
      $$0.a(new elc($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eis<?> e() {
      return eis.o;
   }
}
