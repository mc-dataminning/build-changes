import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cap extends cbc<cik> {
   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.h, bzw.aw, bzw.aq, bzw.ap, bzw.as, bzw.at, new bzw[0]);
   }

   protected void a(apu $$0, cik $$1) {
      bru<?> $$2 = $$1.dP();
      $$2.a(bzw.aw, this.b($$0, $$1));
      Optional<ciq> $$3 = Optional.empty();
      int $$4 = 0;
      List<cik> $$5 = Lists.newArrayList();
      bzy $$6 = $$2.c(bzw.h).orElse(bzy.a());

      for (bqt $$7 : $$6.b($$0x -> !$$0x.p_() && ($$0x instanceof ciq || $$0x instanceof cik))) {
         if ($$7 instanceof ciq $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cik $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bzw.aq, $$3);
      $$2.a(bzw.ap, $$5);
      $$2.a(bzw.as, $$4);
      $$2.a(bzw.at, $$5.size());
   }

   private Optional<id> b(apu $$0, cik $$1) {
      return id.a($$1.dm(), 8, 4, $$1x -> $$0.a_($$1x).a(ave.aS));
   }
}
