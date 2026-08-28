import java.util.List;

public class cze extends cvp {
   public cze(cxk.a $$0) {
      super($$0);
   }

   @Override
   public cxo n() {
      cxo $$0 = super.n();
      $$0.b(ku.Q, new czn(czo.C));
      return $$0;
   }

   @Override
   public void a(cxo $$0, cxk.b $$1, List<xv> $$2, czg $$3) {
      czn $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xv a(cxo $$0) {
      czn $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }
}
