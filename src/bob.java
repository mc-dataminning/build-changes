import com.google.common.collect.ImmutableMap;

public class bob extends bmx<cdh> {
   private final float c;

   public bob(float $$0) {
      super(ImmutableMap.of(buh.m, bui.c, buh.n, bui.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ame $$0, cdh $$1) {
      cdu $$2 = $$1.gf();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(ame $$0, cdh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      bmg<?> $$3 = $$1.dP();
      $$3.b(buh.m);
      $$3.b(buh.n);
   }

   protected void d(ame $$0, cdh $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cdh $$0) {
      bmg<?> $$1 = $$0.dP();
      $$1.a(buh.m, new buk(new bni($$0.gf(), false), this.c, 2));
      $$1.a(buh.n, new bni($$0.gf(), true));
   }
}
