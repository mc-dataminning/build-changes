import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cdb extends ccy<bso> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.i);
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      $$1.dS().a(cbs.i, this.a($$1));
   }

   private List<bso> a(bso $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bso $$0) {
      return $$0.ak() == bsa.bj && $$0.p_();
   }

   private cbu c(bso $$0) {
      return $$0.dS().c(cbs.h).orElse(cbu.a());
   }
}
