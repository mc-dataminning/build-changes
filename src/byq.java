import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class byq extends byn<bog> {
   @Override
   public Set<bxh<?>> a() {
      return ImmutableSet.of(bxh.i);
   }

   @Override
   protected void a(aov $$0, bog $$1) {
      $$1.dO().a(bxh.i, this.a($$1));
   }

   private List<bog> a(bog $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bog $$0) {
      return $$0.ai() == bnu.bh && $$0.o_();
   }

   private bxj c(bog $$0) {
      return $$0.dO().c(bxh.h).orElse(bxj.a());
   }
}
