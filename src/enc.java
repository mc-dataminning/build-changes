import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class enc extends elc {
   public static final MapCodec<enc> d = a(enc::new);

   public enc(elc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      return a($$0, eak.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(elu $$0, elc.a $$1) {
      ddm $$2 = $$1.h();
      ebj $$3 = $$1.f();
      je $$4 = new je($$2.d(), 90, $$2.e());
      dnx $$5 = dnx.a($$3);
      enb.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ell<?> e() {
      return ell.e;
   }
}
