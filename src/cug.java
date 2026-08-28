import java.util.List;

public class cug extends cvo {
   public cug(ctv.a $$0) {
      super($$0);
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      cwb $$4 = $$0.a(kn.G, cwb.a);
      $$4.a($$2::add, 0.25F, $$1.b());
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avf.nX, avg.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
