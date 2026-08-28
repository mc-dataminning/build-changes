import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekf extends eii {
   public static final MapCodec<ekf> d = a(ekf::new);

   public ekf(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      dlk $$1 = dlk.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eii.b($$2, (Consumer<eja>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eja $$0, iz $$1, dlk $$2, eii.a $$3) {
      List<eim> $$4 = Lists.newArrayList();
      eke.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eir<?> e() {
      return eir.c;
   }
}
