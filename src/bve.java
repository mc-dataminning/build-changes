import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bve extends buu {
   private final ToIntFunction<azs> c;

   protected bve(buv $$0, int $$1, ToIntFunction<azs> $$2) {
      super($$0, $$1, lv.Y);
      this.c = $$2;
   }

   @Override
   public void a(arn $$0, bwr $$1, int $$2, bvs.e $$3) {
      if ($$3 == bvs.e.a && ($$1 instanceof cqi || $$0.O().c(dhl.c))) {
         this.a($$0, $$1.dY(), $$1.dv());
      }
   }

   private void a(arn $$0, azs $$1, jj $$2) {
      Set<jj> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jj $$5 : jj.a($$1, 15, $$2, 1)) {
         jj $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jo.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jj $$7 : $$3) {
         $$0.a($$7, dkw.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
