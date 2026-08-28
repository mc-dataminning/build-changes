import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fni extends fmx {
   private static final xp a = xp.c("options.skinCustomisation.title");
   @Nullable
   private fid r;

   public fni(fnf $$0, ffl $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fid(this.m, this.n, this.o, this));
      List<fhe> $$0 = new ArrayList<>();

      for (cna $$1 : cna.values()) {
         $$0.add(fhn.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
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
