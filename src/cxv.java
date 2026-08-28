import java.util.List;

public class cxv extends cug {
   public cxv(cwb.a $$0) {
      super($$0);
   }

   @Override
   public cwf o() {
      cwf $$0 = super.o();
      $$0.b(ku.Q, new cye(cyf.C));
      return $$0;
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      cye $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xl a(cwf $$0) {
      cye $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }
}
