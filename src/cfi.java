import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cfi extends cff<buv> {
   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.i);
   }

   @Override
   protected void a(arm $$0, buv $$1) {
      $$1.ed().a(cdz.i, this.a($$1));
   }

   private List<buv> a(buv $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(buv $$0) {
      return $$0.aq() == bug.bj && $$0.p_();
   }

   private ceb c(buv $$0) {
      return $$0.ed().c(cdz.h).orElse(ceb.a());
   }
}
