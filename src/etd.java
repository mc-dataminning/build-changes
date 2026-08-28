import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class etd extends eqi {
   public static final MapCodec<etd> d = a(etd::new);

   public etd(eqi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      return a($$0, efn.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(era $$0, eqi.a $$1) {
      $$0.a(new etc($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eqr<?> e() {
      return eqr.o;
   }
}
