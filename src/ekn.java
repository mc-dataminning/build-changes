import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekn extends eiq {
   public static final MapCodec<ekn> d = a(ekn::new);

   public ekn(eiq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      dls $$1 = dls.a($$0.f());
      ja $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eiq.b($$2, (Consumer<eji>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eji $$0, ja $$1, dls $$2, eiq.a $$3) {
      List<eiu> $$4 = Lists.newArrayList();
      ekm.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eiz<?> e() {
      return eiz.c;
   }
}
