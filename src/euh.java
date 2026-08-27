import com.google.common.collect.Lists;
import java.util.List;

public class euh implements euj {
   private static final aep a = new aep("toast/recipe");
   private static final long d = 5000L;
   private static final te e = te.c("recipe.toast.title");
   private static final te f = te.c("recipe.toast.description");
   private final List<clz<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public euh(clz<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public euj.a a(erx $$0, euk $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return euj.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         clz<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         ciw $$4 = $$3.h();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.a($$1.b().s.B_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? euj.a.b : euj.a.a;
      }
   }

   private void a(clz<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(euk $$0, clz<?> $$1) {
      euh $$2 = $$0.a(euh.class, b);
      if ($$2 == null) {
         $$0.a(new euh($$1));
      } else {
         $$2.a($$1);
      }
   }
}
