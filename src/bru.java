import com.google.common.collect.ImmutableMap;

public class bru<E extends cel> extends bob<E> {
   public bru(int $$0) {
      super(ImmutableMap.of(bvm.o, bvn.b, bvm.m, bvn.b), $$0);
   }

   protected boolean a(and $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(and $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(and $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bmw.o);
         $$1.a(arr.AA, 5.0F, 1.0F);
      } else {
         $$1.a(arr.Av, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(and $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(blu.c.b);
      }
   }
}
