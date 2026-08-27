import com.mojang.serialization.Codec;
import java.util.Optional;

public class efa extends ecg {
   public static final Codec<efa> d = a(efa::new);

   public efa(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      return a($$0, drq.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ecy $$0, ecg.a $$1) {
      $$0.a(new eez($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ecp<?> e() {
      return ecp.o;
   }
}
