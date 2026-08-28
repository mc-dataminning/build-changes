import java.util.List;

public class cuj extends cvr {
   public cuj(cty.a $$0) {
      super($$0);
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      cwe $$4 = $$0.a(kn.G, cwe.a);
      $$4.a($$2::add, 0.25F, $$1.b());
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      $$0.a(null, $$1.dw(), $$1.dy(), $$1.dC(), avh.nX, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
