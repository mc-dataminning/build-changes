import java.util.List;

public class cyc extends cun {
   public cyc(cwi.a $$0) {
      super($$0);
   }

   @Override
   public cwm o() {
      cwm $$0 = super.o();
      $$0.b(ku.Q, new cyl(cym.C));
      return $$0;
   }

   @Override
   public void a(cwm $$0, cwi.b $$1, List<xj> $$2, cye $$3) {
      cyl $$4 = $$0.a(ku.Q);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public xj a(cwm $$0) {
      cyl $$1 = $$0.a(ku.Q);
      return $$1 != null ? $$1.a(this.k + ".effect.") : super.a($$0);
   }
}
