import java.util.List;
import javax.annotation.Nullable;

public class cwp extends cum {
   public cwp(cum.a $$0) {
      super($$0);
   }

   @Override
   public xp o(cur $$0) {
      cya $$1 = $$0.a(km.J);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azv.h($$2)) {
            return xp.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(cur $$0, cum.b $$1, List<xp> $$2, cwk $$3) {
      cya $$4 = $$0.a(km.J);
      if ($$4 != null) {
         if (!azv.h($$4.e())) {
            $$2.add(xp.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xp.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqx<cur> a(dca $$0, cmz $$1, bqv $$2) {
      cur $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awk.c.b(this));
      return bqx.a($$3, $$0.x_());
   }

   public static boolean a(cur $$0, ep $$1, @Nullable cmz $$2) {
      cya $$3 = $$0.a(km.J);
      if ($$3 != null && !$$3.g()) {
         cya $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(km.J, $$4);
            return true;
         }

         $$0.b(km.J, $$3.c());
      }

      return false;
   }
}
