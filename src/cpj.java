import java.util.List;
import javax.annotation.Nullable;

public class cpj extends cqp {
   public cpj(coy.a $$0) {
      super($$0);
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      crb.a($$0, $$2, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atl.nz, atm.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
