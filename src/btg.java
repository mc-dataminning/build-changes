import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class btg extends bsw {
   private final ToIntFunction<azn> c;

   protected btg(bsx $$0, int $$1, ToIntFunction<azn> $$2) {
      super($$0, $$1, lo.V);
      this.c = $$2;
   }

   @Override
   public void a(bun $$0, int $$1, btr.c $$2) {
      if ($$2 == btr.c.a && ($$0 instanceof cnx || $$0.dS().ac().b(def.c))) {
         this.a($$0.dS(), $$0.dV(), $$0.ds());
      }
   }

   private void a(dej $$0, azn $$1, jf $$2) {
      Set<jf> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jf $$5 : jf.a($$1, 15, $$2, 1)) {
         jf $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jk.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jf $$7 : $$3) {
         $$0.a($$7, dho.bs.n(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
