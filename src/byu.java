import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class byu extends byr<boi> {
   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.i);
   }

   @Override
   protected void a(aow $$0, boi $$1) {
      $$1.dO().a(bxl.i, this.a($$1));
   }

   private List<boi> a(boi $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(boi $$0) {
      return $$0.ai() == bnw.bh && $$0.o_();
   }

   private bxn c(boi $$0) {
      return $$0.dO().c(bxl.h).orElse(bxn.a());
   }
}
