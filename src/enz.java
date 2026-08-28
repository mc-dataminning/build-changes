import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class enz extends emb {
   public static final MapCodec<enz> d = a(enz::new);

   public enz(emb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emb.b> a(emb.a $$0) {
      dow $$1 = dow.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new emb.b($$2, (Consumer<emt>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(emt $$0, jh $$1, dow $$2, emb.a $$3) {
      List<emf> $$4 = Lists.newArrayList();
      eny.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public emk<?> e() {
      return emk.c;
   }
}
