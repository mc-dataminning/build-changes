import java.util.List;
import javax.annotation.Nullable;

public class cuv extends csu {
   public cuv(csu.a $$0) {
      super($$0);
   }

   @Override
   public wu o(csz $$0) {
      cwg $$1 = $$0.a(ka.H);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!ayu.h($$2)) {
            return wu.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(csz $$0, @Nullable dad $$1, List<wu> $$2, cuq $$3) {
      cwg $$4 = $$0.a(ka.H);
      if ($$4 != null) {
         if (!ayu.h($$4.e())) {
            $$2.add(wu.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wu.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avm.c.b(this));
      return bpn.a($$3, $$0.x_());
   }

   public static boolean a(csz $$0, ed $$1, @Nullable clh $$2) {
      cwg $$3 = $$0.a(ka.H);
      if ($$3 != null && !$$3.g()) {
         cwg $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(ka.H, $$4);
            return true;
         }

         $$0.b(ka.H, $$3.c());
      }

      return false;
   }
}
