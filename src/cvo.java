import java.util.ArrayList;
import java.util.List;

public class cvo extends ctx {
   public static final int a = 160;

   public cvo(ctx.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuc $$0, ctx.b $$1, List<wu> $$2, cvv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bro> $$4 = new ArrayList<>();
         cxf $$5 = $$0.a(kn.H, cxf.a);

         for (cxf.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwd.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cuc a(cuc $$0, dcf $$1, btb $$2) {
      cxf $$3 = $$0.a(kn.H, cxf.a);

      for (cxf.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      return super.a($$0, $$1, $$2);
   }
}
