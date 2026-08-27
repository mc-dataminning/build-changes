import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bzb extends bzg<box> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.h, bya.M, bya.an);
   }

   @Override
   protected void a(apa $$0, box $$1) {
      bpy<?> $$2 = $$1.dM();
      List<cgp> $$3 = Lists.newArrayList();
      byc $$4 = $$2.c(bya.h).orElse(byc.a());
      Optional<boz> $$5 = $$4.a($$0x -> $$0x instanceof cfx || $$0x instanceof cdz).map(boz.class::cast);

      for (box $$7 : $$2.c(bya.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cgp && ((cgp)$$7).gm()) {
            $$3.add((cgp)$$7);
         }
      }

      $$2.a(bya.M, $$5);
      $$2.a(bya.an, $$3);
   }
}
