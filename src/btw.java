import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class btw extends btm {
   private final ToIntFunction<azg> c;

   protected btw(btn $$0, int $$1, ToIntFunction<azg> $$2) {
      super($$0, $$1, lt.X);
      this.c = $$2;
   }

   @Override
   public void a(arc $$0, bvf $$1, int $$2, buj.d $$3) {
      if ($$3 == buj.d.a && ($$1 instanceof cov || $$0.O().b(dgc.c))) {
         this.a($$0, $$1.dZ(), $$1.dw());
      }
   }

   private void a(arc $$0, azg $$1, ji $$2) {
      Set<ji> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (ji $$5 : ji.a($$1, 15, $$2, 1)) {
         ji $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jn.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (ji $$7 : $$3) {
         $$0.a($$7, djm.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
