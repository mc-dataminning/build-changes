import java.util.List;
import javax.annotation.Nullable;

public class cyj extends cwj {
   public cyj(cwj.a $$0) {
      super($$0);
   }

   @Override
   public void a(cwn $$0, cwj.b $$1, List<wo> $$2, cyf $$3) {
      czv $$4 = $$0.a(kv.T);
      if ($$4 != null) {
         if (!azv.h($$4.e())) {
            $$2.add(wo.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wo.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bsi a(dgg $$0, cov $$1, bsh $$2) {
      cwn $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awj.c.b(this));
      return bsi.a;
   }

   public static boolean a(cwn $$0, ex $$1, @Nullable cov $$2) {
      czv $$3 = $$0.a(kv.T);
      if ($$3 != null && !$$3.g()) {
         czv $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kv.T, $$4);
            return true;
         }

         $$0.b(kv.T, $$3.c());
      }

      return false;
   }
}
