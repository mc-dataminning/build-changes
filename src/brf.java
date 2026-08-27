import com.google.common.collect.ImmutableMap;

public class brf extends bqa<cgy> {
   private final float c;

   public brf(float $$0) {
      super(ImmutableMap.of(bxl.m, bxm.c, bxl.n, bxm.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aow $$0, cgy $$1) {
      chl $$2 = $$1.gg();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.S && $$1.f($$2) <= 16.0 && $$2.bW != null;
   }

   protected boolean a(aow $$0, cgy $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aow $$0, cgy $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      bpj<?> $$3 = $$1.dO();
      $$3.b(bxl.m);
      $$3.b(bxl.n);
   }

   protected void d(aow $$0, cgy $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cgy $$0) {
      bpj<?> $$1 = $$0.dO();
      $$1.a(bxl.m, new bxo(new bql($$0.gg(), false), this.c, 2));
      $$1.a(bxl.n, new bql($$0.gg(), true));
   }
}
