import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class btl extends btn<cbj> {
   private static final int a = 40;

   public btl() {
      super(40);
   }

   protected void a(aks $$0, cbj $$1) {
      aex<cpx> $$2 = $$0.ac();
      gw $$3 = $$1.dl();
      List<hf> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               gw $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.go().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(hf.a($$2, $$9));
               }
            }
         }
      }

      bki<?> $$10 = $$1.dN();
      if (!$$4.isEmpty()) {
         $$10.a(bsj.f, $$4);
      } else {
         $$10.b(bsj.f);
      }
   }

   @Override
   public Set<bsj<?>> a() {
      return ImmutableSet.of(bsj.f);
   }
}
