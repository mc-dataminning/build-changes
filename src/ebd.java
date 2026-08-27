import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebd extends dzg {
   public static final Codec<ebd> d = a(ebd::new);

   public ebd(dzg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      ddc $$1 = ddc.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dzg.b($$2, (Consumer<dzy>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dzy $$0, hx $$1, ddc $$2, dzg.a $$3) {
      List<dzk> $$4 = Lists.newArrayList();
      ebc.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dzp<?> e() {
      return dzp.c;
   }
}
