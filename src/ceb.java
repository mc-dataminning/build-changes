import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class ceb extends cdy<btn> {
   @Override
   public Set<ccs<?>> a() {
      return ImmutableSet.of(ccs.i);
   }

   @Override
   protected void a(aqu $$0, btn $$1) {
      $$1.dU().a(ccs.i, this.a($$1));
   }

   private List<btn> a(btn $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(btn $$0) {
      return $$0.am() == bsx.bj && $$0.o_();
   }

   private ccu c(btn $$0) {
      return $$0.dU().c(ccs.h).orElse(ccu.a());
   }
}
