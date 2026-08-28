import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cff extends cfk<bva> {
   @Override
   public Set<cee<?>> a() {
      return ImmutableSet.of(cee.h, cee.M, cee.an);
   }

   @Override
   protected void a(arn $$0, bva $$1) {
      bwc<?> $$2 = $$1.ed();
      List<cna> $$3 = Lists.newArrayList();
      ceg $$4 = $$2.c(cee.h).orElse(ceg.a());
      Optional<bvc> $$5 = $$4.a($$0x -> $$0x instanceof cmi || $$0x instanceof cki).map(bvc.class::cast);

      for (bva $$7 : $$2.c(cee.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cna && ((cna)$$7).gv()) {
            $$3.add((cna)$$7);
         }
      }

      $$2.a(cee.M, $$5);
      $$2.a(cee.an, $$3);
   }
}
