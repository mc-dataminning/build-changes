import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfj extends cfo<bve> {
   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.h, cei.M, cei.an);
   }

   @Override
   protected void a(arq $$0, bve $$1) {
      bwg<?> $$2 = $$1.ee();
      List<cne> $$3 = Lists.newArrayList();
      cek $$4 = $$2.c(cei.h).orElse(cek.a());
      Optional<bvg> $$5 = $$4.a($$0x -> $$0x instanceof cmm || $$0x instanceof ckm).map(bvg.class::cast);

      for (bve $$7 : $$2.c(cei.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cne && ((cne)$$7).gw()) {
            $$3.add((cne)$$7);
         }
      }

      $$2.a(cei.M, $$5);
      $$2.a(cei.an, $$3);
   }
}
