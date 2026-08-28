import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class els extends eix {
   public static final MapCodec<els> d = a(els::new);

   public els(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      return a($$0, dyg.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ejp $$0, eix.a $$1) {
      $$0.a(new elr($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ejg<?> e() {
      return ejg.o;
   }
}
