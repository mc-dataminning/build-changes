import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cer extends cew<bun> {
   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.h, cdq.M, cdq.an);
   }

   @Override
   protected void a(arj $$0, bun $$1) {
      bvo<?> $$2 = $$1.dY();
      List<cmm> $$3 = Lists.newArrayList();
      cds $$4 = $$2.c(cdq.h).orElse(cds.a());
      Optional<bup> $$5 = $$4.a($$0x -> $$0x instanceof clu || $$0x instanceof cju).map(bup.class::cast);

      for (bun $$7 : $$2.c(cdq.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cmm && ((cmm)$$7).gp()) {
            $$3.add((cmm)$$7);
         }
      }

      $$2.a(cdq.M, $$5);
      $$2.a(cdq.an, $$3);
   }
}
