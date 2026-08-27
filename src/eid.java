import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eid extends egg {
   public static final Codec<eid> d = a(eid::new);

   public eid(egg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      dji $$1 = dji.a($$0.f());
      im $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new egg.b($$2, (Consumer<egy>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(egy $$0, im $$1, dji $$2, egg.a $$3) {
      List<egk> $$4 = Lists.newArrayList();
      eic.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public egp<?> e() {
      return egp.c;
   }
}
