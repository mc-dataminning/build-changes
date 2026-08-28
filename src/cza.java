import java.util.List;

public class cza extends cvl {
   public cza(cxg.a $$0) {
      super($$0);
   }

   @Override
   public cxk n() {
      cxk $$0 = super.n();
      $$0.b(ku.Q, new czj(czk.C));
      return $$0;
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      czj $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xv a(cxk $$0) {
      czj $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }
}
