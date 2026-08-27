import java.util.function.ToIntFunction;

public class cwc extends cxt implements csx, czw {
   private static final dga b = dfz.C;
   private final cxu c = new cxu(this);

   public cwc(dfi.d $$0) {
      super($$0);
      this.k(this.n().a(b, Boolean.valueOf(false)));
   }

   public static ToIntFunction<dfj> b(int $$0) {
      return $$1 -> cxt.n($$1) ? $$0 : 0;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      super.a($$0);
      $$0.a(b);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      return !$$1.n().a(cji.fA) || super.a($$0, $$1);
   }

   @Override
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return ha.a().anyMatch($$3 -> this.c.a($$2, $$0, $$1, $$3.g()));
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return true;
   }

   @Override
   public void a(akq $$0, asc $$1, gw $$2, dfj $$3) {
      this.c.a($$3, $$0, $$2, $$1);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(b) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return $$0.u().c();
   }

   @Override
   public cxu b() {
      return this.c;
   }
}
