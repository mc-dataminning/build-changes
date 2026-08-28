import java.util.List;

public class cwi extends csj {
   public cwi(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq w() {
      cuq $$0 = super.w();
      $$0.b(km.G, new cwr(cws.C));
      return $$0;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<xp> $$2, cwj $$3) {
      cwr $$4 = $$0.a(km.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String i(cuq $$0) {
      return cwp.a($$0.a(km.G, cwr.a).e(), this.a() + ".effect.");
   }
}
