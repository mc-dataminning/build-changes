import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccs extends ccx<bso> {
   @Override
   public Set<cbr<?>> a() {
      return ImmutableSet.of(cbr.h, cbr.M, cbr.an);
   }

   @Override
   protected void a(aqt $$0, bso $$1) {
      btp<?> $$2 = $$1.dZ();
      List<ckn> $$3 = Lists.newArrayList();
      cbt $$4 = $$2.c(cbr.h).orElse(cbt.a());
      Optional<bsq> $$5 = $$4.a($$0x -> $$0x instanceof cjv || $$0x instanceof chu).map(bsq.class::cast);

      for (bso $$7 : $$2.c(cbr.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof ckn && ((ckn)$$7).gz()) {
            $$3.add((ckn)$$7);
         }
      }

      $$2.a(cbr.M, $$5);
      $$2.a(cbr.an, $$3);
   }
}
