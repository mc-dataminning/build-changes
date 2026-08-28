import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elp extends ejr {
   public static final MapCodec<elp> d = a(elp::new);

   public elp(ejr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejr.b> a(ejr.a $$0) {
      dmm $$1 = dmm.a($$0.f());
      jd $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ejr.b($$2, (Consumer<ekj>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(ekj $$0, jd $$1, dmm $$2, ejr.a $$3) {
      List<ejv> $$4 = Lists.newArrayList();
      elo.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public eka<?> e() {
      return eka.c;
   }
}
