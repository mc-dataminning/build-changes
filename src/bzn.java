import com.google.common.collect.ImmutableMap;

public class bzn extends byi<cpu> {
   private final float c;

   public bzn(float $$0) {
      super(ImmutableMap.of(cft.n, cfu.c, cft.o, cfu.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arn $$0, cpu $$1) {
      cqi $$2 = $$1.x();
      return $$1.bK() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.bP != null;
   }

   protected boolean a(arn $$0, cpu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      bxr<?> $$3 = $$1.eb();
      $$3.b(cft.n);
      $$3.b(cft.o);
   }

   protected void d(arn $$0, cpu $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cpu $$0) {
      bxr<?> $$1 = $$0.eb();
      $$1.a(cft.n, new cfw(new byt($$0.x(), false), this.c, 2));
      $$1.a(cft.o, new byt($$0.x(), true));
   }
}
