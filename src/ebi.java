import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebi extends dyo {
   public static final Codec<ebi> d = a(ebi::new);

   public ebi(dyo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      return a($$0, dny.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dzg $$0, dyo.a $$1) {
      $$0.a(new ebh($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dyx<?> e() {
      return dyx.o;
   }
}
