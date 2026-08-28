import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class etl extends ern {
   public static final MapCodec<etl> d = a(etl::new);

   public etl(ern.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      dtl $$1 = dtl.a($$0.f());
      iv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ern.b($$2, (Consumer<esf>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(esf $$0, iv $$1, dtl $$2, ern.a $$3) {
      List<err> $$4 = Lists.newArrayList();
      etk.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public erw<?> e() {
      return erw.c;
   }
}
