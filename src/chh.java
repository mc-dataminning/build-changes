import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chh extends chm<bxe> {
   @Override
   public Set<cgg<?>> a() {
      return ImmutableSet.of(cgg.h, cgg.N, cgg.ao);
   }

   @Override
   protected void a(arq $$0, bxe $$1) {
      bye<?> $$2 = $$1.ec();
      List<cpq> $$3 = Lists.newArrayList();
      cgi $$4 = $$2.c(cgg.h).orElse(cgi.a());
      Optional<bxg> $$5 = $$4.a($$0x -> $$0x instanceof cov || $$0x instanceof cmu).map(bxg.class::cast);

      for (bxe $$7 : $$2.c(cgg.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cpq && ((cpq)$$7).t()) {
            $$3.add((cpq)$$7);
         }
      }

      $$2.a(cgg.N, $$5);
      $$2.a(cgg.ao, $$3);
   }
}
