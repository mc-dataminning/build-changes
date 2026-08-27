import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class dwn extends dux {
   public static final Codec<dwn> d = a(dwn::new);

   public dwn(dux.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      cyw $$1 = cyw.a($$0.f());
      gv $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new dux.b($$2, (Consumer<dvp>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(dvp $$0, gv $$1, cyw $$2, dux.a $$3) {
      List<dvb> $$4 = Lists.newArrayList();
      dwm.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public dvg<?> e() {
      return dvg.c;
   }
}
