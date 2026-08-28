import com.google.common.collect.Lists;
import java.util.List;

public class fnh implements fnj {
   private static final alh a = alh.b("toast/recipe");
   private static final long e = 5000L;
   private static final xh f = xh.c("recipe.toast.title");
   private static final xh g = xh.c("recipe.toast.description");
   private final List<fnh.a> h = Lists.newArrayList();
   private long i;
   private boolean j;
   private fnj.a k = fnj.a.b;
   private int l;

   public fnh(cvx $$0, cvx $$1) {
      this.h.add(new fnh.a($$0, $$1));
   }

   @Override
   public fnj.a a() {
      return this.k;
   }

   @Override
   public void a(fnk $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fnj.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fnj.a.b : fnj.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fkm $$0, fkk $$1, long $$2) {
      $$0.a(gig::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fnh.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cvx $$0, cvx $$1) {
      this.h.add(new fnh.a($$0, $$1));
      this.j = true;
   }

   public static void a(fnk $$0, dal<?> $$1) {
      fnh $$2 = $$0.a(fnh.class, b);
      cvx $$3 = $$1.b().g();
      cvx $$4 = $$1.b().a($$0.c().s.H_());
      if ($$2 == null) {
         $$0.a(new fnh($$3, $$4));
      } else {
         $$2.a($$3, $$4);
      }
   }

   static record a(cvx a, cvx b) {
   }
}
