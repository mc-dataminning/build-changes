import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eog extends emi {
   public static final MapCodec<eog> d = a(eog::new);

   public eog(emi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<emi.b> a(emi.a $$0) {
      dpd $$1 = dpd.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new emi.b($$2, (Consumer<ena>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ena $$0, jh $$1, dpd $$2, emi.a $$3) {
      List<emm> $$4 = Lists.newArrayList();
      eof.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public emr<?> e() {
      return emr.c;
   }
}
