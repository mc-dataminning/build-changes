import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chc extends chh<bwz> {
   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.h, cgb.N, cgb.ao);
   }

   @Override
   protected void a(aro $$0, bwz $$1) {
      bxz<?> $$2 = $$1.eb();
      List<cpg> $$3 = Lists.newArrayList();
      cgd $$4 = $$2.c(cgb.h).orElse(cgd.a());
      Optional<bxb> $$5 = $$4.a($$0x -> $$0x instanceof cok || $$0x instanceof cmk).map(bxb.class::cast);

      for (bwz $$7 : $$2.c(cgb.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cpg && ((cpg)$$7).t()) {
            $$3.add((cpg)$$7);
         }
      }

      $$2.a(cgb.N, $$5);
      $$2.a(cgb.ao, $$3);
   }
}
