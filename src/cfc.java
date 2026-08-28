import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfc extends cfp<cnd> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.h, cej.aw, cej.aq, cej.ap, cej.as, cej.at, new cej[0]);
   }

   protected void a(arc $$0, cnd $$1) {
      bwh<?> $$2 = $$1.ec();
      $$2.a(cej.aw, this.b($$0, $$1));
      Optional<cnj> $$3 = Optional.empty();
      int $$4 = 0;
      List<cnd> $$5 = Lists.newArrayList();
      cel $$6 = $$2.c(cej.h).orElse(cel.a());

      for (bvf $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof cnj || $$0x instanceof cnd))) {
         if ($$7 instanceof cnj $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cnd $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cej.aq, $$3);
      $$2.a(cej.ap, $$5);
      $$2.a(cej.as, $$4);
      $$2.a(cej.at, $$5.size());
   }

   private Optional<ji> b(arc $$0, cnd $$1) {
      return ji.a($$1.dw(), 8, 4, $$1x -> $$0.a_($$1x).a(awo.aU));
   }
}
