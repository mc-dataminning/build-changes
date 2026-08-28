import java.util.ArrayList;
import java.util.List;

public class fqy implements fra {
   private static final aku a = aku.b("toast/recipe");
   private static final long e = 5000L;
   private static final wo f = wo.c("recipe.toast.title");
   private static final wo g = wo.c("recipe.toast.description");
   private final List<fqy.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fra.a k = fra.a.b;
   private int l;

   private fqy() {
   }

   @Override
   public fra.a a() {
      return this.k;
   }

   @Override
   public void a(frb $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fra.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fra.a.b : fra.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fob $$0, fnz $$1, long $$2) {
      $$0.a(gmf::H, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fqy.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cwn $$0, cwn $$1) {
      this.h.add(new fqy.a($$0, $$1));
      this.j = true;
   }

   public static void a(frb $$0, dch $$1) {
      fqy $$2 = $$0.a(fqy.class, b);
      if ($$2 == null) {
         $$2 = new fqy();
         $$0.a($$2);
      }

      baj $$3 = dco.a($$0.c().s);
      cwn $$4 = $$1.e().b($$3);
      cwn $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cwn a, cwn b) {
   }
}
