import com.google.common.collect.Lists;
import java.util.List;

public class exf implements exh {
   private static final agi a = new agi("toast/recipe");
   private static final long d = 5000L;
   private static final ur e = ur.c("recipe.toast.title");
   private static final ur f = ur.c("recipe.toast.description");
   private final List<coq<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public exf(coq<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public exh.a a(euo $$0, exi $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return exh.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         coq<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         clj $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.H_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? exh.a.b : exh.a.a;
      }
   }

   private void a(coq<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(exi $$0, coq<?> $$1) {
      exf $$2 = $$0.a(exf.class, b);
      if ($$2 == null) {
         $$0.a(new exf($$1));
      } else {
         $$2.a($$1);
      }
   }
}
