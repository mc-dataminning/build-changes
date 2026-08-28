import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class enr extends elr {
   public static final MapCodec<enr> d = a(enr::new);

   public enr(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      return a($$0, eaz.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(emj $$0, elr.a $$1) {
      deb $$2 = $$1.h();
      eby $$3 = $$1.f();
      jg $$4 = new jg($$2.d(), 90, $$2.e());
      dol $$5 = dol.a($$3);
      enq.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public ema<?> e() {
      return ema.e;
   }
}
