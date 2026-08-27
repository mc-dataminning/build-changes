import com.google.common.collect.Lists;
import java.util.List;

public class fbv implements fbx {
   private static final aiy a = new aiy("toast/recipe");
   private static final long d = 5000L;
   private static final vq e = vq.c("recipe.toast.title");
   private static final vq f = vq.c("recipe.toast.description");
   private final List<csh<?>> g = Lists.newArrayList();
   private long h;
   private boolean i;

   public fbv(csh<?> $$0) {
      this.g.add($$0);
   }

   @Override
   public fbx.a a(ezb $$0, fby $$1, long $$2) {
      if (this.i) {
         this.h = $$2;
         this.i = false;
      }

      if (this.g.isEmpty()) {
         return fbx.a.b;
      } else {
         $$0.a(a, 0, 0, this.a(), this.b());
         $$0.a($$1.b().h, e, 30, 7, -11534256, false);
         $$0.a($$1.b().h, f, 30, 18, -16777216, false);
         csh<?> $$3 = this.g.get((int)((double)$$2 / Math.max(1.0, 5000.0 * $$1.c() / (double)this.g.size()) % (double)this.g.size()));
         cpd $$4 = $$3.b().g();
         $$0.c().a();
         $$0.c().b(0.6F, 0.6F, 1.0F);
         $$0.b($$4, 3, 3);
         $$0.c().b();
         $$0.b($$3.b().a($$1.b().r.I_()), 8, 8);
         return (double)($$2 - this.h) >= 5000.0 * $$1.c() ? fbx.a.b : fbx.a.a;
      }
   }

   private void a(csh<?> $$0) {
      this.g.add($$0);
      this.i = true;
   }

   public static void a(fby $$0, csh<?> $$1) {
      fbv $$2 = $$0.a(fbv.class, b);
      if ($$2 == null) {
         $$0.a(new fbv($$1));
      } else {
         $$2.a($$1);
      }
   }
}
