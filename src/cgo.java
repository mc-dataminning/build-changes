import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cgo extends cgl<bwb> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.i);
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      $$1.eb().a(cff.i, this.a($$1));
   }

   private List<bwb> a(bwb $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bwb $$0) {
      return $$0.aq() == bvm.bD && $$0.e_();
   }

   private cfh c(bwb $$0) {
      return $$0.eb().c(cff.h).orElse(cfh.a());
   }
}
