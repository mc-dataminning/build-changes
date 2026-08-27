import java.util.List;
import javax.annotation.Nullable;

public class crp extends csu {
   public crp(cre.a $$0) {
      super($$0);
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      cth $$4 = $$0.a(jp.x, cth.a);
      $$4.a($$2::add, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aum.nI, aun.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
