import com.mojang.serialization.Codec;
import java.util.Optional;

public class eib extends efh {
   public static final Codec<eib> d = a(eib::new);

   public eib(efh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      return a($$0, dur.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(efz $$0, efh.a $$1) {
      $$0.a(new eia($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public efq<?> e() {
      return efq.o;
   }
}
