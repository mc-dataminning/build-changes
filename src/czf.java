import java.util.List;

public class czf extends cvq {
   public czf(cxl.a $$0) {
      super($$0);
   }

   @Override
   public cxp n() {
      cxp $$0 = super.n();
      $$0.b(ku.Q, new czo(czp.C));
      return $$0;
   }

   @Override
   public void a(cxp $$0, cxl.b $$1, List<xv> $$2, czh $$3) {
      czo $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xv a(cxp $$0) {
      czo $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }
}
