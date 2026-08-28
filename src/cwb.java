import java.util.List;
import javax.annotation.Nullable;

public class cwb extends cty {
   public cwb(cty.a $$0) {
      super($$0);
   }

   @Override
   public wu n(cud $$0) {
      cxl $$1 = $$0.a(kn.J);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azd.h($$2)) {
            return wu.b($$2);
         }
      }

      return super.n($$0);
   }

   @Override
   public void a(cud $$0, cty.b $$1, List<wu> $$2, cvw $$3) {
      cxl $$4 = $$0.a(kn.J);
      if ($$4 != null) {
         if (!azd.h($$4.e())) {
            $$2.add(wu.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wu.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avr.c.b(this));
      return bqi.a($$3, $$0.x_());
   }

   public static boolean a(cud $$0, eq $$1, @Nullable cml $$2) {
      cxl $$3 = $$0.a(kn.J);
      if ($$3 != null && !$$3.g()) {
         cxl $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kn.J, $$4);
            return true;
         }

         $$0.b(kn.J, $$3.c());
      }

      return false;
   }
}
