import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bvu extends bvk {
   private final ToIntFunction<azv> c;

   protected bvu(bvl $$0, int $$1, ToIntFunction<azv> $$2) {
      super($$0, $$1, ly.Y);
      this.c = $$2;
   }

   @Override
   public void a(arq $$0, bxj $$1, int $$2, bwi.d $$3) {
      if ($$3 == bwi.d.a && ($$1 instanceof crm || $$0.O().c(dji.d))) {
         this.a($$0, $$1.dX(), $$1.du());
      }
   }

   private void a(arq $$0, azv $$1, iv $$2) {
      Set<iv> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (iv $$5 : iv.a($$1, 15, $$2, 1)) {
         iv $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jb.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (iv $$7 : $$3) {
         $$0.a($$7, dmt.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
