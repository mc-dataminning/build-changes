import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekt extends eiw {
   public static final MapCodec<ekt> d = a(ekt::new);

   public ekt(eiw.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiw.b> a(eiw.a $$0) {
      dlu $$1 = dlu.a($$0.f());
      ja $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eiw.b($$2, (Consumer<ejo>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ejo $$0, ja $$1, dlu $$2, eiw.a $$3) {
      List<eja> $$4 = Lists.newArrayList();
      eks.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ejf<?> e() {
      return ejf.c;
   }
}
