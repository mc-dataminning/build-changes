import java.util.List;
import javax.annotation.Nullable;

public class cwr extends cul {
   public cwr(cul.a $$0) {
      super($$0);
   }

   @Override
   public wz n(cuq $$0) {
      cyb $$1 = $$0.a(kq.J);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azl.h($$2)) {
            return wz.b($$2);
         }
      }

      return super.n($$0);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      cyb $$4 = $$0.a(kq.J);
      if ($$4 != null) {
         if (!azl.h($$4.e())) {
            $$2.add(wz.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wz.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avz.c.b(this));
      return bqs.a($$3, $$0.x_());
   }

   public static boolean a(cuq $$0, et $$1, @Nullable cmx $$2) {
      cyb $$3 = $$0.a(kq.J);
      if ($$3 != null && !$$3.g()) {
         cyb $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kq.J, $$4);
            return true;
         }

         $$0.b(kq.J, $$3.c());
      }

      return false;
   }
}
