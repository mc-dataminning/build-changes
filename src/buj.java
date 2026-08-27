import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class buj extends buo<bkj> {
   @Override
   public Set<btk<?>> a() {
      return ImmutableSet.of(btk.h, btk.L, btk.am);
   }

   @Override
   protected void a(alq $$0, bkj $$1) {
      blj<?> $$2 = $$1.dN();
      List<cbm> $$3 = Lists.newArrayList();
      btm $$4 = $$2.c(btk.h).orElse(btm.a());
      Optional<bkl> $$5 = $$4.a($$0x -> $$0x instanceof cbc || $$0x instanceof bze).map(bkl.class::cast);

      for (bkj $$7 : $$2.c(btk.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cbm && ((cbm)$$7).gf()) {
            $$3.add((cbm)$$7);
         }
      }

      $$2.a(btk.L, $$5);
      $$2.a(btk.am, $$3);
   }
}
