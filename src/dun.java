import com.mojang.serialization.Codec;
import java.util.Optional;

public class dun extends dsa {
   public static final Codec<dun> d = a(dun::new);

   public dun(dsa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dsa.b> a(dsa.a $$0) {
      return a($$0, dhk.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dss $$0, dsa.a $$1) {
      $$0.a(new dum($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dsj<?> e() {
      return dsj.o;
   }
}
