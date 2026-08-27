import com.google.common.collect.ImmutableMap;

public class brf<E extends cdv> extends bnm<E> {
   public brf(int $$0) {
      super(ImmutableMap.of(bux.o, buy.b, bux.m, buy.b), $$0);
   }

   protected boolean a(amp $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(amp $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(amp $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bmh.o);
         $$1.a(arc.AA, 5.0F, 1.0F);
      } else {
         $$1.a(arc.Av, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(amp $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(blf.c.b);
      }
   }
}
