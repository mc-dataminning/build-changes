import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxv extends dvi {
   public static final Codec<dxv> d = a(dxv::new);

   public dxv(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      return a($$0, dks.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dwa $$0, dvi.a $$1) {
      $$0.a(new dxu($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dvr<?> e() {
      return dvr.o;
   }
}
