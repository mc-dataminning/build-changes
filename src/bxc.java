import com.google.common.collect.ImmutableMap;

public class bxc extends bvx<cnc> {
   private final float c;

   public bxc(float $$0) {
      super(ImmutableMap.of(cdi.m, cdj.c, cdi.n, cdj.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arg $$0, cnc $$1) {
      cnp $$2 = $$1.go();
      return $$1.bI() && $$2 != null && !$$1.bi() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.ca != null;
   }

   protected boolean a(arg $$0, cnc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arg $$0, cnc $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      bvg<?> $$3 = $$1.dX();
      $$3.b(cdi.m);
      $$3.b(cdi.n);
   }

   protected void d(arg $$0, cnc $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cnc $$0) {
      bvg<?> $$1 = $$0.dX();
      $$1.a(cdi.m, new cdl(new bwi($$0.go(), false), this.c, 2));
      $$1.a(cdi.n, new bwi($$0.go(), true));
   }
}
