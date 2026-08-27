import java.util.List;
import javax.annotation.Nullable;

public class cvm extends ctj {
   public cvm(ctj.a $$0) {
      super($$0);
   }

   @Override
   public wx o(cto $$0) {
      cwx $$1 = $$0.a(kb.I);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!ayy.h($$2)) {
            return wx.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(cto $$0, @Nullable dax $$1, List<wx> $$2, cvh $$3) {
      cwx $$4 = $$0.a(kb.I);
      if ($$4 != null) {
         if (!ayy.h($$4.e())) {
            $$2.add(wx.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wx.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avr.c.b(this));
      return bpv.a($$3, $$0.x_());
   }

   public static boolean a(cto $$0, ee $$1, @Nullable clw $$2) {
      cwx $$3 = $$0.a(kb.I);
      if ($$3 != null && !$$3.g()) {
         cwx $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kb.I, $$4);
            return true;
         }

         $$0.b(kb.I, $$3.c());
      }

      return false;
   }
}
