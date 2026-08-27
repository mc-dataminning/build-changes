import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cch extends ccj<cku> {
   private static final int a = 40;

   public cch() {
      super(40);
   }

   protected void a(aqh $$0, cku $$1) {
      akg<dad> $$2 = $$0.ae();
      in $$3 = $$1.dn();
      List<iv> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               in $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gA().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(iv.a($$2, $$9));
               }
            }
         }
      }

      btb<?> $$10 = $$1.dQ();
      if (!$$4.isEmpty()) {
         $$10.a(cbd.f, $$4);
      } else {
         $$10.b(cbd.f);
      }
   }

   @Override
   public Set<cbd<?>> a() {
      return ImmutableSet.of(cbd.f);
   }
}
