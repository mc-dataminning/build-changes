import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebc extends dzf {
   public static final Codec<ebc> d = a(ebc::new);

   public ebc(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      ddb $$1 = ddb.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dzf.b($$2, (Consumer<dzx>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dzx $$0, hx $$1, ddb $$2, dzf.a $$3) {
      List<dzj> $$4 = Lists.newArrayList();
      ebb.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dzo<?> e() {
      return dzo.c;
   }
}
