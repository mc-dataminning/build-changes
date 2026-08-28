import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eul extends esn {
   public static final MapCodec<eul> d = a(eul::new);

   public eul(esn.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esn.b> a(esn.a $$0) {
      dui $$1 = dui.a($$0.f());
      iw $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new esn.b($$2, (Consumer<etf>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(etf $$0, iw $$1, dui $$2, esn.a $$3) {
      List<esr> $$4 = Lists.newArrayList();
      euk.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public esw<?> e() {
      return esw.c;
   }
}
