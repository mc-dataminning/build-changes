import com.google.common.collect.Lists;
import java.util.List;

public class fig implements fii {
   private static final akm a = new akm("toast/recipe");
   private static final long d = 5000L;
   private static final wx e = wx.c("recipe.toast.title");
   private static final wx f = wx.c("recipe.toast.description");
   private final List<cxw<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public fig(cxw<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public fii.a a(ffm $$0, fij $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return fii.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         cxw<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         cto $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.H_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? fii.a.b : fii.a.a;
      }
   }

   private void a(cxw<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(fij $$0, cxw<?> $$1) {
      fig $$2 = $$0.a(fig.class, b);
      if ($$2 == null) {
         $$0.a(new fig($$1));
      } else {
         $$2.a($$1);
      }
   }
}
