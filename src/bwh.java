import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bwh extends bvx {
   private final ToIntFunction<azz> c;

   protected bwh(bvy $$0, int $$1, ToIntFunction<azz> $$2) {
      super($$0, $$1, lz.Y);
      this.c = $$2;
   }

   @Override
   public void a(aru $$0, bxw $$1, int $$2, bwv.d $$3) {
      if ($$3 == bwv.d.a && ($$1 instanceof crz || $$0.O().c(djv.d))) {
         this.a($$0, $$1.dY(), $$1.dv());
      }
   }

   private void a(aru $$0, azz $$1, iw $$2) {
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
         $$0.a($$7, dng.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
