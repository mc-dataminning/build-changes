import java.util.List;
import javax.annotation.Nullable;

public class cte extends cre {
   public cte(cre.a $$0) {
      super($$0);
   }

   @Override
   public wg o(crj $$0) {
      cum $$1 = $$0.a(jp.A);
      if ($$1 != null) {
         String $$2 = $$1.c().a();
         if (!ayf.h($$2)) {
            return wg.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(crj $$0, @Nullable cyx $$1, List<wg> $$2, csz $$3) {
      cum $$4 = $$0.a(jp.A);
      if ($$4 != null) {
         if (!ayf.h($$4.d())) {
            $$2.add(wg.a("book.byAuthor", $$4.d()).a(n.h));
         }

         $$2.add(wg.c("book.generation." + $$4.e()).a(n.h));
      }
   }

   @Override
   public bob<crj> a(cyx $$0, cjt $$1, bnz $$2) {
      crj $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(auw.c.b(this));
      return bob.a($$3, $$0.x_());
   }

   public static boolean a(crj $$0, du $$1, @Nullable cjt $$2) {
      cum $$3 = $$0.a(jp.A);
      if ($$3 != null && !$$3.g()) {
         cum $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(jp.A, $$4);
            return true;
         }

         $$0.b(jp.A, $$3.b());
      }

      return false;
   }
}
