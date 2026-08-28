import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eos extends elx {
   public static final MapCodec<eos> d = a(eos::new);

   public eos(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      return a($$0, ebf.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(emp $$0, elx.a $$1) {
      $$0.a(new eor($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public emg<?> e() {
      return emg.o;
   }
}
