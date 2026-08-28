import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class ceb extends cdy<bto> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.i);
   }

   @Override
   protected void a(are $$0, bto $$1) {
      $$1.dS().a(ccs.i, this.a($$1));
   }

   private List<bto> a(bto $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bto $$0) {
      return $$0.ak() == bsz.bj && $$0.p_();
   }

   private ccu c(bto $$0) {
      return $$0.dS().c(ccs.h).orElse(ccu.a());
   }
}
