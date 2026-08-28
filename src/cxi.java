import java.util.List;

public class cxi extends ctp {
   public cxi(cvn.a $$0) {
      super($$0);
   }

   @Override
   public cvs v() {
      cvs $$0 = super.v();
      $$0.b(ks.L, new cxr(cxs.C));
      return $$0;
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      cxr $$4 = $$0.a(ks.L);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1.b());
      }
   }

   @Override
   public String d_(cvs $$0) {
      return cxp.a($$0.a(ks.L, cxr.a).e(), this.a() + ".effect.");
   }
}
