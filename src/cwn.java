import java.util.List;
import javax.annotation.Nullable;

public class cwn extends cuk {
   public cwn(cuk.a $$0) {
      super($$0);
   }

   @Override
   public xp o(cup $$0) {
      cxy $$1 = $$0.a(km.J);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azv.h($$2)) {
            return xp.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(cup $$0, cuk.b $$1, List<xp> $$2, cwi $$3) {
      cxy $$4 = $$0.a(km.J);
      if ($$4 != null) {
         if (!azv.h($$4.e())) {
            $$2.add(xp.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xp.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqv<cup> a(dby $$0, cmx $$1, bqt $$2) {
      cup $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awk.c.b(this));
      return bqv.a($$3, $$0.x_());
   }

   public static boolean a(cup $$0, ep $$1, @Nullable cmx $$2) {
      cxy $$3 = $$0.a(km.J);
      if ($$3 != null && !$$3.g()) {
         cxy $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(km.J, $$4);
            return true;
         }

         $$0.b(km.J, $$3.c());
      }

      return false;
   }
}
