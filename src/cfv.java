import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cfv extends cgi<cnz> {
   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.h, cfc.aw, cfc.aq, cfc.ap, cfc.as, cfc.at, new cfc[0]);
   }

   protected void a(ard $$0, cnz $$1) {
      bxa<?> $$2 = $$1.ea();
      $$2.a(cfc.aw, this.b($$0, $$1));
      Optional<cof> $$3 = Optional.empty();
      int $$4 = 0;
      List<cnz> $$5 = Lists.newArrayList();
      cfe $$6 = $$2.c(cfc.h).orElse(cfe.a());

      for (bvy $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cof || $$0x instanceof cnz))) {
         if ($$7 instanceof cof $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cnz $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cfc.aq, $$3);
      $$2.a(cfc.ap, $$5);
      $$2.a(cfc.as, $$4);
      $$2.a(cfc.at, $$5.size());
   }

   private Optional<ji> b(ard $$0, cnz $$1) {
      return ji.a($$1.du(), 8, 4, $$1x -> $$0.a_($$1x).a(awp.aU));
   }
}
