import java.util.ArrayList;
import java.util.List;

public class frc extends frb {
   private static final wy a = wy.c("options.skinCustomisation.title");

   public frc(fnx $$0, fgm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fie> $$0 = new ArrayList<>();

      for (cmw $$1 : cmw.values()) {
         $$0.add(fin.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.q.a($$0);
   }
}
