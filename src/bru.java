import com.google.common.collect.ImmutableMap;

public class bru extends bqp<chn> {
   private final float c;

   public bru(float $$0) {
      super(ImmutableMap.of(bya.m, byb.c, bya.n, byb.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(apa $$0, chn $$1) {
      cia $$2 = $$1.gl();
      return $$1.bx() && $$2 != null && !$$1.aZ() && !$$1.S && $$1.f($$2) <= 16.0 && $$2.bX != null;
   }

   protected boolean a(apa $$0, chn $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      this.a($$1);
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      bpy<?> $$3 = $$1.dM();
      $$3.b(bya.m);
      $$3.b(bya.n);
   }

   protected void d(apa $$0, chn $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(chn $$0) {
      bpy<?> $$1 = $$0.dM();
      $$1.a(bya.m, new byd(new bra($$0.gl(), false), this.c, 2));
      $$1.a(bya.n, new bra($$0.gl(), true));
   }
}
