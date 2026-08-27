import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dzj extends dxm {
   public static final Codec<dzj> d = a(dzj::new);

   public dzj(dxm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxm.b> a(dxm.a $$0) {
      dbr $$1 = dbr.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dxm.b($$2, (Consumer<dye>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dye $$0, hx $$1, dbr $$2, dxm.a $$3) {
      List<dxq> $$4 = Lists.newArrayList();
      dzi.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dxv<?> e() {
      return dxv.c;
   }
}
