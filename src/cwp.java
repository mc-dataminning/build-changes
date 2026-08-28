import java.util.List;
import javax.annotation.Nullable;

public class cwp extends cuj {
   public cwp(cuj.a $$0) {
      super($$0);
   }

   @Override
   public wy n(cuo $$0) {
      cxz $$1 = $$0.a(kq.J);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azk.h($$2)) {
            return wy.b($$2);
         }
      }

      return super.n($$0);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      cxz $$4 = $$0.a(kq.J);
      if ($$4 != null) {
         if (!azk.h($$4.e())) {
            $$2.add(wy.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wy.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      cuo $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avy.c.b(this));
      return bqr.a($$3, $$0.x_());
   }

   public static boolean a(cuo $$0, et $$1, @Nullable cmv $$2) {
      cxz $$3 = $$0.a(kq.J);
      if ($$3 != null && !$$3.g()) {
         cxz $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kq.J, $$4);
            return true;
         }

         $$0.b(kq.J, $$3.c());
      }

      return false;
   }
}
