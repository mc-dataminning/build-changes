import java.util.List;
import javax.annotation.Nullable;

public class cqs extends cry {
   public cqs(cqh.a $$0) {
      super($$0);
   }

   @Override
   public void a(cqm $$0, @Nullable cxb $$1, List<vu> $$2, csd $$3) {
      csl.a($$0, $$2, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bne<cqm> a(cxb $$0, ciu $$1, bnc $$2) {
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.nG, atz.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
