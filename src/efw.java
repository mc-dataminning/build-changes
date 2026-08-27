import com.mojang.serialization.Codec;
import java.util.Optional;

public class efw extends edc {
   public static final Codec<efw> d = a(efw::new);

   public efw(edc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      return a($$0, dsm.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(edu $$0, edc.a $$1) {
      $$0.a(new efv($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public edl<?> e() {
      return edl.o;
   }
}
