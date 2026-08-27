import com.mojang.serialization.Codec;
import java.util.Optional;

public class dyn extends dwa {
   public static final Codec<dyn> d = a(dyn::new);

   public dyn(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      return a($$0, dlk.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dws $$0, dwa.a $$1) {
      $$0.a(new dym($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dwj<?> e() {
      return dwj.o;
   }
}
