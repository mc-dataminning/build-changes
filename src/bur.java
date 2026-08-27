import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bur extends buo<bkj> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.i);
   }

   @Override
   protected void a(alq $$0, bkj $$1) {
      $$1.dN().a(btk.i, this.a($$1));
   }

   private List<bkj> a(bkj $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bkj $$0) {
      return $$0.ag() == bjx.bf && $$0.n_();
   }

   private btm c(bkj $$0) {
      return $$0.dN().c(btk.h).orElse(btm.a());
   }
}
