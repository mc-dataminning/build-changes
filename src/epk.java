import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epk extends enm {
   public static final MapCodec<epk> d = a(epk::new);

   public epk(enm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enm.b> a(enm.a $$0) {
      dqe $$1 = dqe.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new enm.b($$2, (Consumer<eoe>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eoe $$0, ji $$1, dqe $$2, enm.a $$3) {
      List<enq> $$4 = Lists.newArrayList();
      epj.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public env<?> e() {
      return env.c;
   }
}
