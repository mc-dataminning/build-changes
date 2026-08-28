import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class enx extends elx {
   public static final MapCodec<enx> d = a(enx::new);

   public enx(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      return a($$0, ebf.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(emp $$0, elx.a $$1) {
      deh $$2 = $$1.h();
      ece $$3 = $$1.f();
      jh $$4 = new jh($$2.d(), 90, $$2.e());
      dor $$5 = dor.a($$3);
      enw.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public emg<?> e() {
      return emg.e;
   }
}
