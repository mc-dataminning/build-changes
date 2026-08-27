import java.util.List;
import javax.annotation.Nullable;

public class cvg extends crh {
   public cvg(ctj.a $$0) {
      super($$0);
   }

   @Override
   public cto v() {
      cto $$0 = super.v();
      $$0.b(kb.F, new cvp(cvq.C));
      return $$0;
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      cvp $$4 = $$0.a(kb.F);
      if ($$4 != null) {
         $$4.a($$2::add, 0.125F, $$1 == null ? 20.0F : $$1.s().f());
      }
   }

   @Override
   public String i(cto $$0) {
      return cvn.a($$0.a(kb.F, cvp.a).f(), this.a() + ".effect.");
   }
}
