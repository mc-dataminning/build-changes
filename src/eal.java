import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eal extends dyo {
   public static final Codec<eal> d = a(eal::new);

   public eal(dyo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      dcl $$1 = dcl.a($$0.f());
      hv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dyo.b($$2, (Consumer<dzg>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dzg $$0, hv $$1, dcl $$2, dyo.a $$3) {
      List<dys> $$4 = Lists.newArrayList();
      eak.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dyx<?> e() {
      return dyx.c;
   }
}
