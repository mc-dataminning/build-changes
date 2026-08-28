import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class bvp extends bvf {
   private final ToIntFunction<azv> c;

   protected bvp(bvg $$0, int $$1, ToIntFunction<azv> $$2) {
      super($$0, $$1, lx.Y);
      this.c = $$2;
   }

   @Override
   public void a(arq $$0, bxc $$1, int $$2, bwd.e $$3) {
      if ($$3 == bwd.e.a && ($$1 instanceof cqy || $$0.O().c(dir.c))) {
         this.a($$0, $$1.dY(), $$1.dv());
      }
   }

   private void a(arq $$0, azv $$1, iu $$2) {
      Set<iu> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (iu $$5 : iu.a($$1, 15, $$2, 1)) {
         iu $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, ja.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (iu $$7 : $$3) {
         $$0.a($$7, dmc.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
