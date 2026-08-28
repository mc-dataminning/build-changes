import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bwq extends bwg {
   private final ToIntFunction<bai> c;

   protected bwq(bwh $$0, int $$1, ToIntFunction<bai> $$2) {
      super($$0, $$1, lz.Y);
      this.c = $$2;
   }

   @Override
   public void a(asb $$0, byf $$1, int $$2, bxe.d $$3) {
      if ($$3 == bxe.d.a && ($$1 instanceof csi || $$0.O().c(dkf.d))) {
         this.a($$0, $$1.dY(), $$1.dv());
      }
   }

   private void a(asb $$0, bai $$1, iw $$2) {
      Set<iw> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (iw $$5 : iw.a($$1, 15, $$2, 1)) {
         iw $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jc.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (iw $$7 : $$3) {
         $$0.a($$7, dnq.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
