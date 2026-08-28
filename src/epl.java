import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class epl extends enn {
   public static final MapCodec<epl> d = a(epl::new);

   public epl(enn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<enn.b> a(enn.a $$0) {
      dqf $$1 = dqf.a($$0.f());
      ji $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new enn.b($$2, (Consumer<eof>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eof $$0, ji $$1, dqf $$2, enn.a $$3) {
      List<enr> $$4 = Lists.newArrayList();
      epk.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public enw<?> e() {
      return enw.c;
   }
}
