import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class etw extends erb {
   public static final MapCodec<etw> d = a(etw::new);

   public etw(erb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      return a($$0, egg.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ert $$0, erb.a $$1) {
      $$0.a(new etv($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public erk<?> e() {
      return erk.o;
   }
}
