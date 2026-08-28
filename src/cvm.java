import java.util.ArrayList;
import java.util.List;

public class cvm extends ctv {
   public static final int a = 160;

   public cvm(ctv.a $$0) {
      super($$0);
   }

   @Override
   public void a(cua $$0, ctv.b $$1, List<wu> $$2, cvt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<brl> $$4 = new ArrayList<>();
         cxd $$5 = $$0.a(kn.H, cxd.a);

         for (cxd.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwb.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cua a(cua $$0, dcd $$1, bsy $$2) {
      cxd $$3 = $$0.a(kn.H, cxd.a);

      for (cxd.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fL() ? $$0 : new cua(cud.pq);
   }
}
