import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqe extends eok {
   public static final MapCodec<eqe> d = a(eqe::new);

   public eqe(eok.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      return a($$0, edq.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(epc $$0, eok.a $$1) {
      jh $$2 = new jh($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eqd.a($$2));
   }

   @Override
   public eot<?> e() {
      return eot.a;
   }
}
