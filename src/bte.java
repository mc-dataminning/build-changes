import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bte extends btg<cbc> {
   private static final int a = 40;

   public bte() {
      super(40);
   }

   protected void a(akn $$0, cbc $$1) {
      aet<cpq> $$2 = $$0.ac();
      gw $$3 = $$1.dk();
      List<hf> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               gw $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gl().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(hf.a($$2, $$9));
               }
            }
         }
      }

      bkb<?> $$10 = $$1.dM();
      if (!$$4.isEmpty()) {
         $$10.a(bsc.f, $$4);
      } else {
         $$10.b(bsc.f);
      }
   }

   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.f);
   }
}
