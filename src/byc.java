import com.google.common.collect.ImmutableMap;

public class byc extends bwx<coc> {
   private final float c;

   public byc(float $$0) {
      super(ImmutableMap.of(cei.m, cej.c, cei.n, cej.c), Integer.MAX_VALUE);
      this.c = $$0;
   }

   protected boolean a(arq $$0, coc $$1) {
      cor $$2 = $$1.gv();
      return $$1.bN() && $$2 != null && !$$1.bl() && !$$1.U && $$1.g($$2) <= 16.0 && $$2.cd != null;
   }

   protected boolean a(arq $$0, coc $$1, long $$2) {
      return this.a($$0, $$1);
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      this.a($$1);
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      bwg<?> $$3 = $$1.ee();
      $$3.b(cei.m);
      $$3.b(cei.n);
   }

   protected void d(arq $$0, coc $$1, long $$2) {
      this.a($$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   private void a(coc $$0) {
      bwg<?> $$1 = $$0.ee();
      $$1.a(cei.m, new cel(new bxi($$0.gv(), false), this.c, 2));
      $$1.a(cei.n, new bxi($$0.gv(), true));
   }
}
