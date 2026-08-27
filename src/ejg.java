import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ejg extends ehj {
   public static final MapCodec<ejg> d = a(ejg::new);

   public ejg(ehj.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ehj.b> a(ehj.a $$0) {
      dkl $$1 = dkl.a($$0.f());
      io $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ehj.b($$2, (Consumer<eib>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eib $$0, io $$1, dkl $$2, ehj.a $$3) {
      List<ehn> $$4 = Lists.newArrayList();
      ejf.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ehs<?> e() {
      return ehs.c;
   }
}
