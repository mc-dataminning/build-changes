import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bsh extends brx {
   private final ToIntFunction<ayw> c;

   protected bsh(bry $$0, int $$1, ToIntFunction<ayw> $$2) {
      super($$0, $$1, lm.V);
      this.c = $$2;
   }

   @Override
   public void a(btn $$0, int $$1, bsr.c $$2) {
      if ($$2 == bsr.c.a && ($$0 instanceof cmx || $$0.dP().ab().b(dcs.c))) {
         this.a($$0.dP(), $$0.dS(), $$0.aM());
      }
   }

   private void a(dcw $$0, ayw $$1, jd $$2) {
      Set<jd> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jd $$5 : jd.a($$1, 15, $$2, 1)) {
         jd $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).r() && $$0.a_($$6).d($$0, $$6, ji.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jd $$7 : $$3) {
         $$0.a($$7, dga.bs.o(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
