import com.google.common.collect.Lists;
import java.util.List;

public class fdp implements fdr {
   private static final ajh a = new ajh("toast/recipe");
   private static final long d = 5000L;
   private static final vu e = vu.c("recipe.toast.title");
   private static final vu f = vu.c("recipe.toast.description");
   private final List<ctr<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public fdp(ctr<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public fdr.a a(fav $$0, fds $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return fdr.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         ctr<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         cqm $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.H_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? fdr.a.b : fdr.a.a;
      }
   }

   private void a(ctr<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(fds $$0, ctr<?> $$1) {
      fdp $$2 = $$0.a(fdp.class, b);
      if ($$2 == null) {
         $$0.a(new fdp($$1));
      } else {
         $$2.a($$1);
      }
   }
}
