import java.util.ArrayList;
import java.util.List;

public class fqg extends fqf {
   private static final wu a = wu.c("options.skinCustomisation.title");

   public fqg(fnd $$0, ffr $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fhk> $$0 = new ArrayList<>();

      for (cmi $$1 : cmi.values()) {
         $$0.add(fht.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.q.a($$0);
   }
}
