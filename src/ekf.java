import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekf extends eim {
   public static final MapCodec<ekf> d = a(ekf::new);

   public ekf(eim.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      return a($$0, dxw.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eje $$0, eim.a $$1) {
      iz $$2 = new iz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eke.a($$2));
   }

   @Override
   public eiv<?> e() {
      return eiv.a;
   }
}
