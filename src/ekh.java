import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekh extends eik {
   public static final MapCodec<ekh> d = a(ekh::new);

   public ekh(eik.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      dlm $$1 = dlm.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eik.b($$2, (Consumer<ejc>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ejc $$0, iz $$1, dlm $$2, eik.a $$3) {
      List<eio> $$4 = Lists.newArrayList();
      ekg.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eit<?> e() {
      return eit.c;
   }
}
