import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btg extends btl<bjg> {
   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.h, bsh.L, bsh.am);
   }

   @Override
   protected void a(akq $$0, bjg $$1) {
      bkg<?> $$2 = $$1.dN();
      List<caj> $$3 = Lists.newArrayList();
      bsj $$4 = $$2.c(bsh.h).orElse(bsj.a());
      Optional<bji> $$5 = $$4.a($$0x -> $$0x instanceof bzz || $$0x instanceof byb).map(bji.class::cast);

      for (bjg $$7 : $$2.c(bsh.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof caj && ((caj)$$7).ge()) {
            $$3.add((caj)$$7);
         }
      }

      $$2.a(bsh.L, $$5);
      $$2.a(bsh.am, $$3);
   }
}
