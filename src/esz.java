import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class esz extends erb {
   public static final MapCodec<esz> d = a(esz::new);

   public esz(erb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      dsz $$1 = dsz.a($$0.f());
      iu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new erb.b($$2, (Consumer<ert>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ert $$0, iu $$1, dsz $$2, erb.a $$3) {
      List<erf> $$4 = Lists.newArrayList();
      esy.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public erk<?> e() {
      return erk.c;
   }
}
