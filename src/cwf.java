import java.util.ArrayList;
import java.util.List;

public class cwf extends cul {
   public static final int a = 160;

   public cwf(cul.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<brz> $$4 = new ArrayList<>();
         cxw $$5 = $$0.a(kq.H, cxw.a);

         for (cxw.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwu.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cuq a(cuq $$0, dcw $$1, btn $$2) {
      cxw $$3 = $$0.a(kq.H, cxw.a);

      for (cxw.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      return super.a($$0, $$1, $$2);
   }
}
