import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxl extends duy {
   public static final Codec<dxl> d = a(dxl::new);

   public dxl(duy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      return a($$0, dki.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dvq $$0, duy.a $$1) {
      $$0.a(new dxk($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dvh<?> e() {
      return dvh.o;
   }
}
