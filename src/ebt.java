import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebt extends dyz {
   public static final Codec<ebt> d = a(ebt::new);

   public ebt(dyz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      return a($$0, doj.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dzr $$0, dyz.a $$1) {
      $$0.a(new ebs($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dzi<?> e() {
      return dzi.o;
   }
}
