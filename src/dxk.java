import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxk extends dux {
   public static final Codec<dxk> d = a(dxk::new);

   public dxk(dux.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      return a($$0, dkh.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dvp $$0, dux.a $$1) {
      $$0.a(new dxj($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dvg<?> e() {
      return dvg.o;
   }
}
