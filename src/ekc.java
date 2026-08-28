import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekc extends eif {
   public static final MapCodec<ekc> d = a(ekc::new);

   public ekc(eif.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      dlh $$1 = dlh.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eif.b($$2, (Consumer<eix>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eix $$0, iz $$1, dlh $$2, eif.a $$3) {
      List<eij> $$4 = Lists.newArrayList();
      ekb.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eio<?> e() {
      return eio.c;
   }
}
