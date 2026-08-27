import java.util.List;
import javax.annotation.Nullable;

public class cuo extends cwd {
   public cuo(cuc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      cwr $$4 = $$0.a(ke.E, cwr.a);
      $$4.a($$2::add, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.on, avq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
