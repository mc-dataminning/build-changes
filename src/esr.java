import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class esr extends eqt {
   public static final MapCodec<esr> d = a(esr::new);

   public esr(eqt.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqt.b> a(eqt.a $$0) {
      dst $$1 = dst.a($$0.f());
      iu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eqt.b($$2, (Consumer<erl>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(erl $$0, iu $$1, dst $$2, eqt.a $$3) {
      List<eqx> $$4 = Lists.newArrayList();
      esq.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public erc<?> e() {
      return erc.c;
   }
}
