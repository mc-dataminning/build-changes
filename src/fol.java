import com.google.common.collect.Lists;
import java.util.List;

public class fol implements fon {
   private static final alj a = alj.b("toast/recipe");
   private static final long e = 5000L;
   private static final xj f = xj.c("recipe.toast.title");
   private static final xj g = xj.c("recipe.toast.description");
   private final List<fol.a> h = Lists.newArrayList();
   private long i;
   private boolean j;
   private fon.a k = fon.a.b;
   private int l;

   public fol(cwm $$0, cwm $$1) {
      this.h.add(new fol.a($$0, $$1));
   }

   @Override
   public fon.a a() {
      return this.k;
   }

   @Override
   public void a(foo $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fon.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fon.a.b : fon.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(flq $$0, flo $$1, long $$2) {
      $$0.a(gjq::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fol.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cwm $$0, cwm $$1) {
      this.h.add(new fol.a($$0, $$1));
      this.j = true;
   }

   public static void a(foo $$0, dbc<?> $$1) {
      fol $$2 = $$0.a(fol.class, b);
      cwm $$3 = $$1.b().g();
      cwm $$4 = $$1.b().a($$0.c().s.J_());
      if ($$2 == null) {
         $$0.a(new fol($$3, $$4));
      } else {
         $$2.a($$3, $$4);
      }
   }

   static record a(cwm a, cwm b) {
   }
}
