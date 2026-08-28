import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class esc extends eqi {
   public static final MapCodec<esc> d = a(esc::new);

   public esc(eqi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      return a($$0, efn.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(era $$0, eqi.a $$1) {
      iu $$2 = new iu($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new esb.a($$2));
   }

   @Override
   public eqr<?> e() {
      return eqr.a;
   }
}
