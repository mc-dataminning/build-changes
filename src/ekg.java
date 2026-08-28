import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ekg extends eij {
   public static final MapCodec<ekg> d = a(ekg::new);

   public ekg(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      dll $$1 = dll.a($$0.f());
      iz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eij.b($$2, (Consumer<ejb>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ejb $$0, iz $$1, dll $$2, eij.a $$3) {
      List<ein> $$4 = Lists.newArrayList();
      ekf.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eis<?> e() {
      return eis.c;
   }
}
