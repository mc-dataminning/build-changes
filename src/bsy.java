import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bsy extends bso {
   private final ToIntFunction<azk> c;

   protected bsy(bsp $$0, int $$1, ToIntFunction<azk> $$2) {
      super($$0, $$1, ln.V);
      this.c = $$2;
   }

   @Override
   public void a(buf $$0, int $$1, btj.c $$2) {
      if ($$2 == btj.c.a && ($$0 instanceof cnp || $$0.dS().ac().b(ddo.c))) {
         this.a($$0.dS(), $$0.dV(), $$0.ds());
      }
   }

   private void a(dds $$0, azk $$1, je $$2) {
      Set<je> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (je $$5 : je.a($$1, 15, $$2, 1)) {
         je $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jj.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (je $$7 : $$3) {
         $$0.a($$7, dgx.bs.o(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
