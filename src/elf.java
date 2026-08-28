import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elf extends eil {
   public static final MapCodec<elf> d = a(elf::new);

   public elf(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      return a($$0, dxv.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ejd $$0, eil.a $$1) {
      $$0.a(new ele($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eiu<?> e() {
      return eiu.o;
   }
}
