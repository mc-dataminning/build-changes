import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ebl extends dzo {
   public static final Codec<ebl> d = a(ebl::new);

   public ebl(dzo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      ddk $$1 = ddk.a($$0.f());
      hx $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dzo.b($$2, (Consumer<eag>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eag $$0, hx $$1, ddk $$2, dzo.a $$3) {
      List<dzs> $$4 = Lists.newArrayList();
      ebk.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dzx<?> e() {
      return dzx.c;
   }
}
