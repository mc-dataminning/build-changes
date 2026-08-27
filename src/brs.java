import com.google.common.collect.ImmutableMap;

public class brs extends bnw<cef> {
   private static final int c = 25;
   private static final int d = 20;

   public brs() {
      super(ImmutableMap.of(bvh.ax, bvi.a, bvh.o, bvi.b, bvh.aE, bvi.c, bvh.aC, bvi.c), ceg.b);
   }

   protected void a(amz $$0, cef $$1, long $$2) {
      bnf<cef> $$3 = $$1.dO();
      $$3.a(bvh.aC, avm.a, 25L);
      $$3.b(bvh.m);
      bmf $$4 = $$1.dO().c(bvh.ax).get();
      bny.a($$1, $$4);
      $$1.b(bmr.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(amz $$0, cef $$1, long $$2) {
      return true;
   }

   protected void c(amz $$0, cef $$1, long $$2) {
      if (!$$1.dO().a(bvh.aC) && !$$1.dO().a(bvh.aE)) {
         $$1.dO().a(bvh.aE, avm.a, (long)(ceg.b - 25));
         $$1.a(arm.AJ, 3.0F, 1.0F);
      }
   }

   protected void d(amz $$0, cef $$1, long $$2) {
      if ($$1.c(bmr.l)) {
         $$1.b(bmr.a);
      }

      $$1.dO().c(bvh.ax).ifPresent($$1::j);
      $$1.dO().b(bvh.ax);
   }
}
