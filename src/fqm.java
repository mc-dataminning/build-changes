import java.util.ArrayList;
import java.util.List;

public class fqm extends fql {
   private static final wu a = wu.c("options.skinCustomisation.title");

   public fqm(fnj $$0, ffx $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fhq> $$0 = new ArrayList<>();

      for (cml $$1 : cml.values()) {
         $$0.add(fhz.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.q.a($$0);
   }
}
