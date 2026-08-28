import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chm extends chr<bxj> {
   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.h, cgl.N, cgl.ao);
   }

   @Override
   protected void a(arq $$0, bxj $$1) {
      byj<?> $$2 = $$1.eb();
      List<cpx> $$3 = Lists.newArrayList();
      cgn $$4 = $$2.c(cgl.h).orElse(cgn.a());
      Optional<bxl> $$5 = $$4.a($$0x -> $$0x instanceof cpc || $$0x instanceof cnb).map(bxl.class::cast);

      for (bxj $$7 : $$2.c(cgl.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cpx && ((cpx)$$7).t()) {
            $$3.add((cpx)$$7);
         }
      }

      $$2.a(cgl.N, $$5);
      $$2.a(cgl.ao, $$3);
   }
}
