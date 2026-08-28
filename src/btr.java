import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class btr extends bth {
   private final ToIntFunction<azs> c;

   protected btr(bti $$0, int $$1, ToIntFunction<azs> $$2) {
      super($$0, $$1, lr.V);
      this.c = $$2;
   }

   @Override
   public void a(bva $$0, int $$1, bue.c $$2) {
      if ($$2 == bue.c.a && ($$0 instanceof com || $$0.dX().ac().b(dex.c))) {
         this.a($$0.dX(), $$0.ea(), $$0.dx());
      }
   }

   private void a(dfb $$0, azs $$1, jh $$2) {
      Set<jh> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jh $$5 : jh.a($$1, 15, $$2, 1)) {
         jh $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jm.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jh $$7 : $$3) {
         $$0.a($$7, dig.bs.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
