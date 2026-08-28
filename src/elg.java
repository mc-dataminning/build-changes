import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elg extends eim {
   public static final MapCodec<elg> d = a(elg::new);

   public elg(eim.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      return a($$0, dxw.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eje $$0, eim.a $$1) {
      $$0.a(new elf($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eiv<?> e() {
      return eiv.o;
   }
}
