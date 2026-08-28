import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfy extends cgl<coa> {
   @Override
   public Set<cff<?>> a() {
      return ImmutableSet.of(cff.h, cff.aw, cff.aq, cff.ap, cff.as, cff.at, new cff[0]);
   }

   protected void a(ash $$0, coa $$1) {
      bxd<?> $$2 = $$1.eb();
      $$2.a(cff.aw, this.b($$0, $$1));
      Optional<cog> $$3 = Optional.empty();
      int $$4 = 0;
      List<coa> $$5 = Lists.newArrayList();
      cfh $$6 = $$2.c(cff.h).orElse(cfh.a());

      for (bwb $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof cog || $$0x instanceof coa))) {
         if ($$7 instanceof cog $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof coa $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cff.aq, $$3);
      $$2.a(cff.ap, $$5);
      $$2.a(cff.as, $$4);
      $$2.a(cff.at, $$5.size());
   }

   private Optional<jh> b(ash $$0, coa $$1) {
      return jh.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(axu.aU));
   }
}
