import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekj extends eim {
   public static final MapCodec<ekj> d = a(ekj::new);

   public ekj(eim.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eim.b> a(eim.a $$0) {
      dlo $$1 = dlo.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eim.b($$2, (Consumer<eje>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eje $$0, iz $$1, dlo $$2, eim.a $$3) {
      List<eiq> $$4 = Lists.newArrayList();
      eki.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eiv<?> e() {
      return eiv.c;
   }
}
