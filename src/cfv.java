import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cfv extends cfs<bvi> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.i);
   }

   @Override
   protected void a(ard $$0, bvi $$1) {
      $$1.eb().a(cem.i, this.a($$1));
   }

   private List<bvi> a(bvi $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bvi $$0) {
      return $$0.aq() == but.bC && $$0.e_();
   }

   private ceo c(bvi $$0) {
      return $$0.eb().c(cem.h).orElse(ceo.a());
   }
}
