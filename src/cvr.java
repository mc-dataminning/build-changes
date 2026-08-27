import java.util.function.ToIntFunction;

public class cvr extends cxi implements csm, czl {
   private static final dfp b = dfo.C;
   private final cxj c = new cxj(this);

   public cvr(dex.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dey> b(int $$0) {
      return $$1 -> cxi.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return !$$1.n().a(ciz.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return hb.a().anyMatch($$3 -> this.c.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      this.c.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return $$0.u().c();
   }

   @Override
   public cxj b() {
      return this.c;
   }
}
