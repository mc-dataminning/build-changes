import com.google.common.collect.ImmutableMap;

public class bvl extends bug<cll> {
   private final float c;

   public bvl(float $$0) {
      super(ImmutableMap.of(cbr.m, cbs.c, cbr.n, cbs.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(aqt $$0, cll $$1) {
      cly $$2 = $$1.gy();
      return $$1.bI() && $$2 != null && !$$1.bi() && !$$1.V && $$1.g($$2) <= 16.0 && $$2.cq != null;
   }

   protected boolean a(aqt $$0, cll $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      this.a($$1);
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      btp<?> $$3 = $$1.dZ();
      $$3.b(cbr.m);
      $$3.b(cbr.n);
   }

   protected void d(aqt $$0, cll $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cll $$0) {
      btp<?> $$1 = $$0.dZ();
      $$1.a(cbr.m, new cbu(new bur($$0.gy(), false), this.c, 2));
      $$1.a(cbr.n, new bur($$0.gy(), true));
   }
}
