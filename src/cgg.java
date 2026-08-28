import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgg extends cgl<bwb> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.h, cff.M, cff.an);
   }

   @Override
   protected void a(ash $$0, bwb $$1) {
      bxd<?> $$2 = $$1.eb();
      List<cof> $$3 = Lists.newArrayList();
      cfh $$4 = $$2.c(cff.h).orElse(cfh.a());
      Optional<bwd> $$5 = $$4.a($$0x -> $$0x instanceof cnj || $$0x instanceof clj).map(bwd.class::cast);

      for (bwb $$7 : $$2.c(cff.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cof && ((cof)$$7).gm()) {
            $$3.add((cof)$$7);
         }
      }

      $$2.a(cff.M, $$5);
      $$2.a(cff.an, $$3);
   }
}
