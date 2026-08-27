import com.google.common.collect.ImmutableMap;

public class brx extends bob<cel> {
   private static final int c = 25;
   private static final int d = 20;

   public brx() {
      super(ImmutableMap.of(bvm.ax, bvn.a, bvm.o, bvn.b, bvm.aE, bvn.c, bvm.aC, bvn.c), cem.b);
   }

   protected void a(and $$0, cel $$1, long $$2) {
      bnk<cel> $$3 = $$1.dO();
      $$3.a(bvm.aC, avr.a, 25L);
      $$3.b(bvm.m);
      bmk $$4 = $$1.dO().c(bvm.ax).get();
      bod.a($$1, $$4);
      $$1.b(bmw.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(and $$0, cel $$1, long $$2) {
      return true;
   }

   protected void c(and $$0, cel $$1, long $$2) {
      if (!$$1.dO().a(bvm.aC) && !$$1.dO().a(bvm.aE)) {
         $$1.dO().a(bvm.aE, avr.a, (long)(cem.b - 25));
         $$1.a(arr.AJ, 3.0F, 1.0F);
      }
   }

   protected void d(and $$0, cel $$1, long $$2) {
      if ($$1.c(bmw.l)) {
         $$1.b(bmw.a);
      }

      $$1.dO().c(bvm.ax).ifPresent($$1::j);
      $$1.dO().b(bvm.ax);
   }
}
