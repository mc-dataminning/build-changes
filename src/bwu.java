import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class bwu extends bwr<bmk> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.i);
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      $$1.dO().a(bvm.i, this.a($$1));
   }

   private List<bmk> a(bmk $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bmk $$0) {
      return $$0.ai() == bly.bg && $$0.o_();
   }

   private bvo c(bmk $$0) {
      return $$0.dO().c(bvm.h).orElse(bvo.a());
   }
}
