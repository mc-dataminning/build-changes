import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bty extends bto {
   private final ToIntFunction<azh> c;

   protected bty(btp $$0, int $$1, ToIntFunction<azh> $$2) {
      super($$0, $$1, lt.X);
      this.c = $$2;
   }

   @Override
   public void a(ard $$0, bvh $$1, int $$2, bul.d $$3) {
      if ($$3 == bul.d.a && ($$1 instanceof cox || $$0.O().b(dge.c))) {
         this.a($$0, $$1.dY(), $$1.dv());
      }
   }

   private void a(ard $$0, azh $$1, ji $$2) {
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
         $$0.a($$7, djo.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
