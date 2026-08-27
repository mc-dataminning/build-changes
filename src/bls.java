import com.google.common.collect.ImmutableMap;

public class bls extends bko<cay> {
   private final float c;

   public bls(float $$0) {
      super(ImmutableMap.of(bry.m, brz.c, bry.n, brz.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aki $$0, cay $$1) {
      cbl $$2 = $$1.fZ();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bQ != null;
   }

   protected boolean a(aki $$0, cay $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      bjx<?> $$3 = $$1.dM();
      $$3.b(bry.m);
      $$3.b(bry.n);
   }

   protected void d(aki $$0, cay $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cay $$0) {
      bjx<?> $$1 = $$0.dM();
      $$1.a(bry.m, new bsb(new bkz($$0.fZ(), false), this.c, 2));
      $$1.a(bry.n, new bkz($$0.fZ(), true));
   }
}
