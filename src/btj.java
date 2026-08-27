import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class btj extends btg<bjb> {
   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.i);
   }

   @Override
   protected void a(akn $$0, bjb $$1) {
      $$1.dM().a(bsc.i, this.a($$1));
   }

   private List<bjb> a(bjb $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bjb $$0) {
      return $$0.ag() == bip.bf && $$0.i_();
   }

   private bse c(bjb $$0) {
      return $$0.dM().c(bsc.h).orElse(bse.a());
   }
}
