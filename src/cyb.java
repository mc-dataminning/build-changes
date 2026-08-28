import java.util.List;
import javax.annotation.Nullable;

public class cyb extends cwb {
   public cyb(cwb.a $$0) {
      super($$0);
   }

   @Override
   public void a(cwf $$0, cwb.b $$1, List<xl> $$2, cxx $$3) {
      czn $$4 = $$0.a(ku.T);
      if ($$4 != null) {
         if (!bak.h($$4.e())) {
            $$2.add(xl.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(xl.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bsh a(dff $$0, cor $$1, bsg $$2) {
      cwf $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(awy.c.b(this));
      return bsh.a;
   }

   public static boolean a(cwf $$0, ew $$1, @Nullable cor $$2) {
      czn $$3 = $$0.a(ku.T);
      if ($$3 != null && !$$3.g()) {
         czn $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ku.T, $$4);
            return true;
         }

         $$0.b(ku.T, $$3.c());
      }

      return false;
   }
}
