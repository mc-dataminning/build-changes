import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekf extends ehl {
   public static final MapCodec<ekf> d = a(ekf::new);

   public ekf(ehl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehl.b> a(ehl.a $$0) {
      return a($$0, dwv.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eid $$0, ehl.a $$1) {
      $$0.a(new eke($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ehu<?> e() {
      return ehu.o;
   }
}
