import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eed extends ecg {
   public static final Codec<eed> d = a(eed::new);

   public eed(ecg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ecg.b> a(ecg.a $$0) {
      dfr $$1 = dfr.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ecg.b($$2, (Consumer<ecy>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ecy $$0, ib $$1, dfr $$2, ecg.a $$3) {
      List<eck> $$4 = Lists.newArrayList();
      eec.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ecp<?> e() {
      return ecp.c;
   }
}
