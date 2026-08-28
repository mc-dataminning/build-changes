import java.util.List;

public class cxv extends cyz {
   public cxv(cxg.a $$0) {
      super($$0);
   }

   @Override
   public void a(cxk $$0, cxg.b $$1, List<xv> $$2, czc $$3) {
      czj $$4 = $$0.a(ku.Q, czj.a);
      $$4.a($$2::add, 0.25F, $$1.b());
   }

   @Override
   public bte a(dha $$0, cps $$1, btd $$2) {
      $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), axf.oo, axg.g, 0.5F, 0.4F / ($$0.H_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
