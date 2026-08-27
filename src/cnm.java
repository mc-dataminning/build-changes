import java.util.List;
import javax.annotation.Nullable;

public class cnm extends cot {
   public cnm(cnb.a $$0) {
      super($$0);
   }

   @Override
   public void a(cng $$0, @Nullable ctx $$1, List<vg> $$2, coy $$3) {
      cpg.a($$0, $$2, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), art.ny, aru.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
