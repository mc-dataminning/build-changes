import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

class brk extends bra {
   private final ToIntFunction<ayk> a;

   protected brk(brb $$0, int $$1, ToIntFunction<ayk> $$2) {
      super($$0, $$1, ky.V);
      this.a = $$2;
   }

   @Override
   public void a(bso $$0, int $$1, bru.c $$2) {
      if ($$2 == bru.c.a) {
         this.a($$0.dP(), $$0.el(), $$0.aL());
      }
   }

   private void a(dax $$0, ayk $$1, io $$2) {
      List<io> $$3 = new ArrayList<>();
      int $$4 = this.a.applyAsInt($$1);

      for (io $$5 : io.a($$1, 10, $$2, 3)) {
         io $$6 = $$5.d();
         if ($$0.a_($$5).i() && $$0.a_($$6).d($$0, $$6, it.b)) {
            $$3.add($$5.i());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (io $$7 : $$3) {
         $$0.a($$7, dea.bs.n(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
