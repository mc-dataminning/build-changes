import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bsg extends brw {
   private final ToIntFunction<ayv> c;

   protected bsg(brx $$0, int $$1, ToIntFunction<ayv> $$2) {
      super($$0, $$1, lm.V);
      this.c = $$2;
   }

   @Override
   public void a(btl $$0, int $$1, bsq.c $$2) {
      if ($$2 == bsq.c.a && ($$0 instanceof cmv || $$0.dQ().ab().b(dcq.c))) {
         this.a($$0.dQ(), $$0.dT(), $$0.aM());
      }
   }

   private void a(dcu $$0, ayv $$1, jd $$2) {
      Set<jd> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jd $$5 : jd.a($$1, 15, $$2, 1)) {
         jd $$6 = $$5.d();
         if (!$$3.contains($$5) && $$0.a_($$5).r() && $$0.a_($$6).d($$0, $$6, ji.b)) {
            $$3.add($$5.i());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jd $$7 : $$3) {
         $$0.a($$7, dfy.bs.o(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
