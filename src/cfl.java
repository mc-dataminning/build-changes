import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfl extends cfq<bvg> {
   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.h, cek.M, cek.an);
   }

   @Override
   protected void a(arc $$0, bvg $$1) {
      bwi<?> $$2 = $$1.ec();
      List<cnk> $$3 = Lists.newArrayList();
      cem $$4 = $$2.c(cek.h).orElse(cem.a());
      Optional<bvi> $$5 = $$4.a($$0x -> $$0x instanceof cmo || $$0x instanceof cko).map(bvi.class::cast);

      for (bvg $$7 : $$2.c(cek.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cnk && ((cnk)$$7).gp()) {
            $$3.add((cnk)$$7);
         }
      }

      $$2.a(cek.M, $$5);
      $$2.a(cek.an, $$3);
   }
}
