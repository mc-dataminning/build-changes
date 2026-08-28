import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqf extends enk {
   public static final MapCodec<eqf> d = a(eqf::new);

   public eqf(enk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      return a($$0, ecq.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eoc $$0, enk.a $$1) {
      $$0.a(new eqe($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ent<?> e() {
      return ent.o;
   }
}
