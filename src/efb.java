import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class efb extends ede {
   public static final Codec<efb> d = a(efb::new);

   public efb(ede.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      dgo $$1 = dgo.a($$0.f());
      ib $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ede.b($$2, (Consumer<edw>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(edw $$0, ib $$1, dgo $$2, ede.a $$3) {
      List<edi> $$4 = Lists.newArrayList();
      efa.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public edn<?> e() {
      return edn.c;
   }
}
