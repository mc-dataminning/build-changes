import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fkw extends fkl {
   private static final ws a = ws.c("options.skinCustomisation.title");
   @Nullable
   private ffr r;

   public fkw(fkt $$0, fcy $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new ffr(this.m, this.n, this.o, this));
      List<fes> $$0 = new ArrayList<>();

      for (ckm $$1 : ckm.values()) {
         $$0.add(ffb.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.r.a($$0);
      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      if (this.r != null) {
         this.r.a(this.n, this.d);
      }
   }
}
