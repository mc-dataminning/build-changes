import com.google.common.collect.Lists;
import java.util.List;

public class fms implements fmu {
   private static final alc a = alc.b("toast/recipe");
   private static final long e = 5000L;
   private static final xd f = xd.c("recipe.toast.title");
   private static final xd g = xd.c("recipe.toast.description");
   private final List<fms.a> h = Lists.newArrayList();
   private long i;
   private boolean j;
   private fmu.a k = fmu.a.b;
   private int l;

   public fms(cvp $$0, cvp $$1) {
      this.h.add(new fms.a($$0, $$1));
   }

   @Override
   public fmu.a a() {
      return this.k;
   }

   @Override
   public void a(fmv $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fmu.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fmu.a.b : fmu.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fjx $$0, fjv $$1, long $$2) {
      $$0.a(ghq::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fms.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cvp $$0, cvp $$1) {
      this.h.add(new fms.a($$0, $$1));
      this.j = true;
   }

   public static void a(fmv $$0, daj<?> $$1) {
      fms $$2 = $$0.a(fms.class, b);
      cvp $$3 = $$1.b().g();
      cvp $$4 = $$1.b().a($$0.c().s.F_());
      if ($$2 == null) {
         $$0.a(new fms($$3, $$4));
      } else {
         $$2.a($$3, $$4);
      }
   }

   static record a(cvp a, cvp b) {
   }
}
