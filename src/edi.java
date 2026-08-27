import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class edi extends ebl {
   public static final Codec<edi> d = a(edi::new);

   public edi(ebl.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebl.b> a(ebl.a $$0) {
      dfe $$1 = dfe.a($$0.f());
      hz $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ebl.b($$2, (Consumer<ecd>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ecd $$0, hz $$1, dfe $$2, ebl.a $$3) {
      List<ebp> $$4 = Lists.newArrayList();
      edh.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ebu<?> e() {
      return ebu.c;
   }
}
