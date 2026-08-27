import com.mojang.serialization.Codec;
import java.util.Optional;

public class ede extends ebl {
   public static final Codec<ede> d = a(ede::new);

   public ede(ebl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      return a($$0, dqv.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ecd $$0, ebl.a $$1) {
      hz $$2 = new hz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new edd.a($$2));
   }

   @Override
   public ebu<?> e() {
      return ebu.a;
   }
}
