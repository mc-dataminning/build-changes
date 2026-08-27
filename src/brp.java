import com.google.common.collect.ImmutableMap;

public class brp<E extends cef> extends bnw<E> {
   public brp(int $$0) {
      super(ImmutableMap.of(bvh.o, bvi.b, bvh.m, bvi.b), $$0);
   }

   protected boolean a(amz $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(amz $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(amz $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bmr.o);
         $$1.a(arm.AA, 5.0F, 1.0F);
      } else {
         $$1.a(arm.Av, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(amz $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(blp.c.b);
      }
   }
}
