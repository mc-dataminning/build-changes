import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class chr extends cie<cqi> {
   @Override
   public Set<cgy<?>> a() {
      return ImmutableSet.of(cgy.h, cgy.ax, cgy.ar, cgy.aq, cgy.at, cgy.au, new cgy[0]);
   }

   protected void a(aru $$0, cqi $$1) {
      byw<?> $$2 = $$1.ec();
      $$2.a(cgy.ax, this.b($$0, $$1));
      Optional<cqo> $$3 = Optional.empty();
      int $$4 = 0;
      List<cqi> $$5 = Lists.newArrayList();
      cha $$6 = $$2.c(cgy.h).orElse(cha.a());

      for (bxw $$7 : $$6.b($$0x -> !$$0x.n_() && ($$0x instanceof cqo || $$0x instanceof cqi))) {
         if ($$7 instanceof cqo $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cqi $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(cgy.ar, $$3);
      $$2.a(cgy.aq, $$5);
      $$2.a(cgy.at, $$4);
      $$2.a(cgy.au, $$5.size());
   }

   private Optional<iw> b(aru $$0, cqi $$1) {
      return iw.a($$1.dv(), 8, 4, $$1x -> $$0.a_($$1x).a(axg.aU));
   }
}
