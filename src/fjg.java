import com.google.common.collect.Lists;
import java.util.List;

public class fjg implements fji {
   private static final alb a = new alb("toast/recipe");
   private static final long d = 5000L;
   private static final xl e = xl.c("recipe.toast.title");
   private static final xl f = xl.c("recipe.toast.description");
   private final List<cys<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public fjg(cys<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public fji.a a(fgm $$0, fjj $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return fji.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         cys<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         cuk $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.H_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? fji.a.b : fji.a.a;
      }
   }

   private void a(cys<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(fjj $$0, cys<?> $$1) {
      fjg $$2 = $$0.a(fjg.class, b);
      if ($$2 == null) {
         $$0.a(new fjg($$1));
      } else {
         $$2.a($$1);
      }
   }
}
