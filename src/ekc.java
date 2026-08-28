import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekc extends eij {
   public static final MapCodec<ekc> d = a(ekc::new);

   public ekc(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      return a($$0, dxt.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ejb $$0, eij.a $$1) {
      iz $$2 = new iz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ekb.a($$2));
   }

   @Override
   public eis<?> e() {
      return eis.a;
   }
}
