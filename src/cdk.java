import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdk extends cdx<clf> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.h, ccr.aw, ccr.aq, ccr.ap, ccr.as, ccr.at, new ccr[0]);
   }

   protected void a(are $$0, clf $$1) {
      bup<?> $$2 = $$1.dS();
      $$2.a(ccr.aw, this.b($$0, $$1));
      Optional<cll> $$3 = Optional.empty();
      int $$4 = 0;
      List<clf> $$5 = Lists.newArrayList();
      cct $$6 = $$2.c(ccr.h).orElse(cct.a());

      for (btn $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cll || $$0x instanceof clf))) {
         if ($$7 instanceof cll $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof clf $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(ccr.aq, $$3);
      $$2.a(ccr.ap, $$5);
      $$2.a(ccr.as, $$4);
      $$2.a(ccr.at, $$5.size());
   }

   private Optional<iz> b(are $$0, clf $$1) {
      return iz.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(awo.aS));
   }
}
