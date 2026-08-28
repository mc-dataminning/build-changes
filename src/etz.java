import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class etz extends esb {
   public static final MapCodec<etz> d = a(etz::new);

   public etz(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      dtw $$1 = dtw.a($$0.f());
      iv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new esb.b($$2, (Consumer<est>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(est $$0, iv $$1, dtw $$2, esb.a $$3) {
      List<esf> $$4 = Lists.newArrayList();
      ety.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public esk<?> e() {
      return esk.c;
   }
}
