import com.google.common.collect.Lists;
import java.util.List;

public class ere implements erg {
   private static final long a = 5000L;
   private static final sw e = sw.c("recipe.toast.title");
   private static final sw f = sw.c("recipe.toast.description");
   private final List<cjc<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public ere(cjc<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public erg.a a(eox $$0, erh $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return erg.a.b;
      } else {
         $$0.a(b, 0, 0, 0, 32, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         cjc<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         cfz $$4 = $$3.h();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.a($$1.b().s.B_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? erg.a.b : erg.a.a;
      }
   }

   private void a(cjc<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(erh $$0, cjc<?> $$1) {
      ere $$2 = $$0.a(ere.class, c);
      if ($$2 == null) {
         $$0.a(new ere($$1));
      } else {
         $$2.a($$1);
      }
   }
}
