import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class emm extends eko {
   public static final MapCodec<emm> d = a(emm::new);

   public emm(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      dnj $$1 = dnj.a($$0.f());
      je $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eko.b($$2, (Consumer<elg>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(elg $$0, je $$1, dnj $$2, eko.a $$3) {
      List<eks> $$4 = Lists.newArrayList();
      eml.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ekx<?> e() {
      return ekx.c;
   }
}
