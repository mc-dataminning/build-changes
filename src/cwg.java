import java.util.List;

public class cwg extends csh {
   public cwg(cuj.a $$0) {
      super($$0);
   }

   @Override
   public cuo w() {
      cuo $$0 = super.w();
      $$0.b(km.G, new cwp(cwq.C));
      return $$0;
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      cwp $$4 = $$0.a(km.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String i(cuo $$0) {
      return cwn.a($$0.a(km.G, cwp.a).e(), this.a() + ".effect.");
   }
}
