import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekd extends ehj {
   public static final MapCodec<ekd> d = a(ekd::new);

   public ekd(ehj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      return a($$0, dwt.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eib $$0, ehj.a $$1) {
      $$0.a(new ekc($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ehs<?> e() {
      return ehs.o;
   }
}
