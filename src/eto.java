import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eto extends eqt {
   public static final MapCodec<eto> d = a(eto::new);

   public eto(eqt.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      return a($$0, efy.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(erl $$0, eqt.a $$1) {
      $$0.a(new etn($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public erc<?> e() {
      return erc.o;
   }
}
