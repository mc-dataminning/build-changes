import java.util.List;
import javax.annotation.Nullable;

public class cwi extends cuf {
   public cwi(cuf.a $$0) {
      super($$0);
   }

   @Override
   public xl o(cuk $$0) {
      cxt $$1 = $$0.a(km.I);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azq.h($$2)) {
            return xl.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(cuk $$0, cuf.b $$1, List<xl> $$2, cwd $$3) {
      cxt $$4 = $$0.a(km.I);
      if ($$4 != null) {
         if (!azq.h($$4.e())) {
            $$2.add(xl.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xl.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awg.c.b(this));
      return bqq.a($$3, $$0.x_());
   }

   public static boolean a(cuk $$0, ep $$1, @Nullable cms $$2) {
      cxt $$3 = $$0.a(km.I);
      if ($$3 != null && !$$3.g()) {
         cxt $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(km.I, $$4);
            return true;
         }

         $$0.b(km.I, $$3.c());
      }

      return false;
   }
}
