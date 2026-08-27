import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ehn extends efq {
   public static final Codec<ehn> d = a(ehn::new);

   public ehn(efq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      dit $$1 = dit.a($$0.f());
      id $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new efq.b($$2, (Consumer<egi>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(egi $$0, id $$1, dit $$2, efq.a $$3) {
      List<efu> $$4 = Lists.newArrayList();
      ehm.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public efz<?> e() {
      return efz.c;
   }
}
