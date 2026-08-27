import com.google.common.collect.ImmutableMap;

public class bnt extends bmp<ccz> {
   private final float c;

   public bnt(float $$0) {
      super(ImmutableMap.of(btz.m, bua.c, btz.n, bua.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ama $$0, ccz $$1) {
      cdm $$2 = $$1.ge();
      return $$1.bv() && $$2 != null && !$$1.aX() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(ama $$0, ccz $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ama $$0, ccz $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      bly<?> $$3 = $$1.dN();
      $$3.b(btz.m);
      $$3.b(btz.n);
   }

   protected void d(ama $$0, ccz $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(ccz $$0) {
      bly<?> $$1 = $$0.dN();
      $$1.a(btz.m, new buc(new bna($$0.ge(), false), this.c, 2));
      $$1.a(btz.n, new bna($$0.ge(), true));
   }
}
