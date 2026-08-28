import java.util.List;
import javax.annotation.Nullable;

public class cwl extends cui {
   public cwl(cui.a $$0) {
      super($$0);
   }

   @Override
   public xo o(cun $$0) {
      cxw $$1 = $$0.a(km.I);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!azt.h($$2)) {
            return xo.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(cun $$0, cui.b $$1, List<xo> $$2, cwg $$3) {
      cxw $$4 = $$0.a(km.I);
      if ($$4 != null) {
         if (!azt.h($$4.e())) {
            $$2.add(xo.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xo.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bqt<cun> a(dbw $$0, cmv $$1, bqr $$2) {
      cun $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awj.c.b(this));
      return bqt.a($$3, $$0.x_());
   }

   public static boolean a(cun $$0, ep $$1, @Nullable cmv $$2) {
      cxw $$3 = $$0.a(km.I);
      if ($$3 != null && !$$3.g()) {
         cxw $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(km.I, $$4);
            return true;
         }

         $$0.b(km.I, $$3.c());
      }

      return false;
   }
}
