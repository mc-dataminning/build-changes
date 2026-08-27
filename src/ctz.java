import java.util.List;
import javax.annotation.Nullable;

public class ctz extends cry {
   public ctz(cry.a $$0) {
      super($$0);
   }

   @Override
   public ws o(csd $$0) {
      cvj $$1 = $$0.a(jz.A);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!ayr.h($$2)) {
            return ws.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(csd $$0, @Nullable czu $$1, List<ws> $$2, ctu $$3) {
      cvj $$4 = $$0.a(jz.A);
      if ($$4 != null) {
         if (!ayr.h($$4.e())) {
            $$2.add(ws.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(ws.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avj.c.b(this));
      return bor.a($$3, $$0.x_());
   }

   public static boolean a(csd $$0, ec $$1, @Nullable ckl $$2) {
      cvj $$3 = $$0.a(jz.A);
      if ($$3 != null && !$$3.g()) {
         cvj $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(jz.A, $$4);
            return true;
         }

         $$0.b(jz.A, $$3.c());
      }

      return false;
   }
}
