import java.util.ArrayList;
import java.util.List;

public class fqh implements fqj {
   private static final alz a = alz.b("toast/recipe");
   private static final long e = 5000L;
   private static final xv f = xv.c("recipe.toast.title");
   private static final xv g = xv.c("recipe.toast.description");
   private final List<fqh.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fqj.a k = fqj.a.b;
   private int l;

   private fqh() {
   }

   @Override
   public fqj.a a() {
      return this.k;
   }

   @Override
   public void a(fqk $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fqj.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fqj.a.b : fqj.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fnl $$0, fnj $$1, long $$2) {
      $$0.a(glo::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fqh.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cxk $$0, cxk $$1) {
      this.h.add(new fqh.a($$0, $$1));
      this.j = true;
   }

   public static void a(fqk $$0, ddc $$1) {
      fqh $$2 = $$0.a(fqh.class, b);
      if ($$2 == null) {
         $$2 = new fqh();
         $$0.a($$2);
      }

      ddi.f $$3 = ddi.f.a($$0.c().s);
      cxk $$4 = $$1.e().b($$3);
      cxk $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cxk a, cxk b) {
   }
}
