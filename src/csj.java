import java.util.List;
import javax.annotation.Nullable;

public class csj extends ctp {
   public csj(cry.a $$0) {
      super($$0);
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      cuc $$4 = $$0.a(jz.x, cuc.a);
      $$4.a($$2::add, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), auz.nN, ava.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
