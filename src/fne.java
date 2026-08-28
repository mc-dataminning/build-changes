import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fne extends fmt {
   private static final xo a = xo.c("options.skinCustomisation.title");
   @Nullable
   private fhz r;

   public fne(fnb $$0, ffh $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fhz(this.m, this.n, this.o, this));
      List<fha> $$0 = new ArrayList<>();

      for (cmw $$1 : cmw.values()) {
         $$0.add(fhj.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
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
