import java.util.ArrayList;
import java.util.List;

public class fty implements fua {
   private static final ale a = ale.b("toast/recipe");
   private static final long e = 5000L;
   private static final ww f = ww.c("recipe.toast.title");
   private static final ww g = ww.c("recipe.toast.description");
   private final List<fty.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fua.a k = fua.a.b;
   private int l;

   private fty() {
   }

   @Override
   public fua.a a() {
      return this.k;
   }

   @Override
   public void a(fub $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fua.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fua.a.b : fua.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(frc $$0, fra $$1, long $$2) {
      $$0.a(gpn::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fty.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cys $$0, cys $$1) {
      this.h.add(new fty.a($$0, $$1));
      this.j = true;
   }

   public static void a(fub $$0, dep $$1) {
      fty $$2 = $$0.a(fty.class, b);
      if ($$2 == null) {
         $$2 = new fty();
         $$0.a($$2);
      }

      bax $$3 = dew.a($$0.c().s);
      cys $$4 = $$1.e().b($$3);
      cys $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cys a, cys b) {
   }
}
