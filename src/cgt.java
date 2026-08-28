import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cgt extends cgq<bwg> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.i);
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      $$1.ec().a(cfk.i, this.a($$1));
   }

   private List<bwg> a(bwg $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bwg $$0) {
      return $$0.aq() == bvr.bD && $$0.e_();
   }

   private cfm c(bwg $$0) {
      return $$0.ec().c(cfk.h).orElse(cfm.a());
   }
}
