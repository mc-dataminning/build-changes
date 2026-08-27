import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class cba extends cbc<cjn> {
   private static final int a = 40;

   public cba() {
      super(40);
   }

   protected void a(apu $$0, cjn $$1) {
      aju<czg> $$2 = $$0.ae();
      id $$3 = $$1.dm();
      List<im> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               id $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gy().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(im.a($$2, $$9));
               }
            }
         }
      }

      bru<?> $$10 = $$1.dP();
      if (!$$4.isEmpty()) {
         $$10.a(bzw.f, $$4);
      } else {
         $$10.b(bzw.f);
      }
   }

   @Override
   public Set<bzw<?>> a() {
      return ImmutableSet.of(bzw.f);
   }
}
