import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class enr extends elx {
   public static final MapCodec<enr> d = a(enr::new);

   public enr(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      return a($$0, ebf.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(emp $$0, elx.a $$1) {
      jh $$2 = new jh($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new enq.a($$2));
   }

   @Override
   public emg<?> e() {
      return emg.a;
   }
}
