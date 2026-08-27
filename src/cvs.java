import java.util.function.ToIntFunction;

public class cvs extends cxj implements csn, czm {
   private static final dfq b = dfp.C;
   private final cxk c = new cxk(this);

   public cvs(dey.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dez> b(int $$0) {
      return $$1 -> cxj.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, clf $$1) {
      return !$$1.n().a(cja.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return ha.a().anyMatch($$3 -> this.c.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      this.c.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dez $$0, cor $$1, gu $$2) {
      return $$0.u().c();
   }

   @Override
   public cxk b() {
      return this.c;
   }
}
