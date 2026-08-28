import com.google.common.collect.Lists;
import java.util.List;

public class fjl implements fjn {
   private static final alf a = new alf("toast/recipe");
   private static final long d = 5000L;
   private static final xp e = xp.c("recipe.toast.title");
   private static final xp f = xp.c("recipe.toast.description");
   private final List<cyx<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public fjl(cyx<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public fjn.a a(fgr $$0, fjo $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return fjn.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         cyx<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         cup $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.H_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? fjn.a.b : fjn.a.a;
      }
   }

   private void a(cyx<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(fjo $$0, cyx<?> $$1) {
      fjl $$2 = $$0.a(fjl.class, b);
      if ($$2 == null) {
         $$0.a(new fjl($$1));
      } else {
         $$2.a($$1);
      }
   }
}
