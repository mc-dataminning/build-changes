import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cgk extends cgp<bwf> {
   @Override
   public Set<cfj<?>> a() {
      return ImmutableSet.of(cfj.h, cfj.M, cfj.an);
   }

   @Override
   protected void a(ash $$0, bwf $$1) {
      bxh<?> $$2 = $$1.ec();
      List<coj> $$3 = Lists.newArrayList();
      cfl $$4 = $$2.c(cfj.h).orElse(cfl.a());
      Optional<bwh> $$5 = $$4.a($$0x -> $$0x instanceof cnn || $$0x instanceof cln).map(bwh.class::cast);

      for (bwf $$7 : $$2.c(cfj.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof coj && ((coj)$$7).go()) {
            $$3.add((coj)$$7);
         }
      }

      $$2.a(cfj.M, $$5);
      $$2.a(cfj.an, $$3);
   }
}
