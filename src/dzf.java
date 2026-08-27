import com.mojang.serialization.Codec;
import java.util.Optional;

public class dzf extends dxm {
   public static final Codec<dzf> d = a(dzf::new);

   public dzf(dxm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      return a($$0, dmw.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dye $$0, dxm.a $$1) {
      hx $$2 = new hx($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dze.a($$2));
   }

   @Override
   public dxv<?> e() {
      return dxv.a;
   }
}
