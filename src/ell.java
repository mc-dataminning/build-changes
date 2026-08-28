import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ell extends ejr {
   public static final MapCodec<ell> d = a(ell::new);

   public ell(ejr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      return a($$0, dyy.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ekj $$0, ejr.a $$1) {
      jd $$2 = new jd($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new elk.a($$2));
   }

   @Override
   public eka<?> e() {
      return eka.a;
   }
}
