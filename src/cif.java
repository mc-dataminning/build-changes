import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cif extends cic<bxu> {
   @Override
   public Set<cgw<?>> a() {
      return ImmutableSet.of(cgw.i);
   }

   @Override
   protected void a(ars $$0, bxu $$1) {
      $$1.ec().a(cgw.i, this.a($$1));
   }

   private List<bxu> a(bxu $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bxu $$0) {
      return $$0.an() == bxc.bE && $$0.n_();
   }

   private cgy c(bxu $$0) {
      return $$0.ec().c(cgw.h).orElse(cgy.a());
   }
}
