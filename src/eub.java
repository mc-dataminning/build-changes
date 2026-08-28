import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eub extends esd {
   public static final MapCodec<eub> d = a(eub::new);

   public eub(esd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      dty $$1 = dty.a($$0.f());
      iw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new esd.b($$2, (Consumer<esv>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(esv $$0, iw $$1, dty $$2, esd.a $$3) {
      List<esh> $$4 = Lists.newArrayList();
      eua.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public esm<?> e() {
      return esm.c;
   }
}
