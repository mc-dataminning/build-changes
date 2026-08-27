import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elq extends ejt {
   public static final Codec<elq> d = a(elq::new);

   public elq(ejt.d $$0) {
      super($$0);
   }

   @Override
   public Optional<ejt.c> a(ejt.b $$0) {
      dmd $$1 = dmd.a($$0.f());
      ir $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ejt.c($$2, (Consumer<ekl>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ekl $$0, ir $$1, dmd $$2, ejt.b $$3) {
      List<ejx> $$4 = Lists.newArrayList();
      elp.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ekc<?> f() {
      return ekc.c;
   }
}
