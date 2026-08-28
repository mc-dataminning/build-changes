import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class btm extends btc {
   private final ToIntFunction<azr> c;

   protected btm(btd $$0, int $$1, ToIntFunction<azr> $$2) {
      super($$0, $$1, lq.V);
      this.c = $$2;
   }

   @Override
   public void a(buv $$0, int $$1, btz.c $$2) {
      if ($$2 == btz.c.a && ($$0 instanceof coh || $$0.dX().ac().b(der.c))) {
         this.a($$0.dX(), $$0.ea(), $$0.dx());
      }
   }

   private void a(dev $$0, azr $$1, jg $$2) {
      Set<jg> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jg $$5 : jg.a($$1, 15, $$2, 1)) {
         jg $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jl.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jg $$7 : $$3) {
         $$0.a($$7, dia.bs.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
