import java.util.ArrayList;
import java.util.List;

public class fqm implements fqo {
   private static final alz a = alz.b("toast/recipe");
   private static final long e = 5000L;
   private static final xv f = xv.c("recipe.toast.title");
   private static final xv g = xv.c("recipe.toast.description");
   private final List<fqm.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fqo.a k = fqo.a.b;
   private int l;

   private fqm() {
   }

   @Override
   public fqo.a a() {
      return this.k;
   }

   @Override
   public void a(fqp $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fqo.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fqo.a.b : fqo.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fnq $$0, fno $$1, long $$2) {
      $$0.a(glt::B, a, 0, 0, this.b(), this.c());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fqm.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cxo $$0, cxo $$1) {
      this.h.add(new fqm.a($$0, $$1));
      this.j = true;
   }

   public static void a(fqp $$0, ddi $$1) {
      fqm $$2 = $$0.a(fqm.class, b);
      if ($$2 == null) {
         $$2 = new fqm();
         $$0.a($$2);
      }

      bbp $$3 = ddp.a($$0.c().s);
      cxo $$4 = $$1.e().b($$3);
      cxo $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cxo a, cxo b) {
   }
}
