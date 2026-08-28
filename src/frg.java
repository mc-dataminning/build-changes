import java.util.ArrayList;
import java.util.List;

public class frg extends frf {
   private static final wz a = wz.c("options.skinCustomisation.title");

   public frg(fob $$0, fgq $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fii> $$0 = new ArrayList<>();

      for (cmy $$1 : cmy.values()) {
         $$0.add(fir.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.r.a($$0);
   }
}
