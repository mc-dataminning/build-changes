import com.google.common.collect.ImmutableMap;

public class bub extends bsw<cjy> {
   private final float c;

   public bub(float $$0) {
      super(ImmutableMap.of(cah.m, cai.c, cah.n, cai.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqe $$0, cjy $$1) {
      ckl $$2 = $$1.gp();
      return $$1.bB() && $$2 != null && !$$1.bc() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cc != null;
   }

   protected boolean a(aqe $$0, cjy $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      bsf<?> $$3 = $$1.dQ();
      $$3.b(cah.m);
      $$3.b(cah.n);
   }

   protected void d(aqe $$0, cjy $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cjy $$0) {
      bsf<?> $$1 = $$0.dQ();
      $$1.a(cah.m, new cak(new bth($$0.gp(), false), this.c, 2));
      $$1.a(cah.n, new bth($$0.gp(), true));
   }
}
