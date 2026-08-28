import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class elk extends ejm {
   public static final MapCodec<elk> d = a(elk::new);

   public elk(ejm.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejm.b> a(ejm.a $$0) {
      dmk $$1 = dmk.a($$0.f());
      jd $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new ejm.b($$2, (Consumer<eke>)($$3 -> this.a($$3, $$2, $$1, $$0))));
   }

   private void a(eke $$0, jd $$1, dmk $$2, ejm.a $$3) {
      List<ejq> $$4 = Lists.newArrayList();
      elj.a($$3.e(), $$1, $$2, $$4, $$3.f());
      $$4.forEach($$0::a);
   }

   @Override
   public ejv<?> e() {
      return ejv.c;
   }
}
