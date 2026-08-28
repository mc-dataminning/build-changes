import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class buo extends bue {
   private final ToIntFunction<bac> c;

   protected buo(buf $$0, int $$1, ToIntFunction<bac> $$2) {
      super($$0, $$1, ls.X);
      this.c = $$2;
   }

   @Override
   public void a(arx $$0, bvx $$1, int $$2, bvb.d $$3) {
      if ($$3 == bvb.d.a && ($$1 instanceof cpo || $$0.O().b(dgv.c))) {
         this.a($$0, $$1.dZ(), $$1.dw());
      }
   }

   private void a(arx $$0, bac $$1, jh $$2) {
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
         $$0.a($$7, dkf.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
