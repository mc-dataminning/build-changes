import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chf extends chk<bxc> {
   @Override
   public Set<cge<?>> a() {
      return ImmutableSet.of(cge.h, cge.N, cge.ao);
   }

   @Override
   protected void a(arq $$0, bxc $$1) {
      byc<?> $$2 = $$1.eb();
      List<cpm> $$3 = Lists.newArrayList();
      cgg $$4 = $$2.c(cge.h).orElse(cgg.a());
      Optional<bxe> $$5 = $$4.a($$0x -> $$0x instanceof cor || $$0x instanceof cmq).map(bxe.class::cast);

      for (bxc $$7 : $$2.c(cge.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cpm && ((cpm)$$7).t()) {
            $$3.add((cpm)$$7);
         }
      }

      $$2.a(cge.N, $$5);
      $$2.a(cge.ao, $$3);
   }
}
