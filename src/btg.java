import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class btg extends btd<biy> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.i);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      $$1.dM().a(brz.i, this.a($$1));
   }

   private List<biy> a(biy $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(biy $$0) {
      return $$0.ag() == bim.bf && $$0.i_();
   }

   private bsb c(biy $$0) {
      return $$0.dM().c(brz.h).orElse(bsb.a());
   }
}
