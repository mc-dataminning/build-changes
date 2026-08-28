import java.util.ArrayList;
import java.util.List;

public class fsv implements fsx {
   private static final ald a = ald.b("toast/recipe");
   private static final long e = 5000L;
   private static final wv f = wv.c("recipe.toast.title");
   private static final wv g = wv.c("recipe.toast.description");
   private final List<fsv.a> h = new ArrayList<>();
   private long i;
   private boolean j;
   private fsx.a k = fsx.a.b;
   private int l;

   private fsv() {
   }

   @Override
   public fsx.a a() {
      return this.k;
   }

   @Override
   public void a(fsy $$0, long $$1) {
      if (this.j) {
         this.i = $$1;
         this.j = false;
      }

      if (this.h.isEmpty()) {
         this.k = fsx.a.b;
      } else {
         this.k = (double)($$1 - this.i) >= 5000.0 * $$0.d() ? fsx.a.b : fsx.a.a;
      }

      this.l = (int)((double)$$1 / Math.max(1.0, 5000.0 * $$0.d() / (double)this.h.size()) % (double)this.h.size());
   }

   @Override
   public void a(fpz $$0, fpx $$1, long $$2) {
      $$0.a(goi::H, a, 0, 0, this.c(), this.d());
      $$0.a($$1, f, 30, 7, -11534256, false);
      $$0.a($$1, g, 30, 18, -16777216, false);
      fsv.a $$3 = this.h.get(this.l);
      $$0.c().a();
      $$0.c().b(0.6F, 0.6F, 1.0F);
      $$0.b($$3.a(), 3, 3);
      $$0.c().b();
      $$0.b($$3.b(), 8, 8);
   }

   private void a(cxy $$0, cxy $$1) {
      this.h.add(new fsv.a($$0, $$1));
      this.j = true;
   }

   public static void a(fsy $$0, ddr $$1) {
      fsv $$2 = $$0.a(fsv.class, b);
      if ($$2 == null) {
         $$2 = new fsv();
         $$0.a($$2);
      }

      bav $$3 = ddy.a($$0.c().s);
      cxy $$4 = $$1.e().b($$3);
      cxy $$5 = $$1.d().b($$3);
      $$2.a($$4, $$5);
   }

   static record a(cxy a, cxy b) {
   }
}
