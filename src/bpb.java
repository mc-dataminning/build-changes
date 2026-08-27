import com.google.common.collect.ImmutableMap;

public class bpb extends bnw<ceo> {
   private final float c;

   public bpb(float $$0) {
      super(ImmutableMap.of(bvh.m, bvi.c, bvh.n, bvi.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(amz $$0, ceo $$1) {
      cfb $$2 = $$1.ge();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(amz $$0, ceo $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(amz $$0, ceo $$1, long $$2) {
      this.a($$1);
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      bnf<?> $$3 = $$1.dO();
      $$3.b(bvh.m);
      $$3.b(bvh.n);
   }

   protected void d(amz $$0, ceo $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(ceo $$0) {
      bnf<?> $$1 = $$0.dO();
      $$1.a(bvh.m, new bvk(new boh($$0.ge(), false), this.c, 2));
      $$1.a(bvh.n, new boh($$0.ge(), true));
   }
}
