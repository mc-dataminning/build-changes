import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eez extends edc {
   public static final Codec<eez> d = a(eez::new);

   public eez(edc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<edc.b> a(edc.a $$0) {
      dgm $$1 = dgm.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new edc.b($$2, (Consumer<edu>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(edu $$0, ib $$1, dgm $$2, edc.a $$3) {
      List<edg> $$4 = Lists.newArrayList();
      eey.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public edl<?> e() {
      return edl.c;
   }
}
