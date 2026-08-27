import java.util.List;
import javax.annotation.Nullable;

public class ctn extends crn {
   public ctn(crn.a $$0) {
      super($$0);
   }

   @Override
   public wi o(crs $$0) {
      cuv $$1 = $$0.a(jr.A);
      if ($$1 != null) {
         String $$2 = $$1.c().a();
         if (!ayh.h($$2)) {
            return wi.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(crs $$0, @Nullable czg $$1, List<wi> $$2, cti $$3) {
      cuv $$4 = $$0.a(jr.A);
      if ($$4 != null) {
         if (!ayh.h($$4.d())) {
            $$2.add(wi.a("book.byAuthor", $$4.d()).a(n.h));
         }

         $$2.add(wi.c("book.generation." + $$4.e()).a(n.h));
      }
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(auz.c.b(this));
      return bog.a($$3, $$0.x_());
   }

   public static boolean a(crs $$0, dv $$1, @Nullable cka $$2) {
      cuv $$3 = $$0.a(jr.A);
      if ($$3 != null && !$$3.g()) {
         cuv $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(jr.A, $$4);
            return true;
         }

         $$0.b(jr.A, $$3.b());
      }

      return false;
   }
}
