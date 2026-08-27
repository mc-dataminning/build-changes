import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class bss extends bte<bzx> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.h, bsa.av, bsa.ap, bsa.ao, bsa.ar, bsa.as, new bsa[0]);
   }

   protected void a(akk $$0, bzx $$1) {
      bjz<?> $$2 = $$1.dM();
      $$2.a(bsa.av, this.b($$0, $$1));
      Optional<cad> $$3 = Optional.empty();
      int $$4 = 0;
      List<bzx> $$5 = Lists.newArrayList();
      bsc $$6 = $$2.c(bsa.h).orElse(bsc.a());

      for (biy $$7 : $$6.b($$0x -> !$$0x.i_() && ($$0x instanceof cad || $$0x instanceof bzx))) {
         if ($$7 instanceof cad $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof bzx $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bsa.ap, $$3);
      $$2.a(bsa.ao, $$5);
      $$2.a(bsa.ar, $$4);
      $$2.a(bsa.as, $$5.size());
   }

   private Optional<gu> b(akk $$0, bzx $$1) {
      return gu.a($$1.dk(), 8, 4, $$1x -> $$0.a_($$1x).a(apl.aR));
   }
}
