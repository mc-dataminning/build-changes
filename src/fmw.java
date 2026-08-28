import com.google.common.collect.Lists;
import java.util.List;

public class fmw implements fmy {
   private static final ale a = ale.b("toast/recipe");
   private static final long e = 5000L;
   private static final xe f = xe.c("recipe.toast.title");
   private static final xe g = xe.c("recipe.toast.description");
   private final List<fmw.a> h = Lists.newArrayList();
   private long i;
   private boolean j;
   private fmy.a k = fmy.a.b;
   private int l;

   public fmw(cvs $$0, cvs $$1) {
      this.h.add(new fmw.a($$0, $$1));
   }

   @Override
   public fmy.a a() {
      return this.k;
   }

   @Override
   public void a(fmz $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fmy.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fmy.a.b : fmy.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fkb $$0, fjz $$1, long $$2) {
      $$0.a(ghv::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fmw.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cvs $$0, cvs $$1) {
      this.h.add(new fmw.a($$0, $$1));
      this.j = true;
   }

   public static void a(fmz $$0, dam<?> $$1) {
      fmw $$2 = $$0.a(fmw.class, b);
      cvs $$3 = $$1.b().g();
      cvs $$4 = $$1.b().a($$0.c().s.G_());
      if ($$2 == null) {
         $$0.a(new fmw($$3, $$4));
      } else {
         $$2.a($$3, $$4);
      }
   }

   static record a(cvs a, cvs b) {
   }
}
