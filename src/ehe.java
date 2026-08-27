import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ehe extends efh {
   public static final Codec<ehe> d = a(ehe::new);

   public ehe(efh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efh.b> a(efh.a $$0) {
      dik $$1 = dik.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new efh.b($$2, (Consumer<efz>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(efz $$0, ib $$1, dik $$2, efh.a $$3) {
      List<efl> $$4 = Lists.newArrayList();
      ehd.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public efq<?> e() {
      return efq.c;
   }
}
