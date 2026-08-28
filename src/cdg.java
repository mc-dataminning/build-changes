import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdg extends cdl<btb> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.h, ccf.M, ccf.an);
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      bud<?> $$2 = $$1.dU();
      List<ckz> $$3 = Lists.newArrayList();
      cch $$4 = $$2.c(ccf.h).orElse(cch.a());
      Optional<btd> $$5 = $$4.a($$0x -> $$0x instanceof ckh || $$0x instanceof cih).map(btd.class::cast);

      for (btb $$7 : $$2.c(ccf.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof ckz && ((ckz)$$7).gp()) {
            $$3.add((ckz)$$7);
         }
      }

      $$2.a(ccf.M, $$5);
      $$2.a(ccf.an, $$3);
   }
}
