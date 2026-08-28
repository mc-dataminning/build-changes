import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fng extends fmv {
   private static final xp a = xp.c("options.skinCustomisation.title");
   @Nullable
   private fib r;

   public fng(fnd $$0, ffj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fib(this.m, this.n, this.o, this));
      List<fhc> $$0 = new ArrayList<>();

      for (cmy $$1 : cmy.values()) {
         $$0.add(fhl.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
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
