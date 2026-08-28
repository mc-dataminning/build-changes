import java.util.ArrayList;
import java.util.List;

public class fri extends frh {
   private static final wz a = wz.c("options.skinCustomisation.title");

   public fri(fod $$0, fgs $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fik> $$0 = new ArrayList<>();

      for (cmy $$1 : cmy.values()) {
         $$0.add(fit.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.r.a($$0);
   }
}
