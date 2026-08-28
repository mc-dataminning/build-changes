import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fnb extends fmq {
   private static final xl a = xl.c("options.skinCustomisation.title");
   @Nullable
   private fhw r;

   public fnb(fmy $$0, ffe $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fhw(this.m, this.n, this.o, this));
      List<fgx> $$0 = new ArrayList<>();

      for (cmt $$1 : cmt.values()) {
         $$0.add(fhg.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
      }

      $$0.add(this.c.v().a(this.c));
      this.r.a($$0);
      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      if (this.r != null) {
         this.r.a(this.n, this.d);
      }
   }
}
