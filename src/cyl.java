import java.util.List;
import javax.annotation.Nullable;

public class cyl extends cwl {
   public cyl(cwl.a $$0) {
      super($$0);
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wp> $$2, cyh $$3) {
      czx $$4 = $$0.a(kv.T);
      if ($$4 != null) {
         if (!azw.h($$4.e())) {
            $$2.add(wp.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wp.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bsk a(dgi $$0, cox $$1, bsj $$2) {
      cwp $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awk.c.b(this));
      return bsk.a;
   }

   public static boolean a(cwp $$0, ex $$1, @Nullable cox $$2) {
      czx $$3 = $$0.a(kv.T);
      if ($$3 != null && !$$3.g()) {
         czx $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kv.T, $$4);
            return true;
         }

         $$0.b(kv.T, $$3.c());
      }

      return false;
   }
}
