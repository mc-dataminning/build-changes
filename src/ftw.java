import java.util.ArrayList;
import java.util.List;

public class ftw extends ftv {
   private static final xh a = xh.c("options.skinCustomisation.title");

   public ftw(fqs $$0, fje $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fkx> $$0 = new ArrayList<>();

      for (coi $$1 : coi.values()) {
         $$0.add(flg.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.w().a(this.c));
      this.d.a($$0);
   }
}
