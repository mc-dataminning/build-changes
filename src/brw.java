import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class brw extends brm {
   private final ToIntFunction<ayo> a;

   protected brw(brn $$0, int $$1, ToIntFunction<ayo> $$2) {
      super($$0, $$1, lj.V);
      this.a = $$2;
   }

   @Override
   public void a(btb $$0, int $$1, bsg.c $$2) {
      if ($$2 == bsg.c.a && ($$0 instanceof cmk || $$0.dQ().ab().b(dcb.c))) {
         this.a($$0.dQ(), $$0.dT(), $$0.aM());
      }
   }

   private void a(dcf $$0, ayo $$1, ja $$2) {
      Set<ja> $$3 = Sets.newHashSet();
      int $$4 = this.a.applyAsInt($$1);

      for (ja $$5 : ja.a($$1, 15, $$2, 1)) {
         ja $$6 = $$5.d();
         if (!$$3.contains($$5) && $$0.a_($$5).r() && $$0.a_($$6).d($$0, $$6, jf.b)) {
            $$3.add($$5.i());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (ja $$7 : $$3) {
         $$0.a($$7, dfj.bs.o(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
