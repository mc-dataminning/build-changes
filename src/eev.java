import com.mojang.serialization.Codec;
import java.util.Optional;

public class eev extends edc {
   public static final Codec<eev> d = a(eev::new);

   public eev(edc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      return a($$0, dsm.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(edu $$0, edc.a $$1) {
      ib $$2 = new ib($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eeu.a($$2));
   }

   @Override
   public edl<?> e() {
      return edl.a;
   }
}
