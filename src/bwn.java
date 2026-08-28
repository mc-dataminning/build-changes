import com.google.common.collect.ImmutableMap;

public class bwn extends bvi<cmk> {
   private final float c;

   public bwn(float $$0) {
      super(ImmutableMap.of(cct.m, ccu.c, cct.n, ccu.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arf $$0, cmk $$1) {
      cmx $$2 = $$1.gq();
      return $$1.bD() && $$2 != null && !$$1.be() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cb != null;
   }

   protected boolean a(arf $$0, cmk $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arf $$0, cmk $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arf $$0, cmk $$1, long $$2) {
      bur<?> $$3 = $$1.dS();
      $$3.b(cct.m);
      $$3.b(cct.n);
   }

   protected void d(arf $$0, cmk $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cmk $$0) {
      bur<?> $$1 = $$0.dS();
      $$1.a(cct.m, new ccw(new bvt($$0.gq(), false), this.c, 2));
      $$1.a(cct.n, new bvt($$0.gq(), true));
   }
}
