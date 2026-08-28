import java.util.ArrayList;
import java.util.List;

public class fra implements frc {
   private static final aku a = aku.b("toast/recipe");
   private static final long e = 5000L;
   private static final wo f = wo.c("recipe.toast.title");
   private static final wo g = wo.c("recipe.toast.description");
   private final List<fra.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private frc.a k = frc.a.b;
   private int l;

   private fra() {
   }

   @Override
   public frc.a a() {
      return this.k;
   }

   @Override
   public void a(frd $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = frc.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? frc.a.b : frc.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fod $$0, fob $$1, long $$2) {
      $$0.a(gmh::H, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fra.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cwp $$0, cwp $$1) {
      this.h.add(new fra.a($$0, $$1));
      this.j = true;
   }

   public static void a(frd $$0, dcj $$1) {
      fra $$2 = $$0.a(fra.class, b);
      if ($$2 == null) {
         $$2 = new fra();
         $$0.a($$2);
      }

      bak $$3 = dcq.a($$0.c().s);
      cwp $$4 = $$1.e().b($$3);
      cwp $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cwp a, cwp b) {
   }
}
