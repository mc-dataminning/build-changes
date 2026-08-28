import com.google.common.collect.ImmutableMap;

public class bxk extends bwf<cnk> {
   private final float c;

   public bxk(float $$0) {
      super(ImmutableMap.of(cdq.m, cdr.c, cdq.n, cdr.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arj $$0, cnk $$1) {
      cnx $$2 = $$1.go();
      return $$1.bI() && $$2 != null && !$$1.bi() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.bZ != null;
   }

   protected boolean a(arj $$0, cnk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      bvo<?> $$3 = $$1.dY();
      $$3.b(cdq.m);
      $$3.b(cdq.n);
   }

   protected void d(arj $$0, cnk $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cnk $$0) {
      bvo<?> $$1 = $$0.dY();
      $$1.a(cdq.m, new cdt(new bwq($$0.go(), false), this.c, 2));
      $$1.a(cdq.n, new bwq($$0.go(), true));
   }
}
