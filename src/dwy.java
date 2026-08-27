import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dwy extends dvi {
   public static final Codec<dwy> d = a(dwy::new);

   public dwy(dvi.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvi.b> a(dvi.a $$0) {
      czh $$1 = czh.a($$0.f());
      gw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dvi.b($$2, (Consumer<dwa>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dwa $$0, gw $$1, czh $$2, dvi.a $$3) {
      List<dvm> $$4 = Lists.newArrayList();
      dwx.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dvr<?> e() {
      return dvr.c;
   }
}
