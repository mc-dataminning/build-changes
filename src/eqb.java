import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqb extends eod {
   public static final MapCodec<eqb> d = a(eqb::new);

   public eqb(eod.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eod.b> a(eod.a $$0) {
      dqv $$1 = dqv.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eod.b($$2, (Consumer<eov>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eov $$0, jh $$1, dqv $$2, eod.a $$3) {
      List<eoh> $$4 = Lists.newArrayList();
      eqa.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eom<?> e() {
      return eom.c;
   }
}
