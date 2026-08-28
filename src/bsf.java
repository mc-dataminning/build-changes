import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bsf extends brv {
   private final ToIntFunction<azc> a;

   protected bsf(brw $$0, int $$1, ToIntFunction<azc> $$2) {
      super($$0, $$1, lj.V);
      this.a = $$2;
   }

   @Override
   public void a(btk $$0, int $$1, bsp.c $$2) {
      if ($$2 == bsp.c.a && ($$0 instanceof cms || $$0.dP().ab().b(dbp.c))) {
         this.a($$0.dP(), $$0.el(), $$0.aL());
      }
   }

   private void a(dbt $$0, azc $$1, iz $$2) {
      Set<iz> $$3 = Sets.newHashSet();
      int $$4 = this.a.applyAsInt($$1);

      for (iz $$5 : iz.a($$1, 15, $$2, 1)) {
         iz $$6 = $$5.d();
         if (!$$3.contains($$5) && $$0.a_($$5).r() && $$0.a_($$6).d($$0, $$6, je.b)) {
            $$3.add($$5.i());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (iz $$7 : $$3) {
         $$0.a($$7, dew.bs.n(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
