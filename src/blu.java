import com.google.common.collect.ImmutableMap;

public class blu extends bkq<cba> {
   private final float c;

   public blu(float $$0) {
      super(ImmutableMap.of(bsa.m, bsb.c, bsa.n, bsb.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(akk $$0, cba $$1) {
      cbn $$2 = $$1.fZ();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bQ != null;
   }

   protected boolean a(akk $$0, cba $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akk $$0, cba $$1, long $$2) {
      this.a($$1);
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      bjz<?> $$3 = $$1.dM();
      $$3.b(bsa.m);
      $$3.b(bsa.n);
   }

   protected void d(akk $$0, cba $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cba $$0) {
      bjz<?> $$1 = $$0.dM();
      $$1.a(bsa.m, new bsd(new blb($$0.fZ(), false), this.c, 2));
      $$1.a(bsa.n, new blb($$0.fZ(), true));
   }
}
