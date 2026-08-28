import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ena extends elc {
   public static final MapCodec<ena> d = a(ena::new);

   public ena(elc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      dnx $$1 = dnx.a($$0.f());
      je $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elc.b($$2, (Consumer<elu>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(elu $$0, je $$1, dnx $$2, elc.a $$3) {
      List<elg> $$4 = Lists.newArrayList();
      emz.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ell<?> e() {
      return ell.c;
   }
}
