import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqx extends eoc {
   public static final MapCodec<eqx> d = a(eqx::new);

   public eqx(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      return a($$0, edi.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eou $$0, eoc.a $$1) {
      $$0.a(new eqw($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eol<?> e() {
      return eol.o;
   }
}
