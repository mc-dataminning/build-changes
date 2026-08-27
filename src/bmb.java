import com.google.common.collect.ImmutableMap;

public class bmb extends bkx<cbh> {
   private final float c;

   public bmb(float $$0) {
      super(ImmutableMap.of(bsh.m, bsi.c, bsh.n, bsi.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(akr $$0, cbh $$1) {
      cbu $$2 = $$1.gd();
      return $$1.bw() && $$2 != null && !$$1.aY() && !$$1.T && $$1.f($$2) <= 16.0 && $$2.bS != null;
   }

   protected boolean a(akr $$0, cbh $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(akr $$0, cbh $$1, long $$2) {
      this.a($$1);
   }

   protected void c(akr $$0, cbh $$1, long $$2) {
      bkg<?> $$3 = $$1.dN();
      $$3.b(bsh.m);
      $$3.b(bsh.n);
   }

   protected void d(akr $$0, cbh $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(cbh $$0) {
      bkg<?> $$1 = $$0.dN();
      $$1.a(bsh.m, new bsk(new bli($$0.gd(), false), this.c, 2));
      $$1.a(bsh.n, new bli($$0.gd(), true));
   }
}
