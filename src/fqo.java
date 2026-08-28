import java.util.ArrayList;
import java.util.List;

public class fqo extends fqn {
   private static final wu a = wu.c("options.skinCustomisation.title");

   public fqo(fnl $$0, fga $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fhs> $$0 = new ArrayList<>();

      for (cmm $$1 : cmm.values()) {
         $$0.add(fib.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.q.a($$0);
   }
}
