import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class brx extends brn {
   private final ToIntFunction<ayo> c;

   protected brx(bro $$0, int $$1, ToIntFunction<ayo> $$2) {
      super($$0, $$1, lj.V);
      this.c = $$2;
   }

   @Override
   public void a(btc $$0, int $$1, bsh.d $$2) {
      if ($$2 == bsh.d.a && ($$0 instanceof cml || $$0.dR().ab().b(dcc.c))) {
         this.a($$0.dR(), $$0.dU(), $$0.aN());
      }
   }

   private void a(dcg $$0, ayo $$1, ja $$2) {
      Set<ja> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

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
         $$0.a($$7, dfk.bs.o(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
