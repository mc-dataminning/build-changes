import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eud extends eri {
   public static final MapCodec<eud> d = a(eud::new);

   public eud(eri.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eri.b> a(eri.a $$0) {
      return a($$0, egn.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(esa $$0, eri.a $$1) {
      $$0.a(new euc($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public err<?> e() {
      return err.o;
   }
}
