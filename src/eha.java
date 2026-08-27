import com.mojang.serialization.Codec;
import java.util.Optional;

public class eha extends efh {
   public static final Codec<eha> d = a(eha::new);

   public eha(efh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      return a($$0, dur.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(efz $$0, efh.a $$1) {
      ib $$2 = new ib($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new egz.a($$2));
   }

   @Override
   public efq<?> e() {
      return efq.a;
   }
}
