import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eki extends eil {
   public static final MapCodec<eki> d = a(eki::new);

   public eki(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      dln $$1 = dln.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eil.b($$2, (Consumer<ejd>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ejd $$0, iz $$1, dln $$2, eil.a $$3) {
      List<eip> $$4 = Lists.newArrayList();
      ekh.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eiu<?> e() {
      return eiu.c;
   }
}
