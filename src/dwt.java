import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dwt extends dvd {
   public static final Codec<dwt> d = a(dwt::new);

   public dwt(dvd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      czc $$1 = czc.a($$0.f());
      gw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dvd.b($$2, (Consumer<dvv>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dvv $$0, gw $$1, czc $$2, dvd.a $$3) {
      List<dvh> $$4 = Lists.newArrayList();
      dws.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dvm<?> e() {
      return dvm.c;
   }
}
