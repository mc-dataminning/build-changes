import java.util.List;

public class cvv extends crx {
   public cvv(cty.a $$0) {
      super($$0);
   }

   @Override
   public cud w() {
      cud $$0 = super.w();
      $$0.b(kn.G, new cwe(cwf.C));
      return $$0;
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      cwe $$4 = $$0.a(kn.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String h(cud $$0) {
      return cwc.a($$0.a(kn.G, cwe.a).e(), this.a() + ".effect.");
   }
}
