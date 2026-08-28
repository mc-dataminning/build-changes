import java.util.ArrayList;
import java.util.List;

public class cwd extends cuj {
   public static final int a = 160;

   public cwd(cuj.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bry> $$4 = new ArrayList<>();
         cxu $$5 = $$0.a(kq.H, cxu.a);

         for (cxu.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cws.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cuo a(cuo $$0, dcu $$1, btl $$2) {
      cxu $$3 = $$0.a(kq.H, cxu.a);

      for (cxu.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      return super.a($$0, $$1, $$2);
   }
}
