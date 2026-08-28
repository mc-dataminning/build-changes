import java.util.List;
import javax.annotation.Nullable;

public class cyk extends cwk {
   public cyk(cwk.a $$0) {
      super($$0);
   }

   @Override
   public void a(cwo $$0, cwk.b $$1, List<wp> $$2, cyg $$3) {
      czw $$4 = $$0.a(kv.T);
      if ($$4 != null) {
         if (!azw.h($$4.e())) {
            $$2.add(wp.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wp.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      cwo $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awk.c.b(this));
      return bsj.a;
   }

   public static boolean a(cwo $$0, ex $$1, @Nullable cow $$2) {
      czw $$3 = $$0.a(kv.T);
      if ($$3 != null && !$$3.g()) {
         czw $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kv.T, $$4);
            return true;
         }

         $$0.b(kv.T, $$3.c());
      }

      return false;
   }
}
