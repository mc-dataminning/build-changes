import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cdz extends cdw<btl> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.i);
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      $$1.dU().a(ccq.i, this.a($$1));
   }

   private List<btl> a(btl $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btl $$0) {
      return $$0.am() == bsw.bj && $$0.o_();
   }

   private ccs c(btl $$0) {
      return $$0.dU().c(ccq.h).orElse(ccs.a());
   }
}
