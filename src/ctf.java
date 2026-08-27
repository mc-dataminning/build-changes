import java.util.List;
import javax.annotation.Nullable;

public class ctf extends cul {
   public ctf(csu.a $$0) {
      super($$0);
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      cuy $$4 = $$0.a(ka.E, cuy.a);
      $$4.a($$2::add, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.nN, avd.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
