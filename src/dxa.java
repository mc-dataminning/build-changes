import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dxa extends dvk {
   public static final Codec<dxa> d = a(dxa::new);

   public dxa(dvk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      czj $$1 = czj.a($$0.f());
      gw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dvk.b($$2, (Consumer<dwc>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dwc $$0, gw $$1, czj $$2, dvk.a $$3) {
      List<dvo> $$4 = Lists.newArrayList();
      dwz.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dvt<?> e() {
      return dvt.c;
   }
}
