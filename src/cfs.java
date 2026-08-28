import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cfs extends cfp<bvf> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.i);
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      $$1.ec().a(cej.i, this.a($$1));
   }

   private List<bvf> a(bvf $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bvf $$0) {
      return $$0.aq() == buq.bC && $$0.e_();
   }

   private cel c(bvf $$0) {
      return $$0.ec().c(cej.h).orElse(cel.a());
   }
}
