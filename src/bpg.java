import com.google.common.collect.ImmutableMap;

public class bpg extends bob<ceu> {
   private final float c;

   public bpg(float $$0) {
      super(ImmutableMap.of(bvm.m, bvn.c, bvm.n, bvn.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(and $$0, ceu $$1) {
      cfh $$2 = $$1.ge();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(and $$0, ceu $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(and $$0, ceu $$1, long $$2) {
      this.a($$1);
   }

   protected void c(and $$0, ceu $$1, long $$2) {
      bnk<?> $$3 = $$1.dO();
      $$3.b(bvm.m);
      $$3.b(bvm.n);
   }

   protected void d(and $$0, ceu $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(ceu $$0) {
      bnk<?> $$1 = $$0.dO();
      $$1.a(bvm.m, new bvp(new bom($$0.ge(), false), this.c, 2));
      $$1.a(bvm.n, new bom($$0.ge(), true));
   }
}
