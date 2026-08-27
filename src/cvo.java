import java.util.List;
import javax.annotation.Nullable;

public class cvo extends ctl {
   public cvo(ctl.a $$0) {
      super($$0);
   }

   @Override
   public wx o(ctq $$0) {
      cwz $$1 = $$0.a(kb.I);
      if ($$1 != null) {
         String $$2 = $$1.d().a();
         if (!aza.h($$2)) {
            return wx.b($$2);
         }
      }

      return super.o($$0);
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      cwz $$4 = $$0.a(kb.I);
      if ($$4 != null) {
         if (!aza.h($$4.e())) {
            $$2.add(wx.a("book.byAuthor", $$4.e()).a(n.h));
         }

         $$2.add(wx.c("book.generation." + $$4.f()).a(n.h));
      }
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(avs.c.b(this));
      return bpx.a($$3, $$0.x_());
   }

   public static boolean a(ctq $$0, ee $$1, @Nullable cly $$2) {
      cwz $$3 = $$0.a(kb.I);
      if ($$3 != null && !$$3.g()) {
         cwz $$4 = $$3.a($$1, $$2);
         if ($$4 != null) {
            $$0.b(kb.I, $$4);
            return true;
         }

         $$0.b(kb.I, $$3.c());
      }

      return false;
   }
}
