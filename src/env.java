import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class env extends elx {
   public static final MapCodec<env> d = a(env::new);

   public env(elx.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elx.b> a(elx.a $$0) {
      dor $$1 = dor.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new elx.b($$2, (Consumer<emp>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(emp $$0, jh $$1, dor $$2, elx.a $$3) {
      List<emb> $$4 = Lists.newArrayList();
      enu.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public emg<?> e() {
      return emg.c;
   }
}
