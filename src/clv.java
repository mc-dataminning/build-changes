import javax.annotation.Nullable;

public class clv extends cll {
   private static final bwl bG = bwr.bP.n().a(bwk.a().a(bwj.a, 0.0F, bwr.bP.m() - 0.03125F, 0.0F)).a(0.5F);

   public clv(bwr<? extends clv> $$0, djh $$1) {
      super($$0, $$1);
   }

   public static byo.a q() {
      return gU().a(byp.s, 15.0).a(byp.v, 0.2F);
   }

   public static boolean c(bwr<? extends ciz> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      return !bwq.a($$2) ? ciz.b($$0, $$1, $$2, $$3, $$4) : bwq.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(azv $$0) {
      this.g(byp.o).a(a($$0::j));
   }

   @Override
   protected awm u() {
      return awn.EE;
   }

   @Override
   protected awm l_() {
      return awn.EF;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.EG;
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return bwr.bP.a($$0, bwq.e);
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      return (bug)(!this.gK() ? bug.e : super.b($$0, $$1));
   }

   @Override
   protected void gL() {
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bG : super.e($$0);
   }
}
