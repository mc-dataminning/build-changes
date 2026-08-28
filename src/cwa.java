import java.util.ArrayList;
import java.util.List;

public class cwa extends cuj {
   public static final int a = 160;

   public cwa(cuj.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<xo> $$2, cwh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.b()) {
         List<bsb> $$4 = new ArrayList<>();
         cxs $$5 = $$0.a(km.H, cxs.a);

         for (cxs.a $$6 : $$5.a()) {
            $$4.add($$6.a());
         }

         cwp.a($$4, $$2::add, 1.0F, $$1.b());
      }
   }

   @Override
   public cuo a(cuo $$0, dbx $$1, bto $$2) {
      cxs $$3 = $$0.a(km.H, cxs.a);

      for (cxs.a $$4 : $$3.a()) {
         $$2.b($$4.a());
      }

      super.a($$0, $$1, $$2);
      return $$2.fP() ? $$0 : new cuo(cur.pq);
   }
}
