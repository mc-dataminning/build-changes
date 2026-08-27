import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cbq extends cbn<bre> {
   @Override
   public Set<cah<?>> a() {
      return ImmutableSet.of(cah.i);
   }

   @Override
   protected void a(aqe $$0, bre $$1) {
      $$1.dQ().a(cah.i, this.a($$1));
   }

   private List<bre> a(bre $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bre $$0) {
      return $$0.ai() == bqr.bi && $$0.p_();
   }

   private caj c(bre $$0) {
      return $$0.dQ().c(cah.h).orElse(caj.a());
   }
}
