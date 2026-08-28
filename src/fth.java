import java.util.ArrayList;
import java.util.List;

public class fth extends ftg {
   private static final xd a = xd.c("options.skinCustomisation.title");

   public fth(fqd $$0, fip $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fki> $$0 = new ArrayList<>();

      for (cnv $$1 : cnv.values()) {
         $$0.add(fkr.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.w().a(this.c));
      this.d.a($$0);
   }
}
