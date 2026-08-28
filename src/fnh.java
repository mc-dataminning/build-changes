import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fnh extends fmw {
   private static final xp a = xp.c("options.skinCustomisation.title");
   @Nullable
   private fic r;

   public fnh(fne $$0, ffk $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fic(this.m, this.n, this.o, this));
      List<fhd> $$0 = new ArrayList<>();

      for (cmz $$1 : cmz.values()) {
         $$0.add(fhm.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
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
