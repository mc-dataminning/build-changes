import java.util.List;
import javax.annotation.Nullable;

public class cne extends cok {
   public cne(cmt.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmy $$0, @Nullable ctp $$1, List<vf> $$2, coq $$3) {
      coy.a($$0, $$2, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bkc<cmy> a(ctp $$0, cfi $$1, bka $$2) {
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), ars.nj, art.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
