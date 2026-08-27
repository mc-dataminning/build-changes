import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ccn extends cda<cki> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.h, cbu.aw, cbu.aq, cbu.ap, cbu.as, cbu.at, new cbu[0]);
   }

   protected void a(aqn $$0, cki $$1) {
      bts<?> $$2 = $$1.dS();
      $$2.a(cbu.aw, this.b($$0, $$1));
      Optional<cko> $$3 = Optional.empty();
      int $$4 = 0;
      List<cki> $$5 = Lists.newArrayList();
      cbw $$6 = $$2.c(cbu.h).orElse(cbw.a());

      for (bsq $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof cko || $$0x instanceof cki))) {
         if ($$7 instanceof cko $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cki $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cbu.aq, $$3);
      $$2.a(cbu.ap, $$5);
      $$2.a(cbu.as, $$4);
      $$2.a(cbu.at, $$5.size());
   }

   private Optional<io> b(aqn $$0, cki $$1) {
      return io.a($$1.dp(), 8, 4, $$1x -> $$0.a_($$1x).a(avx.aS));
   }
}
