import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqi extends eok {
   public static final MapCodec<eqi> d = a(eqi::new);

   public eqi(eok.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eok.b> a(eok.a $$0) {
      drc $$1 = drc.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eok.b($$2, (Consumer<epc>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(epc $$0, jh $$1, drc $$2, eok.a $$3) {
      List<eoo> $$4 = Lists.newArrayList();
      eqh.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eot<?> e() {
      return eot.c;
   }
}
