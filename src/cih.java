import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cih extends cie<bxw> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.i);
   }

   @Override
   protected void a(aru $$0, bxw $$1) {
      $$1.ec().a(cgy.i, this.a($$1));
   }

   private List<bxw> a(bxw $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bxw $$0) {
      return $$0.an() == bxe.bE && $$0.n_();
   }

   private cha c(bxw $$0) {
      return $$0.ec().c(cgy.h).orElse(cha.a());
   }
}
