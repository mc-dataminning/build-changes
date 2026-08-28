import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class eqa extends eoc {
   public static final MapCodec<eqa> d = a(eqa::new);

   public eqa(eoc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eoc.b> a(eoc.a $$0) {
      dqu $$1 = dqu.a($$0.f());
      jh $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new eoc.b($$2, (Consumer<eou>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eou $$0, jh $$1, dqu $$2, eoc.a $$3) {
      List<eog> $$4 = Lists.newArrayList();
      epz.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eol<?> e() {
      return eol.c;
   }
}
