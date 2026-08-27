import com.google.common.collect.ImmutableMap;

public class btt<E extends cgp> extends bqa<E> {
   public btt(int $$0) {
      super(ImmutableMap.of(bxl.o, bxm.b, bxl.m, bxm.b), $$0);
   }

   protected boolean a(aow $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(aow $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(aow $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bot.o);
         $$1.a(atl.AQ, 5.0F, 1.0F);
      } else {
         $$1.a(atl.AL, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aow $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(bnq.c.b);
      }
   }
}
