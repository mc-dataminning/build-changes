import java.util.List;
import javax.annotation.Nullable;

public class ctu extends cvc {
   public ctu(ctj.a $$0) {
      super($$0);
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      cvp $$4 = $$0.a(kb.F, cvp.a);
      $$4.a($$2::add, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avh.nX, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
