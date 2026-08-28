import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enp extends elr {
   public static final MapCodec<enp> d = a(enp::new);

   public enp(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      dol $$1 = dol.a($$0.f());
      jg $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elr.b($$2, (Consumer<emj>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(emj $$0, jg $$1, dol $$2, elr.a $$3) {
      List<elv> $$4 = Lists.newArrayList();
      eno.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ema<?> e() {
      return ema.c;
   }
}
