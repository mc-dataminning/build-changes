import com.mojang.serialization.Codec;
import java.util.Optional;

public class eab extends dxh {
   public static final Codec<eab> d = a(eab::new);

   public eab(dxh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      return a($$0, dmr.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dxz $$0, dxh.a $$1) {
      $$0.a(new eaa($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dxq<?> e() {
      return dxq.o;
   }
}
