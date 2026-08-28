import java.util.List;

public class cwl extends csj {
   public cwl(cul.a $$0) {
      super($$0);
   }

   @Override
   public cuq w() {
      cuq $$0 = super.w();
      $$0.b(kq.G, new cwu(cwv.C));
      return $$0;
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      cwu $$4 = $$0.a(kq.G);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String h(cuq $$0) {
      return cws.a($$0.a(kq.G, cwu.a).e(), this.a() + ".effect.");
   }
}
