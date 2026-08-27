import com.google.common.collect.ImmutableMap;

public class btq extends bsl<cjn> {
   private final float c;

   public btq(float $$0) {
      super(ImmutableMap.of(bzw.m, bzx.c, bzw.n, bzx.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(apu $$0, cjn $$1) {
      cka $$2 = $$1.gn();
      return $$1.bA() && $$2 != null && !$$1.bc() && !$$1.T && $$1.g($$2) <= 16.0 && $$2.ca != null;
   }

   protected boolean a(apu $$0, cjn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      this.a($$1);
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      bru<?> $$3 = $$1.dP();
      $$3.b(bzw.m);
      $$3.b(bzw.n);
   }

   protected void d(apu $$0, cjn $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cjn $$0) {
      bru<?> $$1 = $$0.dP();
      $$1.a(bzw.m, new bzz(new bsw($$0.gn(), false), this.c, 2));
      $$1.a(bzw.n, new bsw($$0.gn(), true));
   }
}
