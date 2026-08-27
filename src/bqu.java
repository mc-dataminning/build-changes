import com.google.common.collect.ImmutableMap;

public class bqu<E extends cdd> extends bnc<E> {
   public bqu(int $$0) {
      super(ImmutableMap.of(bum.o, bun.b, bum.m, bun.b), $$0);
   }

   protected boolean a(ami $$0, E $$1, long $$2) {
      return $$1.dJ() == null;
   }

   protected boolean a(ami $$0, E $$1) {
      return $$1.aC() || $$1.aZ() || $$1.bn();
   }

   protected void b(ami $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(blx.o);
         $$1.a(aqv.Af, 5.0F, 1.0F);
      } else {
         $$1.a(aqv.Aa, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(ami $$0, E $$1, long $$2) {
      if ($$1.dJ() == null) {
         $$1.a(bkv.c.b);
      }
   }
}
