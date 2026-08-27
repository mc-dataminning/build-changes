import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fmb extends flq {
   private static final wx a = wx.c("options.skinCustomisation.title");
   @Nullable
   private fgw r;

   public fmb(fly $$0, fed $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aM_() {
      this.r = this.c(new fgw(this.m, this.n, this.o, this));
      List<ffx> $$0 = new ArrayList<>();

      for (clx $$1 : clx.values()) {
         $$0.add(fgg.b(this.c.a($$1)).a($$1.d(), ($$1x, $$2) -> this.c.a($$1, $$2)));
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
