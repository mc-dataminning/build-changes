import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dwp extends duz {
   public static final Codec<dwp> d = a(dwp::new);

   public dwp(duz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      cyy $$1 = cyy.a($$0.f());
      gu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new duz.b($$2, (Consumer<dvr>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dvr $$0, gu $$1, cyy $$2, duz.a $$3) {
      List<dvd> $$4 = Lists.newArrayList();
      dwo.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dvi<?> e() {
      return dvi.c;
   }
}
