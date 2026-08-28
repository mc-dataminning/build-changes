import java.util.ArrayList;
import java.util.List;

public class fqo implements fqq {
   private static final alz a = alz.b("toast/recipe");
   private static final long e = 5000L;
   private static final xv f = xv.c("recipe.toast.title");
   private static final xv g = xv.c("recipe.toast.description");
   private final List<fqo.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fqq.a k = fqq.a.b;
   private int l;

   private fqo() {
   }

   @Override
   public fqq.a a() {
      return this.k;
   }

   @Override
   public void a(fqr $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fqq.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fqq.a.b : fqq.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fns $$0, fnq $$1, long $$2) {
      $$0.a(glv::C, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fqo.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cxp $$0, cxp $$1) {
      this.h.add(new fqo.a($$0, $$1));
      this.j = true;
   }

   public static void a(fqr $$0, ddj $$1) {
      fqo $$2 = $$0.a(fqo.class, b);
      if ($$2 == null) {
         $$2 = new fqo();
         $$0.a($$2);
      }

      bbp $$3 = ddq.a($$0.c().s);
      cxp $$4 = $$1.e().b($$3);
      cxp $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cxp a, cxp b) {
   }
}
