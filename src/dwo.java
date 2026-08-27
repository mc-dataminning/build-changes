import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dwo extends duy {
   public static final Codec<dwo> d = a(dwo::new);

   public dwo(duy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      cyx $$1 = cyx.a($$0.f());
      gu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new duy.b($$2, (Consumer<dvq>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dvq $$0, gu $$1, cyx $$2, duy.a $$3) {
      List<dvc> $$4 = Lists.newArrayList();
      dwn.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dvh<?> e() {
      return dvh.c;
   }
}
