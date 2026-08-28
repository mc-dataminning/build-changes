import java.util.ArrayList;
import java.util.List;

public class ftl extends ftk {
   private static final xe a = xe.c("options.skinCustomisation.title");

   public ftl(fqh $$0, fit $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void m() {
      List<fkm> $$0 = new ArrayList<>();

      for (cny $$1 : cny.values()) {
         $$0.add(fkv.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.w().a(this.c));
      this.d.a($$0);
   }
}
