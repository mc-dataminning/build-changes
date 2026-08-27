import java.util.function.ToIntFunction;

public class cvx extends cxo implements css, czr {
   private static final dfv b = dfu.C;
   private final cxp c = new cxp(this);

   public cvx(dfd.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dfe> b(int $$0) {
      return $$1 -> cxo.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return !$$1.n().a(cjd.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return hc.a().anyMatch($$3 -> this.c.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      this.c.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return $$0.u().c();
   }

   @Override
   public cxp b() {
      return this.c;
   }
}
