import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dws extends dvc {
   public static final Codec<dws> d = a(dws::new);

   public dws(dvc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      czn $$1 = czn.a($$0.f());
      gw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dvc.b($$2, (Consumer<dvu>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dvu $$0, gw $$1, czn $$2, dvc.a $$3) {
      List<dvg> $$4 = Lists.newArrayList();
      dwr.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dvl<?> e() {
      return dvl.c;
   }
}
