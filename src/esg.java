import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class esg extends eqi {
   public static final MapCodec<esg> d = a(esg::new);

   public esg(eqi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eqi.b> a(eqi.a $$0) {
      dsm $$1 = dsm.a($$0.f());
      iu $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eqi.b($$2, (Consumer<era>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(era $$0, iu $$1, dsm $$2, eqi.a $$3) {
      List<eqm> $$4 = Lists.newArrayList();
      esf.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eqr<?> e() {
      return eqr.c;
   }
}
