import java.util.List;
import javax.annotation.Nullable;

public class cvy extends ctv {
   public cvy(ctv.a $$0) {
      super($$0);
   }

   @Override
   public wu n(cua $$0) {
      cxi $$1 = $$0.a(kn.J);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!aza.h($$2)) {
            return wu.b($$2);
         }
      }

      return super.n($$0);
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      cxi $$4 = $$0.a(kn.J);
      if ($$4 != null) {
         if (!aza.h($$4.e())) {
            $$2.add(wu.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wu.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqe<cua> a(dcd $$0, cmh $$1, bqc $$2) {
      cua $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avp.c.b(this));
      return bqe.a($$3, $$0.x_());
   }

   public static boolean a(cua $$0, eq $$1, @Nullable cmh $$2) {
      cxi $$3 = $$0.a(kn.J);
      if ($$3 != null && !$$3.g()) {
         cxi $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kn.J, $$4);
            return true;
         }

         $$0.b(kn.J, $$3.c());
      }

      return false;
   }
}
