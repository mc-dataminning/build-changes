import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ere extends eoj {
   public static final MapCodec<ere> d = a(ere::new);

   public ere(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      return a($$0, edo.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(epb $$0, eoj.a $$1) {
      $$0.a(new erd($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eos<?> e() {
      return eos.o;
   }
}
