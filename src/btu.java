import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;

public class btu extends btr<bjm> {
   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.i);
   }

   @Override
   protected void a(akt $$0, bjm $$1) {
      $$1.dN().a(bsn.i, this.a($$1));
   }

   private List<bjm> a(bjm $$0) {
      return ImmutableList.copyOf(this.c($$0).b(this::b));
   }

   private boolean b(bjm $$0) {
      return $$0.ag() == bja.bf && $$0.m_();
   }

   private bsp c(bjm $$0) {
      return $$0.dN().c(bsn.h).orElse(bsp.a());
   }
}
