import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class btv extends btl {
   private final ToIntFunction<azv> c;

   protected btv(btm $$0, int $$1, ToIntFunction<azv> $$2) {
      super($$0, $$1, ls.V);
      this.c = $$2;
   }

   @Override
   public void a(bve $$0, int $$1, bui.c $$2) {
      if ($$2 == bui.c.a && ($$0 instanceof cor || $$0.dY().ac().b(dfb.c))) {
         this.a($$0.dY(), $$0.eb(), $$0.dy());
      }
   }

   private void a(dff $$0, azv $$1, jh $$2) {
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
         $$0.a($$7, dil.bs.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
