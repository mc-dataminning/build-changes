import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eqj extends eoj {
   public static final MapCodec<eqj> d = a(eqj::new);

   public eqj(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      return a($$0, edo.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(epb $$0, eoj.a $$1) {
      dgg $$2 = $$1.h();
      een $$3 = $$1.f();
      ji $$4 = new ji($$2.d(), 90, $$2.e());
      dqw $$5 = dqw.a($$3);
      eqi.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public eos<?> e() {
      return eos.e;
   }
}
