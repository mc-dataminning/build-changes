import java.util.ArrayList;
import java.util.List;

public class fsx extends fsw {
   private static final xd a = xd.c("options.skinCustomisation.title");

   public fsx(fpt $$0, fif $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fjy> $$0 = new ArrayList<>();

      for (cnq $$1 : cnq.values()) {
         $$0.add(fkh.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.w().a(this.c));
      this.d.a($$0);
   }
}
