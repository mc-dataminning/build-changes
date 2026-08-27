import com.google.common.collect.ImmutableMap;

public class bvz<E extends cix> extends bsg<E> {
   public bvz(int $$0) {
      super(ImmutableMap.of(bzr.o, bzs.b, bzr.m, bzs.b), $$0);
   }

   protected boolean a(aps $$0, E $$1, long $$2) {
      return $$1.dI() == null;
   }

   protected boolean a(aps $$0, E $$1) {
      return $$1.aC() || $$1.bc() || $$1.bq();
   }

   protected void b(aps $$0, E $$1, long $$2) {
      if ($$1.aC()) {
         $$1.b(bqz.o);
         $$1.a(aum.Bo, 5.0F, 1.0F);
      } else {
         $$1.a(aum.Bj, 5.0F, 1.0F);
         this.c($$0, $$1, $$2);
      }
   }

   protected void c(aps $$0, E $$1, long $$2) {
      if ($$1.dI() == null) {
         $$1.a(bpv.c.b);
      }
   }
}
