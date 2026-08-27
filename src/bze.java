import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class bze extends bzg<chn> {
   private static final int a = 40;

   public bze() {
      super(40);
   }

   protected void a(apa $$0, chn $$1) {
      ajb<cwe> $$2 = $$0.ad();
      ib $$3 = $$1.dj();
      List<ik> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               ib $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gw().b().e().contains($$0.a_($$9).b())) {
                  $$4.add(ik.a($$2, $$9));
               }
            }
         }
      }

      bpy<?> $$10 = $$1.dM();
      if (!$$4.isEmpty()) {
         $$10.a(bya.f, $$4);
      } else {
         $$10.b(bya.f);
      }
   }

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.f);
   }
}
