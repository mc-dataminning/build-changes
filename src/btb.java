import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class btb extends btn<cag> {
   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.h, bsj.av, bsj.ap, bsj.ao, bsj.ar, bsj.as, new bsj[0]);
   }

   protected void a(aks $$0, cag $$1) {
      bki<?> $$2 = $$1.dN();
      $$2.a(bsj.av, this.b($$0, $$1));
      Optional<cam> $$3 = Optional.empty();
      int $$4 = 0;
      List<cag> $$5 = Lists.newArrayList();
      bsl $$6 = $$2.c(bsj.h).orElse(bsl.a());

      for (bji $$7 : $$6.b($$0x -> !$$0x.m_() && ($$0x instanceof cam || $$0x instanceof cag))) {
         if ($$7 instanceof cam $$8) {
            $$4++;
            if ($$3.isEmpty()) {
               $$3 = Optional.of($$8);
            }
         }

         if ($$7 instanceof cag $$9) {
            $$5.add($$9);
         }
      }

      $$2.a(bsj.ap, $$3);
      $$2.a(bsj.ao, $$5);
      $$2.a(bsj.ar, $$4);
      $$2.a(bsj.as, $$5.size());
   }

   private Optional<gw> b(aks $$0, cag $$1) {
      return gw.a($$1.dl(), 8, 4, $$1x -> $$0.a_($$1x).a(apu.aR));
   }
}
