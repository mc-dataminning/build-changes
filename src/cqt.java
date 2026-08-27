import java.util.List;
import javax.annotation.Nullable;

public class cqt extends cmr {
   public cqt(coy.a $$0) {
      super($$0);
   }

   @Override
   public cpd ao_() {
      return crb.a(super.ao_(), crc.E);
   }

   @Override
   public void a(cpd $$0, @Nullable cvr $$1, List<vq> $$2, cqu $$3) {
      crb.a($$0, $$2, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public String j(cpd $$0) {
      return cqz.a(crb.d($$0), this.a() + ".effect.");
   }
}
