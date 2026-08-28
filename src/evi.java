import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class evi extends esn {
   public static final MapCodec<evi> d = a(evi::new);

   public evi(esn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      return a($$0, ehp.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(etf $$0, esn.a $$1) {
      $$0.a(new evh($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public esw<?> e() {
      return esw.o;
   }
}
