import java.util.List;
import javax.annotation.Nullable;

public class cym extends cwm {
   public cym(cwm.a $$0) {
      super($$0);
   }

   @Override
   public void a(cwq $$0, cwm.b $$1, List<wp> $$2, cyi $$3) {
      czy $$4 = $$0.a(kv.T);
      if ($$4 != null) {
         if (!azw.h($$4.e())) {
            $$2.add(wp.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wp.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awk.c.b(this));
      return bsl.a;
   }

   public static boolean a(cwq $$0, ex $$1, @Nullable coy $$2) {
      czy $$3 = $$0.a(kv.T);
      if ($$3 != null && !$$3.g()) {
         czy $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kv.T, $$4);
            return true;
         }

         $$0.b(kv.T, $$3.c());
      }

      return false;
   }
}
