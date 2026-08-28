import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class etc extends eri {
   public static final MapCodec<etc> d = a(etc::new);

   public etc(eri.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      return a($$0, egn.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(esa $$0, eri.a $$1) {
      iv $$2 = new iv($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new etb.a($$2));
   }

   @Override
   public err<?> e() {
      return err.a;
   }
}
