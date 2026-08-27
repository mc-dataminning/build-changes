import com.google.common.collect.ImmutableMap;

public class bqx extends bnc<cdd> {
   private static final int c = 25;
   private static final int d = 20;

   public bqx() {
      super(ImmutableMap.of(bum.ax, bun.a, bum.o, bun.b, bum.aE, bun.c, bum.aC, bun.c), cde.b);
   }

   protected void a(ami $$0, cdd $$1, long $$2) {
      bml<cdd> $$3 = $$1.dP();
      $$3.a(bum.aC, aus.a, 25L);
      $$3.b(bum.m);
      bll $$4 = $$1.dP().c(bum.ax).get();
      bne.a($$1, $$4);
      $$1.b(blx.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ami $$0, cdd $$1, long $$2) {
      return true;
   }

   protected void c(ami $$0, cdd $$1, long $$2) {
      if (!$$1.dP().a(bum.aC) && !$$1.dP().a(bum.aE)) {
         $$1.dP().a(bum.aE, aus.a, (long)(cde.b - 25));
         $$1.a(aqv.Ao, 3.0F, 1.0F);
      }
   }

   protected void d(ami $$0, cdd $$1, long $$2) {
      if ($$1.c(blx.l)) {
         $$1.b(blx.a);
      }

      $$1.dP().c(bum.ax).ifPresent($$1::j);
      $$1.dP().b(bum.ax);
   }
}
