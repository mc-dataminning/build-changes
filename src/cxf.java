import java.util.List;

public class cxf extends ctm {
   public cxf(cvk.a $$0) {
      super($$0);
   }

   @Override
   public cvp v() {
      cvp $$0 = super.v();
      $$0.b(kr.L, new cxo(cxp.C));
      return $$0;
   }

   @Override
   public void a(cvp $$0, cvk.b $$1, List<xd> $$2, cxh $$3) {
      cxo $$4 = $$0.a(kr.L);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String d_(cvp $$0) {
      return cxm.a($$0.a(kr.L, cxo.a).e(), this.a() + ".effect.");
   }
}
