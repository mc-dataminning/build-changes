import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class btj extends btl<cbh> {
   private static final int a = 40;

   public btj() {
      super(40);
   }

   protected void a(akr $$0, cbh $$1) {
      aew<cpv> $$2 = $$0.ac();
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

      bkg<?> $$10 = $$1.dN();
      if (!$$4.isEmpty()) {
         $$10.a(bsh.f, $$4);
      } else {
         $$10.b(bsh.f);
      }
   }

   @Override
   public Set<bsh<?>> a() {
      return ImmutableSet.of(bsh.f);
   }
}
