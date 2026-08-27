import com.google.common.collect.ImmutableMap;

public class btp<E extends cgl> extends bpw<E> {
   public btp(int $$0) {
      super(ImmutableMap.of(bxh.o, bxi.b, bxh.m, bxi.b), $$0);
   }

   protected boolean a(aov $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(aov $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(aov $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bor.o);
         $$1.a(atk.AP, 5.0F, 1.0F);
      } else {
         $$1.a(atk.AK, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aov $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(bno.c.b);
      }
   }
}
