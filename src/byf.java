import com.google.common.collect.ImmutableMap;

public class byf extends bxa<coi> {
   private final float c;

   public byf(float $$0) {
      super(ImmutableMap.of(cel.m, cem.c, cel.n, cem.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(ard $$0, coi $$1) {
      cox $$2 = $$1.gs();
      return $$1.bL() && $$2 != null && !$$1.bj() && !$$1.T && $$1.g((bul)$$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(ard $$0, coi $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(ard $$0, coi $$1, long $$2) {
      this.a($$1);
   }

   protected void c(ard $$0, coi $$1, long $$2) {
      bwj<?> $$3 = $$1.eb();
      $$3.b(cel.m);
      $$3.b(cel.n);
   }

   protected void d(ard $$0, coi $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(coi $$0) {
      bwj<?> $$1 = $$0.eb();
      $$1.a(cel.m, new ceo(new bxl($$0.gs(), false), this.c, 2));
      $$1.a(cel.n, new bxl($$0.gs(), true));
   }
}
