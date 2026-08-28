import java.util.ArrayList;
import java.util.List;

public class fue extends fud {
   private static final xi a = xi.c("options.skinCustomisation.title");

   public fue(fra $$0, fjm $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<flf> $$0 = new ArrayList<>();

      for (coo $$1 : coo.values()) {
         $$0.add(flo.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.w().a(this.c));
      this.d.a($$0);
   }
}
