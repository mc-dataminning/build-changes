import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bqa extends bqf<bfz> {
   @Override
   public Set<bpb<?>> a() {
      return ImmutableSet.of(bpb.h, bpb.L, bpb.am);
   }

   @Override
   protected void a(aif $$0, bfz $$1) {
      bha<?> $$2 = $$1.dK();
      List<bxd> $$3 = Lists.newArrayList();
      bpd $$4 = $$2.c(bpb.h).orElse(bpd.a());
      Optional<bgb> $$5 = $$4.a($$0x -> $$0x instanceof bwt || $$0x instanceof buv).map(bgb.class::cast);

      for (bfz $$7 : $$2.c(bpb.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof bxd && ((bxd)$$7).fZ()) {
            $$3.add((bxd)$$7);
         }
      }

      $$2.a(bpb.L, $$5);
      $$2.a(bpb.am, $$3);
   }
}
