import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cgs extends cgp<bwf> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.i);
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      $$1.ec().a(cfj.i, this.a($$1));
   }

   private List<bwf> a(bwf $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bwf $$0) {
      return $$0.aq() == bvq.bD && $$0.e_();
   }

   private cfl c(bwf $$0) {
      return $$0.ec().c(cfj.h).orElse(cfl.a());
   }
}
