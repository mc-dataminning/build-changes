import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class byt extends bzg<cgk> {
   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.h, bya.aw, bya.aq, bya.ap, bya.as, bya.at, new bya[0]);
   }

   protected void a(apa $$0, cgk $$1) {
      bpy<?> $$2 = $$1.dM();
      $$2.a(bya.aw, this.b($$0, $$1));
      Optional<cgq> $$3 = Optional.empty();
      int $$4 = 0;
      List<cgk> $$5 = Lists.newArrayList();
      byc $$6 = $$2.c(bya.h).orElse(byc.a());

      for (box $$7 : $$6.b($$0x -> !$$0x.o_() && ($$0x instanceof cgq || $$0x instanceof cgk))) {
         if ($$7 instanceof cgq $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cgk $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bya.aq, $$3);
      $$2.a(bya.ap, $$5);
      $$2.a(bya.as, $$4);
      $$2.a(bya.at, $$5.size());
   }

   private Optional<ib> b(apa $$0, cgk $$1) {
      return ib.a($$1.dj(), 8, 4, $$1x -> $$0.a_($$1x).a(aue.aR));
   }
}
