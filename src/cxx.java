import java.util.List;
import javax.annotation.Nullable;

public class cxx extends cvx {
   public cxx(cvx.a $$0) {
      super($$0);
   }

   @Override
   public void a(cwb $$0, cvx.b $$1, List<xi> $$2, cxt $$3) {
      czj $$4 = $$0.a(ku.T);
      if ($$4 != null) {
         if (!bah.h($$4.e())) {
            $$2.add(xi.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xi.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awv.c.b(this));
      return bsd.a;
   }

   public static boolean a(cwb $$0, ew $$1, @Nullable com $$2) {
      czj $$3 = $$0.a(ku.T);
      if ($$3 != null && !$$3.g()) {
         czj $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ku.T, $$4);
            return true;
         }

         $$0.b(ku.T, $$3.c());
      }

      return false;
   }
}
