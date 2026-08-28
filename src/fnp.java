import com.google.common.collect.Lists;
import java.util.List;

public class fnp implements fnr {
   private static final ali a = ali.b("toast/recipe");
   private static final long e = 5000L;
   private static final xi f = xi.c("recipe.toast.title");
   private static final xi g = xi.c("recipe.toast.description");
   private final List<fnp.a> h = Lists.newArrayList();
   private long i;
   private boolean j;
   private fnr.a k = fnr.a.b;
   private int l;

   public fnp(cwb $$0, cwb $$1) {
      this.h.add(new fnp.a($$0, $$1));
   }

   @Override
   public fnr.a a() {
      return this.k;
   }

   @Override
   public void a(fns $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fnr.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fnr.a.b : fnr.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fku $$0, fks $$1, long $$2) {
      $$0.a(gir::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fnp.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cwb $$0, cwb $$1) {
      this.h.add(new fnp.a($$0, $$1));
      this.j = true;
   }

   public static void a(fns $$0, dar<?> $$1) {
      fnp $$2 = $$0.a(fnp.class, b);
      cwb $$3 = $$1.b().g();
      cwb $$4 = $$1.b().a($$0.c().s.H_());
      if ($$2 == null) {
         $$0.a(new fnp($$3, $$4));
      } else {
         $$2.a($$3, $$4);
      }
   }

   static record a(cwb a, cwb b) {
   }
}
