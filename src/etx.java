import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class etx extends esd {
   public static final MapCodec<etx> d = a(etx::new);

   public etx(esd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      return a($$0, ehf.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(esv $$0, esd.a $$1) {
      iw $$2 = new iw($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new etw.a($$2));
   }

   @Override
   public esm<?> e() {
      return esm.a;
   }
}
