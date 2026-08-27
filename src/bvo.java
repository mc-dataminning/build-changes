import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bvo extends bvl<blg> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.i);
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      $$1.dP().a(buh.i, this.a($$1));
   }

   private List<blg> a(blg $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(blg $$0) {
      return $$0.ai() == bku.bf && $$0.n_();
   }

   private buj c(blg $$0) {
      return $$0.dP().c(buh.h).orElse(buj.a());
   }
}
