import java.util.List;
import javax.annotation.Nullable;

public class cwm extends cuj {
   public cwm(cuj.a $$0) {
      super($$0);
   }

   @Override
   public xo o(cuo $$0) {
      cxx $$1 = $$0.a(km.J);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azu.h($$2)) {
            return xo.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      cxx $$4 = $$0.a(km.J);
      if ($$4 != null) {
         if (!azu.h($$4.e())) {
            $$2.add(xo.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xo.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awj.c.b(this));
      return bqu.a($$3, $$0.x_());
   }

   public static boolean a(cuo $$0, ep $$1, @Nullable cmw $$2) {
      cxx $$3 = $$0.a(km.J);
      if ($$3 != null && !$$3.g()) {
         cxx $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(km.J, $$4);
            return true;
         }

         $$0.b(km.J, $$3.c());
      }

      return false;
   }
}
