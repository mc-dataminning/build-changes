import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bsy extends btd<biy> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.h, brz.L, brz.am);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      bjy<?> $$2 = $$1.dM();
      List<cab> $$3 = Lists.newArrayList();
      bsb $$4 = $$2.c(brz.h).orElse(bsb.a());
      Optional<bja> $$5 = $$4.a($$0x -> $$0x instanceof bzr || $$0x instanceof bxt).map(bja.class::cast);

      for (biy $$7 : $$2.c(brz.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cab && ((cab)$$7).gb()) {
            $$3.add((cab)$$7);
         }
      }

      $$2.a(brz.L, $$5);
      $$2.a(brz.am, $$3);
   }
}
