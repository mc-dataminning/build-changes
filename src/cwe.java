import java.util.function.ToIntFunction;

public class cwe extends cxv implements csz, czy {
   private static final dgc b = dgb.C;
   private final cxw c = new cxw(this);

   public cwe(dfk.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dfl> b(int $$0) {
      return $$1 -> cxv.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, clp $$1) {
      return !$$1.n().a(cjk.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return hc.a().anyMatch($$3 -> this.c.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      this.c.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return $$0.u().c();
   }

   @Override
   public cxw b() {
      return this.c;
   }
}
