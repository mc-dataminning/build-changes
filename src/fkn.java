import com.google.common.collect.Lists;
import java.util.List;

public class fkn implements fkp {
   private static final akq a = akq.b("toast/recipe");
   private static final long d = 5000L;
   private static final wy e = wy.c("recipe.toast.title");
   private static final wy f = wy.c("recipe.toast.description");
   private final List<cyz<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public fkn(cyz<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public fkp.a a(fht $$0, fkq $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return fkp.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         cyz<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         cuo $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.H_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? fkp.a.b : fkp.a.a;
      }
   }

   private void a(cyz<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(fkq $$0, cyz<?> $$1) {
      fkn $$2 = $$0.a(fkn.class, b);
      if ($$2 == null) {
         $$0.a(new fkn($$1));
      } else {
         $$2.a($$1);
      }
   }
}
