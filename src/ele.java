import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ele extends eik {
   public static final MapCodec<ele> d = a(ele::new);

   public ele(eik.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      return a($$0, dxu.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ejc $$0, eik.a $$1) {
      $$0.a(new eld($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eit<?> e() {
      return eit.o;
   }
}
