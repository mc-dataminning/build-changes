import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ceo extends cet<buk> {
   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.h, cdn.M, cdn.an);
   }

   @Override
   protected void a(arh $$0, buk $$1) {
      bvl<?> $$2 = $$1.dX();
      List<cmj> $$3 = Lists.newArrayList();
      cdp $$4 = $$2.c(cdn.h).orElse(cdp.a());
      Optional<bum> $$5 = $$4.a($$0x -> $$0x instanceof clr || $$0x instanceof cjr).map(bum.class::cast);

      for (buk $$7 : $$2.c(cdn.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cmj && ((cmj)$$7).gq()) {
            $$3.add((cmj)$$7);
         }
      }

      $$2.a(cdn.M, $$5);
      $$2.a(cdn.an, $$3);
   }
}
