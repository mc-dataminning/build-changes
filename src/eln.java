import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eln extends ejp {
   public static final MapCodec<eln> d = a(eln::new);

   public eln(ejp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      dmm $$1 = dmm.a($$0.f());
      jd $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ejp.b($$2, (Consumer<ekh>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ekh $$0, jd $$1, dmm $$2, ejp.a $$3) {
      List<ejt> $$4 = Lists.newArrayList();
      elm.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ejy<?> e() {
      return ejy.c;
   }
}
