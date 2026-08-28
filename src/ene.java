import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ene extends elg {
   public static final MapCodec<ene> d = a(ene::new);

   public ene(elg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      doa $$1 = doa.a($$0.f());
      jf $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elg.b($$2, (Consumer<ely>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ely $$0, jf $$1, doa $$2, elg.a $$3) {
      List<elk> $$4 = Lists.newArrayList();
      end.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public elp<?> e() {
      return elp.c;
   }
}
