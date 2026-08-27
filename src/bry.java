import com.google.common.collect.ImmutableMap;

public class bry extends boc<cem> {
   private static final int c = 25;
   private static final int d = 20;

   public bry() {
      super(ImmutableMap.of(bvn.ax, bvo.a, bvn.o, bvo.b, bvn.aE, bvo.c, bvn.aC, bvo.c), cen.b);
   }

   protected void a(and $$0, cem $$1, long $$2) {
      bnl<cem> $$3 = $$1.dO();
      $$3.a(bvn.aC, avs.a, 25L);
      $$3.b(bvn.m);
      bml $$4 = $$1.dO().c(bvn.ax).get();
      boe.a($$1, $$4);
      $$1.b(bmx.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(and $$0, cem $$1, long $$2) {
      return true;
   }

   protected void c(and $$0, cem $$1, long $$2) {
      if (!$$1.dO().a(bvn.aC) && !$$1.dO().a(bvn.aE)) {
         $$1.dO().a(bvn.aE, avs.a, (long)(cen.b - 25));
         $$1.a(ars.AJ, 3.0F, 1.0F);
      }
   }

   protected void d(and $$0, cem $$1, long $$2) {
      if ($$1.c(bmx.l)) {
         $$1.b(bmx.a);
      }

      $$1.dO().c(bvn.ax).ifPresent($$1::j);
      $$1.dO().b(bvn.ax);
   }
}
