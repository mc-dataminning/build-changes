import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;

public class chf extends chh<cqe> {
   private static final int a = 40;

   public chf() {
      super(40);
   }

   protected void a(aro $$0, cqe $$1) {
      ald<dip> $$2 = $$0.aj();
      iu $$3 = $$1.dv();
      List<jd> $$4 = Lists.newArrayList();
      int $$5 = 4;

      for (int $$6 = -4; $$6 <= 4; $$6++) {
         for (int $$7 = -2; $$7 <= 2; $$7++) {
            for (int $$8 = -4; $$8 <= 4; $$8++) {
               iu $$9 = $$3.b($$6, $$7, $$8);
               if ($$1.gy().b().a().e().contains($$0.a_($$9).b())) {
                  $$4.add(jd.a($$2, $$9));
               }
            }
         }
      }

      bxz<?> $$10 = $$1.eb();
      if (!$$4.isEmpty()) {
         $$10.a(cgb.f, $$4);
      } else {
         $$10.b(cgb.f);
      }
   }

   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.f);
   }
}
