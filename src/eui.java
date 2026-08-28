import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eui extends ern {
   public static final MapCodec<eui> d = a(eui::new);

   public eui(ern.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      return a($$0, egs.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(esf $$0, ern.a $$1) {
      $$0.a(new euh($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public erw<?> e() {
      return erw.o;
   }
}
