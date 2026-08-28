import java.util.ArrayList;
import java.util.List;

public class fry implements fsa {
   private static final aku a = aku.b("toast/recipe");
   private static final long e = 5000L;
   private static final wp f = wp.c("recipe.toast.title");
   private static final wp g = wp.c("recipe.toast.description");
   private final List<fry.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fsa.a k = fsa.a.b;
   private int l;

   private fry() {
   }

   @Override
   public fsa.a a() {
      return this.k;
   }

   @Override
   public void a(fsb $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fsa.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fsa.a.b : fsa.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fpc $$0, fpa $$1, long $$2) {
      $$0.a(gnh::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fry.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cxh $$0, cxh $$1) {
      this.h.add(new fry.a($$0, $$1));
      this.j = true;
   }

   public static void a(fsb $$0, ddb $$1) {
      fry $$2 = $$0.a(fry.class, b);
      if ($$2 == null) {
         $$2 = new fry();
         $$0.a($$2);
      }

      bak $$3 = ddi.a($$0.c().s);
      cxh $$4 = $$1.e().b($$3);
      cxh $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cxh a, cxh b) {
   }
}
