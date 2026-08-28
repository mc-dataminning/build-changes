import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bsj extends brz {
   private final ToIntFunction<azg> a;

   protected bsj(bsa $$0, int $$1, ToIntFunction<azg> $$2) {
      super($$0, $$1, li.V);
      this.a = $$2;
   }

   @Override
   public void a(bto $$0, int $$1, bst.c $$2) {
      if ($$2 == bst.c.a && ($$0 instanceof cmw || $$0.dP().ab().b(dbt.c))) {
         this.a($$0.dP(), $$0.el(), $$0.aL());
      }
   }

   private void a(dbx $$0, azg $$1, iz $$2) {
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
         $$0.a($$7, dfa.bs.o(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
