import java.util.ArrayList;
import java.util.List;

public class frc implements fre {
   private static final akv a = akv.b("toast/recipe");
   private static final long e = 5000L;
   private static final wp f = wp.c("recipe.toast.title");
   private static final wp g = wp.c("recipe.toast.description");
   private final List<frc.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fre.a k = fre.a.b;
   private int l;

   private frc() {
   }

   @Override
   public fre.a a() {
      return this.k;
   }

   @Override
   public void a(frf $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fre.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fre.a.b : fre.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fof $$0, fod $$1, long $$2) {
      $$0.a(gmj::H, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      frc.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cwq $$0, cwq $$1) {
      this.h.add(new frc.a($$0, $$1));
      this.j = true;
   }

   public static void a(frf $$0, dck $$1) {
      frc $$2 = $$0.a(frc.class, b);
      if ($$2 == null) {
         $$2 = new frc();
         $$0.a($$2);
      }

      bak $$3 = dcr.a($$0.c().s);
      cwq $$4 = $$1.e().b($$3);
      cwq $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cwq a, cwq b) {
   }
}
