import java.util.List;
import javax.annotation.Nullable;

public class cpw extends crc {
   public cpw(cpl.a $$0) {
      super($$0);
   }

   @Override
   public void a(cpq $$0, @Nullable cwe $$1, List<vs> $$2, crh $$3) {
      cro.a($$0, $$2, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      $$0.a(null, $$1.do(), $$1.dq(), $$1.du(), atp.nz, atq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
