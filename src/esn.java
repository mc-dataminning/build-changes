import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class esn extends eqt {
   public static final MapCodec<esn> d = a(esn::new);

   public esn(eqt.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      return a($$0, efy.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(erl $$0, eqt.a $$1) {
      iu $$2 = new iu($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new esm.a($$2));
   }

   @Override
   public erc<?> e() {
      return erc.a;
   }
}
