import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class emh extends ejm {
   public static final MapCodec<emh> d = a(emh::new);

   public emh(ejm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      return a($$0, dyv.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eke $$0, ejm.a $$1) {
      $$0.a(new emg($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ejv<?> e() {
      return ejv.o;
   }
}
