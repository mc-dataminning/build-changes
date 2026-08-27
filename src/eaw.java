import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eaw extends dyz {
   public static final Codec<eaw> d = a(eaw::new);

   public eaw(dyz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      dcv $$1 = dcv.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dyz.b($$2, (Consumer<dzr>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dzr $$0, hx $$1, dcv $$2, dyz.a $$3) {
      List<dzd> $$4 = Lists.newArrayList();
      eav.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dzi<?> e() {
      return dzi.c;
   }
}
