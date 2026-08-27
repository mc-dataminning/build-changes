import com.mojang.serialization.Codec;
import java.util.Optional;

public class eag extends dxm {
   public static final Codec<eag> d = a(eag::new);

   public eag(dxm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      return a($$0, dmw.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dye $$0, dxm.a $$1) {
      $$0.a(new eaf($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dxv<?> e() {
      return dxv.o;
   }
}
