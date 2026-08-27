import java.util.List;
import javax.annotation.Nullable;

public class cnd extends coj {
   public cnd(cms.a $$0) {
      super($$0);
   }

   @Override
   public void a(cmx $$0, @Nullable cto $$1, List<vf> $$2, cop $$3) {
      cox.a($$0, $$2, 0.25F, $$1 == null ? 20.0F : $$1.s().f());
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arr.nj, ars.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
      return super.a($$0, $$1, $$2);
   }
}
