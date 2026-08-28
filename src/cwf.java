import java.util.List;

public class cwf extends csg {
   public cwf(cui.a $$0) {
      super($$0);
   }

   @Override
   public cun w() {
      cun $$0 = super.w();
      $$0.b(km.F, new cwo(cwp.C));
      return $$0;
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      cwo $$4 = $$0.a(km.F);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String i(cun $$0) {
      return cwm.a($$0.a(km.F, cwo.a).e(), this.a() + ".effect.");
   }
}
