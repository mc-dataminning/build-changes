import com.google.common.collect.ImmutableMap;

public class bux extends bts<cku> {
   private final float c;

   public bux(float $$0) {
      super(ImmutableMap.of(cbd.m, cbe.c, cbd.n, cbe.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqh $$0, cku $$1) {
      clh $$2 = $$1.gp();
      return $$1.bB() && $$2 != null && !$$1.bc() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cc != null;
   }

   protected boolean a(aqh $$0, cku $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      btb<?> $$3 = $$1.dQ();
      $$3.b(cbd.m);
      $$3.b(cbd.n);
   }

   protected void d(aqh $$0, cku $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cku $$0) {
      btb<?> $$1 = $$0.dQ();
      $$1.a(cbd.m, new cbg(new bud($$0.gp(), false), this.c, 2));
      $$1.a(cbd.n, new bud($$0.gp(), true));
   }
}
