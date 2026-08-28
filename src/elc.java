import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elc extends eii {
   public static final MapCodec<elc> d = a(elc::new);

   public elc(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      return a($$0, dxs.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eja $$0, eii.a $$1) {
      $$0.a(new elb($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eir<?> e() {
      return eir.o;
   }
}
