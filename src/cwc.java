import java.util.List;

public class cwc extends csd {
   public cwc(cuf.a $$0) {
      super($$0);
   }

   @Override
   public cuk w() {
      cuk $$0 = super.w();
      $$0.b(km.F, new cwl(cwm.C));
      return $$0;
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      cwl $$4 = $$0.a(km.F);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String i(cuk $$0) {
      return cwj.a($$0.a(km.F, cwl.a).e(), this.a() + ".effect.");
   }
}
