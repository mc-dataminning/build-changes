import java.util.List;

public class cxd extends ctg {
   public cxd(cvg.a $$0) {
      super($$0);
   }

   @Override
   public cvl w() {
      cvl $$0 = super.w();
      $$0.b(kr.I, new cxn(cxo.C));
      return $$0;
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      cxn $$4 = $$0.a(kr.I);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String d_(cvl $$0) {
      return cxl.a($$0.a(kr.I, cxn.a).e(), this.a() + ".effect.");
   }
}
