import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfe extends cfr<cnf> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.h, cel.aw, cel.aq, cel.ap, cel.as, cel.at, new cel[0]);
   }

   protected void a(ard $$0, cnf $$1) {
      bwj<?> $$2 = $$1.eb();
      $$2.a(cel.aw, this.b($$0, $$1));
      Optional<cnl> $$3 = Optional.empty();
      int $$4 = 0;
      List<cnf> $$5 = Lists.newArrayList();
      cen $$6 = $$2.c(cel.h).orElse(cen.a());

      for (bvh $$7 : $$6.b($$0x -> !$$0x.e_() && ($$0x instanceof cnl || $$0x instanceof cnf))) {
         if ($$7 instanceof cnl $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cnf $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cel.aq, $$3);
      $$2.a(cel.ap, $$5);
      $$2.a(cel.as, $$4);
      $$2.a(cel.at, $$5.size());
   }

   private Optional<ji> b(ard $$0, cnf $$1) {
      return ji.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(awp.aU));
   }
}
