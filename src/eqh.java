import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqh extends eoj {
   public static final MapCodec<eqh> d = a(eqh::new);

   public eqh(eoj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoj.b> a(eoj.a $$0) {
      drb $$1 = drb.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eoj.b($$2, (Consumer<epb>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(epb $$0, jh $$1, drb $$2, eoj.a $$3) {
      List<eon> $$4 = Lists.newArrayList();
      eqg.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eos<?> e() {
      return eos.c;
   }
}
