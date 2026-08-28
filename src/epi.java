import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epi extends enk {
   public static final MapCodec<epi> d = a(epi::new);

   public epi(enk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enk.b> a(enk.a $$0) {
      dqc $$1 = dqc.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new enk.b($$2, (Consumer<eoc>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eoc $$0, ji $$1, dqc $$2, enk.a $$3) {
      List<eno> $$4 = Lists.newArrayList();
      eph.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ent<?> e() {
      return ent.c;
   }
}
