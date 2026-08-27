import com.google.common.collect.Lists;
import java.util.List;

public class evp implements evr {
   private static final afw a = new afw("toast/recipe");
   private static final long d = 5000L;
   private static final ui e = ui.c("recipe.toast.title");
   private static final ui f = ui.c("recipe.toast.description");
   private final List<cno<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public evp(cno<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public evr.a a(esy $$0, evs $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return evr.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         cno<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         ckj $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.H_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? evr.a.b : evr.a.a;
      }
   }

   private void a(cno<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(evs $$0, cno<?> $$1) {
      evp $$2 = $$0.a(evp.class, b);
      if ($$2 == null) {
         $$0.a(new evp($$1));
      } else {
         $$2.a($$1);
      }
   }
}
