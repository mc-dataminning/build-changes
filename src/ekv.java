import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekv extends eix {
   public static final MapCodec<ekv> d = a(ekv::new);

   public ekv(eix.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eix.b> a(eix.a $$0) {
      dlv $$1 = dlv.a($$0.f());
      ja $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eix.b($$2, (Consumer<ejp>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ejp $$0, ja $$1, dlv $$2, eix.a $$3) {
      List<ejb> $$4 = Lists.newArrayList();
      eku.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ejg<?> e() {
      return ejg.c;
   }
}
