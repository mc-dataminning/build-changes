import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class cez extends cew<bun> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.i);
   }

   @Override
   protected void a(arj $$0, bun $$1) {
      $$1.dY().a(cdq.i, this.a($$1));
   }

   private List<bun> a(bun $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bun $$0) {
      return $$0.ao() == bty.bj && $$0.p_();
   }

   private cds c(bun $$0) {
      return $$0.dY().c(cdq.h).orElse(cds.a());
   }
}
