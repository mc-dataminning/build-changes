import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqd extends eoj {
   public static final MapCodec<eqd> d = a(eqd::new);

   public eqd(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      return a($$0, edo.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(epb $$0, eoj.a $$1) {
      ji $$2 = new ji($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eqc.a($$2));
   }

   @Override
   public eos<?> e() {
      return eos.a;
   }
}
