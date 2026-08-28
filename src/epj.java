import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epj extends enl {
   public static final MapCodec<epj> d = a(epj::new);

   public epj(enl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enl.b> a(enl.a $$0) {
      dqd $$1 = dqd.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new enl.b($$2, (Consumer<eod>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eod $$0, ji $$1, dqd $$2, enl.a $$3) {
      List<enp> $$4 = Lists.newArrayList();
      epi.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public enu<?> e() {
      return enu.c;
   }
}
