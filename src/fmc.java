import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fmc extends flr {
   private static final wx a = wx.c("options.skinCustomisation.title");
   @Nullable
   private fgx r;

   public fmc(flz $$0, fef $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      this.r = this.c(new fgx(this.m, this.n, this.o, this));
      List<ffy> $$0 = new ArrayList<>();

      for (clz $$1 : clz.values()) {
         $$0.add(fgh.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
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
