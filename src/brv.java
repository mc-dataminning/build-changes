import com.google.common.collect.ImmutableMap;

public class brv<E extends cem> extends boc<E> {
   public brv(int $$0) {
      super(ImmutableMap.of(bvn.o, bvo.b, bvn.m, bvo.b), $$0);
   }

   protected boolean a(and $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(and $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(and $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bmx.o);
         $$1.a(ars.AA, 5.0F, 1.0F);
      } else {
         $$1.a(ars.Av, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(and $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(blv.c.b);
      }
   }
}
