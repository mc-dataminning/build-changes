import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class brt extends brj {
   private final ToIntFunction<aym> a;

   protected brt(brk $$0, int $$1, ToIntFunction<aym> $$2) {
      super($$0, $$1, lj.V);
      this.a = $$2;
   }

   @Override
   public void a(bsy $$0, int $$1, bsd.c $$2) {
      if ($$2 == bsd.c.a && ($$0 instanceof cmh || $$0.dP().ab().b(dbz.c))) {
         this.a($$0.dP(), $$0.dS(), $$0.aL());
      }
   }

   private void a(dcd $$0, aym $$1, ja $$2) {
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
         $$0.a($$7, dfh.bs.o(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
