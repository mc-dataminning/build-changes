import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class est extends eqt {
   public static final MapCodec<est> d = a(est::new);

   public est(eqt.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      return a($$0, efy.a.a, $$1 -> this.a($$1, $$0));
   }

   private void a(erl $$0, eqt.a $$1) {
      dic $$2 = $$1.h();
      egx $$3 = $$1.f();
      iu $$4 = new iu($$2.d(), 90, $$2.e());
      dst $$5 = dst.a($$3);
      ess.a($$1.e(), $$4, $$5, $$0, $$3);
   }

   @Override
   public erc<?> e() {
      return erc.e;
   }
}
