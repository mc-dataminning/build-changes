import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class btf extends btc<biw> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.i);
   }

   @Override
   protected void a(aki $$0, biw $$1) {
      $$1.dM().a(bry.i, this.a($$1));
   }

   private List<biw> a(biw $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(biw $$0) {
      return $$0.ag() == bik.bf && $$0.i_();
   }

   private bsa c(biw $$0) {
      return $$0.dM().c(bry.h).orElse(bsa.a());
   }
}
