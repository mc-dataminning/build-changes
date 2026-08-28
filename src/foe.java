import com.google.common.collect.Lists;
import java.util.List;

public class foe implements fog {
   private static final all a = all.b("toast/recipe");
   private static final long e = 5000L;
   private static final xl f = xl.c("recipe.toast.title");
   private static final xl g = xl.c("recipe.toast.description");
   private final List<foe.a> h = Lists.newArrayList();
   private long i;
   private boolean j;
   private fog.a k = fog.a.b;
   private int l;

   public foe(cwf $$0, cwf $$1) {
      this.h.add(new foe.a($$0, $$1));
   }

   @Override
   public fog.a a() {
      return this.k;
   }

   @Override
   public void a(foh $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fog.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fog.a.b : fog.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(flj $$0, flh $$1, long $$2) {
      $$0.a(gjh::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      foe.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cwf $$0, cwf $$1) {
      this.h.add(new foe.a($$0, $$1));
      this.j = true;
   }

   public static void a(foh $$0, dav<?> $$1) {
      foe $$2 = $$0.a(foe.class, b);
      cwf $$3 = $$1.b().g();
      cwf $$4 = $$1.b().a($$0.c().s.H_());
      if ($$2 == null) {
         $$0.a(new foe($$3, $$4));
      } else {
         $$2.a($$3, $$4);
      }
   }

   static record a(cwf a, cwf b) {
   }
}
