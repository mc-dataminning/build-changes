import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eoc extends emi {
   public static final MapCodec<eoc> d = a(eoc::new);

   public eoc(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      return a($$0, ebq.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ena $$0, emi.a $$1) {
      jh $$2 = new jh($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eob.a($$2));
   }

   @Override
   public emr<?> e() {
      return emr.a;
   }
}
