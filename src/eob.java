import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eob extends elg {
   public static final MapCodec<eob> d = a(eob::new);

   public eob(elg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      return a($$0, eao.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ely $$0, elg.a $$1) {
      $$0.a(new eoa($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public elp<?> e() {
      return elp.o;
   }
}
