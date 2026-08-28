import com.google.common.collect.ImmutableMap;

public class bye extends bwz<coi> {
   private final float c;

   public bye(float $$0) {
      super(ImmutableMap.of(cek.m, cel.c, cek.n, cel.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arc $$0, coi $$1) {
      cox $$2 = $$1.gp();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g((buk)$$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(arc $$0, coi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arc $$0, coi $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arc $$0, coi $$1, long $$2) {
      bwi<?> $$3 = $$1.ec();
      $$3.b(cek.m);
      $$3.b(cek.n);
   }

   protected void d(arc $$0, coi $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(coi $$0) {
      bwi<?> $$1 = $$0.ec();
      $$1.a(cek.m, new cen(new bxk($$0.gp(), false), this.c, 2));
      $$1.a(cek.n, new bxk($$0.gp(), true));
   }
}
