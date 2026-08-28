import java.util.List;

public class cxr extends cuc {
   public cxr(cvx.a $$0) {
      super($$0);
   }

   @Override
   public cwb o() {
      cwb $$0 = super.o();
      $$0.b(ku.Q, new cya(cyb.C));
      return $$0;
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      cya $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xi a(cwb $$0) {
      cya $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }
}
