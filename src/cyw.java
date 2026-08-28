import java.util.List;

public class cyw extends cvh {
   public cyw(cxc.a $$0) {
      super($$0);
   }

   @Override
   public cxg n() {
      cxg $$0 = super.n();
      $$0.b(ku.Q, new czf(czg.C));
      return $$0;
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      czf $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xk a(cxg $$0) {
      czf $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.l + ".effect.") : super.a($$0);
   }
}
